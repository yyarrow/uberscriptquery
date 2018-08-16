/*
 * Copyright (c) 2017 Uber Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.uber.uberscriptquery.execution;

import com.uber.uberscriptquery.antlr4.parsing.StanderStatementAssigment;
import com.uber.uberscriptquery.antlr4.parsing.StatementAssignment;
import com.uber.uberscriptquery.util.CredentialProvider;
import com.uber.uberscriptquery.util.SparkUtils;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class JdbcSqlInputStatementExecutor implements SqlInputStatementExecutor {
    private static final Logger logger = LoggerFactory.getLogger(JdbcSqlInputStatementExecutor.class);

    @Override
    public Dataset<Row> execute(SparkSession sparkSession, StanderStatementAssigment statementAssignment, CredentialProvider credentialManager) {
        logger.info("Running query by sql jdbc: " + statementAssignment);
        Map<String, String> queryConfig = statementAssignment.getQueryConfig();
        String connectionString = queryConfig.get(StanderStatementAssigment.QUERY_CONFIG_CONNECTION_STRING);
        String passwordFile = queryConfig.get(StanderStatementAssigment.QUERY_CONFIG_PASSWORD_FILE);
        String passwordEntry = queryConfig.get(StanderStatementAssigment.QUERY_CONFIG_PASSWORD_ENTRY);
        String password = credentialManager.getPassword(passwordFile, passwordEntry);
        if (password != null) {
            connectionString = connectionString.replace("[password]", password);
        }
        return SparkUtils.readJdbc(connectionString, statementAssignment.getQueryStatement(), sparkSession);
    }
}

package com.uber.uberscriptquery.execution;

import com.uber.uberscriptquery.antlr4.parsing.UdfStatementAssigment;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class UdfSqlInpuStatementExecutor {
    public Dataset<Row> execute(SparkSession sparkSession, UdfStatementAssigment statementAssignment){
        return null;
    }
}

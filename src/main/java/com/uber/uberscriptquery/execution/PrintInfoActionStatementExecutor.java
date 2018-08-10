package com.uber.uberscriptquery.execution;

import com.uber.uberscriptquery.antlr4.parsing.ActionStatement;
import com.uber.uberscriptquery.jdbc.DataSetResult;
import com.uber.uberscriptquery.util.CredentialProvider;
import com.uber.uberscriptquery.util.SparkUtils;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintInfoActionStatementExecutor implements ActionStatementExecutor{
    public static final String ACTION_NAME = "print";
    private static final Logger logger = LoggerFactory.getLogger(PrintInfoActionStatementExecutor.class);

    @Override
    public Object execute(SparkSession sparkSession, ActionStatement actionStatement, CredentialProvider credentialManager) {


        String info = actionStatement.getParamValues().get(0).getValue().toString();
        System.out.println("------------------------------");
        System.out.println("INFO: " + info);
        System.out.println("------------------------------");

        return null;
    }
}

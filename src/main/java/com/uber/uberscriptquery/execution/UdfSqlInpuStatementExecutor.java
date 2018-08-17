package com.uber.uberscriptquery.execution;

import com.uber.uberscriptquery.antlr4.parsing.UdfStatementAssigment;
import com.uber.uberscriptquery.execution.udf.UdfExecutor;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.util.List;

public class UdfSqlInpuStatementExecutor {
    public Dataset<Row> execute(SparkSession sparkSession, UdfStatementAssigment statementAssignment)throws RuntimeException{
        List<String> params = statementAssignment.getParams();
        String SourceTableAlias = statementAssignment.getSourceTableAlias();
        String udfName = statementAssignment.getUdfName();
        Dataset<Row> sourceDf = sparkSession.sql("select * from " + SourceTableAlias);
        Dataset<Row> df = UdfExecutor.execute(udfName, params, sparkSession, sourceDf);
        return df;
    }
}

package com.uber.uberscriptquery.antlr4.parsing;

import com.uber.uberscriptquery.util.SqlType;

import java.util.HashMap;
import java.util.Map;

public class StanderStatementAssigment extends StatementAssignment{
    public static final String QUERY_CONFIG_CONNECTION_STRING = "connectionString";
    public static final String QUERY_CONFIG_PASSWORD_FILE = "passwordFile";
    public static final String QUERY_CONFIG_PASSWORD_ENTRY = "passwordEntry";

    private Map<String, String> queryConfig = new HashMap<>();
    private String queryStatement;

    public StanderStatementAssigment(){
        super();
        this.sqlType = SqlType.STANDER;
    }

    public Map<String, String> getQueryConfig() {
        return queryConfig;
    }

    public void setQueryConfig(Map<String, String> queryConfig) {
        this.queryConfig = queryConfig;
    }

    public String getQueryStatement() {
        return queryStatement;
    }

    public void setQueryStatement(String queryStatement) {
        this.queryStatement = queryStatement;
    }

    @Override
    public String toString() {
        return "StatementAssignment{" +
                "tableAlias='" + tableAlias + '\'' +
                ", queryType='" + queryType + '\'' +
                ", queryEngine='" + queryEngine + '\'' +
                ", queryText='" + queryText + '\'' +
                ", queryConfig=" + queryConfig +
                ", queryStatement='" + queryStatement + '\'' +
                '}';
    }
}

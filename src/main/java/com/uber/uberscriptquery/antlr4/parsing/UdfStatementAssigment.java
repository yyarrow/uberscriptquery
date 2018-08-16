package com.uber.uberscriptquery.antlr4.parsing;

import com.uber.uberscriptquery.util.SqlType;

import java.util.List;

public class UdfStatementAssigment extends StanderStatementAssigment{
    private String udfName;
    private List<String> params;
    private String sourceTableAlias;

    public UdfStatementAssigment(){
        super();
        this.sqlType = SqlType.UDF;
    }

    public void setUdfName(String udfName) {
        this.udfName = udfName;
    }
    public String getUdfName(){
        return this.udfName;
    }
    public void setParams(List<String> params){
        this.params = params;
    }
    public List<String> getParams(){
        return params;
    }
    public void setSourceTableAlias(String sourceTableAlias){
        this.sourceTableAlias = sourceTableAlias;
    }
    public String getSourceTableAlias(){
        return this.sourceTableAlias;
    }
}

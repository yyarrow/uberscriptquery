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

package com.uber.uberscriptquery.jdbc;

import org.apache.commons.lang3.StringUtils;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import java.util.ArrayList;
import java.util.List;

public class DataSetResult {
    private List<String> columnNames = new ArrayList<>();
    private List<List<Object>> rows = new ArrayList<>();
    private Dataset<Row> df;

    public void setDf(Dataset<Row> df){
        this.df = df;
    }

    public Dataset<Row> getDf(){
        return df;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    public List<List<Object>> getRows() {
        return rows;
    }

    public void setRows(List<List<Object>> rows) {
        this.rows = rows;
    }

    public String getSingleStringValue() {
        if (rows == null || rows.isEmpty()) {
            return "";
        }
        List<Object> values = rows.get(0);
        if (values == null || values.isEmpty()) {
            return "";
        }
        return String.valueOf(values.get(0));
    }

    public void print() {
        System.out.println(StringUtils.join(columnNames, ", "));
        for (List<Object> row : rows) {
            System.out.println(StringUtils.join(row, ", "));
        }
    }
}

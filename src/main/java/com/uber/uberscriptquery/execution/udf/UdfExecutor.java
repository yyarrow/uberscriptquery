package com.uber.uberscriptquery.execution.udf;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.lang.reflect.Method;
import java.util.List;

public class UdfExecutor {
    public static String mapClassPath = "com.jd.ads.data.track.SDLTest.udf.MapUdf";
    public static Dataset<Row> execute(String udfName, List<String> params, SparkSession spark, Dataset<Row> sourceDf)throws RuntimeException{
        if(udfName == null || spark == null){
            throw new RuntimeException("Error: udfName is null!");
        }
        if(udfName.equals("map")){
            if(params == null || params.size() == 0){
                throw new RuntimeException("Error: map need at least one param");
            }
            try {
                //TODO: need support different source
                Class trackClass = Class.forName(mapClassPath);
                //TODO: how to support funtion with diffrent param type
                Method func = trackClass.getDeclaredMethod(params.get(0), Dataset.class);
                Dataset<Row> result = (Dataset<Row>) func.invoke(trackClass.newInstance(),sourceDf);
                result.printSchema();
                return result;
            }catch (Exception e){
                e.printStackTrace();
                throw new RuntimeException("Error: failed invoke method: " + params.get(0) + " of class: " + mapClassPath);
            }
        }else if(udfName.equals("exclude")){
            return null;
        }else if(udfName.equals("filter")){
            return null;
        }else{
            throw new RuntimeException("Error: unsupported udfName: "+udfName);
        }
    }
}

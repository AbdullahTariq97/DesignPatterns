package com.sky.designpatterns.classbuilderstaticmethod;
// We want to create two types of metrics DTO.
// Type1: success metrics dto : boolean=true
// Type2: failure : boolean=false
// The type of metric dto is indicated by boolean instance variable
// The two metrics types of metrics require different fields to be set
// Type 1: metricName, streamType, proposition, territory and value
// Type 2: metricName, streamType

// Variable declaration: setting variable name and type
// Variable initializaton: setting the value of the variable

// You can use DTOs to send information between classes

public class MetricsDto {

    private boolean success;
    private String metricName;
    private String streamType;
    private String proposition;
    private String territory;
    private double value;

    // Solution 1 - The problem can be potentially solved with two overloaded contructors that accepts different parameters
    // since the instantiator can incorrectly set the value of the boolean, you dont accept a boolean as parameter but set it in construtor yourself
    // Drawback - constructors need to have the same name as class, so they cannot have name indicative of what they do differently

//    public MetricsDto(String metricName, String streamType){
//        this.success = true;
//        this.metricName = metricName;
//        this.streamType = streamType;
//    }
//
//    public MetricsDto(String metricName, String streamType, String proposition, String territory, double value){
//        this.success = false;
//        this.metricName = metricName;
//        this.streamType = streamType;
//        this.proposition = proposition;
//        this.territory = territory;
//        this.value = value;
//    }

    // Solution 2 - you can create two void method. These set the MetricDto's instance variables. These can be named differently.
    // drawback - it is awakward to set instance variables for a class once it has already been instantiated
//    public void setFailureMetricsDto(String metricName, String streamType){
//        this.success = true;
//        this.metricName = metricName;
//        this.streamType = streamType;
//    }
//
//    public void setSuccessMetricsDto(String metricName, String streamType, String proposition, String territory, double value){
//        this.success = false;
//        this.metricName = metricName;
//        this.streamType = streamType;
//        this.proposition = proposition;
//        this.territory = territory;
//        this.value = value;
//    }

    // Solution 3 - create two static method. they return instance of the class. metricsDto instance is created using zero args consutructor
    // values of metricDto set inside static method. can be named differently

    public static MetricsDto createFailureMetricDto(String metricName, String streamType){
        MetricsDto metricsDto = new MetricsDto();
        metricsDto.setSuccess(false);
        metricsDto.setMetricName(metricName);
        metricsDto.setStreamType(streamType);
        return  metricsDto;
    }

    public static MetricsDto createSuccessMetricDto(String metricName,String proposition, String territory, String streamType, double value){
        MetricsDto metricsDto = new MetricsDto();
        metricsDto.setSuccess(true);
        metricsDto.setMetricName(metricName);
        metricsDto.setProposition(proposition);
        metricsDto.setTerritory(territory);
        metricsDto.setStreamType(streamType);
        metricsDto.setValue(value);
        return  metricsDto;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricsName) {
        this.metricName = metricsName;
    }

    public String getStreamType() {
        return streamType;
    }

    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    public String getProposition() {
        return proposition;
    }

    public void setProposition(String proposition) {
        this.proposition = proposition;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

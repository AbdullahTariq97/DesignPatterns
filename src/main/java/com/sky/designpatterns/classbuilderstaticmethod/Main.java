package com.sky.designpatterns.classbuilderstaticmethod;

public class Main {
    public static void main(String[] args) {
        // Making a sucessfull metricsDto
        MetricsDto metricsDtoSuccess = MetricsDto.createSuccessMetricDto("conviva_metric","sky-tv","uk","linear",5);

        // Making a failure metricDto
        MetricsDto metricsDtoFailure = MetricsDto.createFailureMetricDto("conviva_failure_metric","all");

        System.out.println(metricsDtoSuccess.isSuccess());
        System.out.println(metricsDtoFailure.isSuccess());
    }
}

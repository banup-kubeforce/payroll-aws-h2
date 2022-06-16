package com.kubeforce.payrollaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PayrollAwsApplication {

    public static void main(String[] args) {
        FunctionalSpringApplication.run(PayrollAwsApplication.class, args);
    }
    @Bean
    public EmployeeFunction exampleFunction() {
        return new EmployeeFunction();
    }

    @Bean
    public EmployeeConsumer employeeConsumer() {
        return new EmployeeConsumer();
    }

    @Bean
    public EmployeeSupplier exampleSupplier() {
        return new EmployeeSupplier();
    }


}

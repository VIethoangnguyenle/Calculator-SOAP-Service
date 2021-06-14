package com.hoang.testSOAPService2.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CalculatorClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.hoang.testSOAPService2.client");
        return marshaller;
    }
    @Bean
    public Jaxb2Marshaller marshaller2(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.hoang.testSOAPService2.convertClient");
        return marshaller;
    }
    @Bean
    public CalculatorClient numberConvertClient(Jaxb2Marshaller marshaller){
        CalculatorClient client = new CalculatorClient();
        client.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public NumberConvertClient numberConvertClient2(Jaxb2Marshaller marshaller2){
        NumberConvertClient client = new NumberConvertClient();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        client.setMarshaller(marshaller2);
        client.setUnmarshaller(marshaller2);
        return client;
    }

}

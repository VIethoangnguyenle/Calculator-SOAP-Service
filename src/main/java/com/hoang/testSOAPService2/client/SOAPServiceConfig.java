package com.hoang.testSOAPService2.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SOAPServiceConfig {

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
    public Jaxb2Marshaller marshaller3(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.hoang.testSOAPService2.flexcore");
        return marshaller;
    }

    @Bean
    public CalculatorClient numberCalculateClient(Jaxb2Marshaller marshaller){
        CalculatorClient client = new CalculatorClient();
        client.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public NumberConvertClient numberConvertClient(Jaxb2Marshaller marshaller2){
        NumberConvertClient client = new NumberConvertClient();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        client.setMarshaller(marshaller2);
        client.setUnmarshaller(marshaller2);
        return client;
    }

    @Bean
    public BDSClient bdsClient(Jaxb2Marshaller marshaller3){
        BDSClient client2 = new BDSClient();
        client2.setDefaultUri("http://bds.vm.sunshinetech.ai/BDSService/BDSService.svc");
        client2.setMarshaller(marshaller3);
        client2.setUnmarshaller(marshaller3);
        return client2;
    }
}

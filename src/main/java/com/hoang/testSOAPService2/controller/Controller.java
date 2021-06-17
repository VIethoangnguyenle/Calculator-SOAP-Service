package com.hoang.testSOAPService2.controller;


import com.hoang.testSOAPService2.client.*;
import com.hoang.testSOAPService2.convertClient.NumberToDollars;
import com.hoang.testSOAPService2.convertClient.NumberToDollarsResponse;
import com.hoang.testSOAPService2.convertClient.NumberToWords;
import com.hoang.testSOAPService2.convertClient.NumberToWordsResponse;
import com.hoang.testSOAPService2.flexcore.MessageBytes;
import com.hoang.testSOAPService2.flexcore.MessageBytesResponse;
import com.hoang.testSOAPService2.model.Factory;
import com.hoang.testSOAPService2.model.FlexcoreFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("")
public class Controller {
    private static final String url = "http://www.dneonline.com/calculator.asmx";
    private static final String url2 = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso";
    private static final String urlBDS = "http://bds.vm.sunshinetech.ai/BDSService/BDSService.svc";

    @Autowired
    private CalculatorClient client;
    @Autowired
    private BDSClient bdsClient;

    @PostMapping(value = "/add")
    public AddResponse addNumber(@RequestBody Add add){
        Factory factory = new Factory();
        Add request = factory.createAdd();
        request.setIntA(add.getIntA());
        request.setIntB(add.getIntB());
        return client.getNumberAdd(url, request);
    }

    @PostMapping(value = "/divide")
    public DivideResponse divideNumber(@RequestBody Divide divide){
        Factory factory = new Factory();
        Divide request = factory.createDivide();
        request.setIntA(divide.getIntA());
        request.setIntB(divide.getIntB());
        return client.getNumberDivide(url, request);
    }

    @PostMapping(value = "/multiply")
    public MultiplyResponse multiplyNumber(@RequestBody Multiply multiply){
        Factory factory = new Factory();
        Multiply request = factory.createMultiply();
        request.setIntA(multiply.getIntA());
        request.setIntB(multiply.getIntB());
        return client.getNumberMultiply(url, request);
    }
    @PostMapping(value = "/subtract")
    public SubtractResponse subtractNumber(@RequestBody Subtract subtract){
        Factory factory = new Factory();
        Subtract request = factory.createSubtract();
        request.setIntA(subtract.getIntA());
        request.setIntB(subtract.getIntB());
        return client.getNumberSubtract(url, request);
    }

    @Autowired
    private NumberConvertClient numberConvertClient;

    @PostMapping(value = "/words", consumes = MediaType.ALL_VALUE)
    public NumberToWordsResponse numberToWordsResponse(@RequestBody NumberToWords number){
        Factory request = new Factory();
        NumberToWords sub = request.createNumberToWords();
        sub.setUbiNum(number.getUbiNum());
        System.out.println(sub.getUbiNum());
        return numberConvertClient.getNumberConvert(url2, sub);
    }

    @PostMapping(value = "/dollar", consumes = MediaType.ALL_VALUE)
    public NumberToDollarsResponse numberToDollarsResponse(@RequestBody NumberToDollars number){
        Factory request = new Factory();
        NumberToDollars sub = request.createNumberToDollars();
        sub.setDNum(number.getDNum());
        System.out.println(number.getDNum());
        return numberConvertClient.getNumberConvertDollar(url2, sub);
    }

    @PostMapping(value = "/flexcore", consumes = MediaType.ALL_VALUE)
    public MessageBytesResponse getFlexcoreResponse(@RequestBody String a){
        FlexcoreFactory request = new FlexcoreFactory();
        MessageBytes messageBytes = request.createMessageBytes();
        byte[] byteArray = a.getBytes(StandardCharsets.UTF_8);

        messageBytes.setPvArrByteMessage(new JAXBElement(new QName("http://bds.vm.sunshinetech.ai/BDSService/",
                "pvArrByteMessage"), Byte.class, byteArray));

        System.out.println(messageBytes.getPvArrByteMessage());

        return bdsClient.getMessageBytesResponse(urlBDS, messageBytes);
    }
}

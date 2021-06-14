package com.hoang.testSOAPService2.controller;


import com.hoang.testSOAPService2.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Controller {
    private static final String url = "http://www.dneonline.com/calculator.asmx";

    @Autowired
    private CalculatorClient client;

    @PostMapping(value = "/add")
    public AddResponse addNumber(@RequestBody Add add){
        ObjectFactory factory = new ObjectFactory();
        Add request = factory.createAdd();
        request.setIntA(add.getIntA());
        request.setIntB(add.getIntB());
        return client.getNumberAdd(url, request);
    }

    @PostMapping(value = "/divide")
    public DivideResponse divideNumber(@RequestBody Divide divide){
        ObjectFactory factory = new ObjectFactory();
        Divide request = factory.createDivide();
        request.setIntA(divide.getIntA());
        request.setIntB(divide.getIntB());
        return client.getNumberDivide(url, request);
    }

    @PostMapping(value = "/multiply")
    public MultiplyResponse multiplyNumber(@RequestBody Multiply multiply){
        ObjectFactory factory = new ObjectFactory();
        Multiply request = factory.createMultiply();
        request.setIntA(multiply.getIntA());
        request.setIntB(multiply.getIntB());
        return client.getNumberMultiply(url, request);
    }
    @PostMapping(value = "/subtract")
    public SubtractResponse subtractNumber(@RequestBody Subtract subtract){
        ObjectFactory factory = new ObjectFactory();
        Subtract request = factory.createSubtract();
        request.setIntA(subtract.getIntA());
        request.setIntB(subtract.getIntB());
        return client.getNumberSubtract(url, request);
    }
}

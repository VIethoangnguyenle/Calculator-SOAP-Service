package com.hoang.testSOAPService2.client;


import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.transform.TransformerException;
import java.io.IOException;

public class CalculatorClient extends WebServiceGatewaySupport {

    public AddResponse getNumberAdd(String url, Add request){
        AddResponse response = (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        ((SoapMessage)message).setSoapAction("http://tempuri.org/Add");
                    }
                });
        return response;
    }

    public DivideResponse getNumberDivide(String url, Divide request){
        DivideResponse reponse = (DivideResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        ((SoapMessage) message).setSoapAction("http://tempuri.org/Divide");
                    }
                });
        return reponse;
    }

    public MultiplyResponse getNumberMultiply(String url, Multiply request){
        MultiplyResponse response = (MultiplyResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        ((SoapMessage) message).setSoapAction("http://tempuri.org/Multiply");
                    }
                });
        return response;
    }

    public SubtractResponse getNumberSubtract(String url, Subtract request){
        SubtractResponse response = (SubtractResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        ((SoapMessage) message).setSoapAction("http://tempuri.org/Subtract");
                    }
                });
        return response;
    }
}

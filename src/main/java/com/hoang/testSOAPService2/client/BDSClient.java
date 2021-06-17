package com.hoang.testSOAPService2.client;

import com.hoang.testSOAPService2.flexcore.MessageBytes;
import com.hoang.testSOAPService2.flexcore.MessageBytesResponse;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.transform.TransformerException;
import java.io.IOException;

public class BDSClient extends WebServiceGatewaySupport {
    public MessageBytesResponse getMessageBytesResponse(String url, MessageBytes request){
        MessageBytesResponse response = (MessageBytesResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        ((SoapMessage)message).setSoapAction("http://tempuri.org/IBDSService/MessageBytes");
                    }
                });
        return response;
    }
}

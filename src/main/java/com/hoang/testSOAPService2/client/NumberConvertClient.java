package com.hoang.testSOAPService2.client;

import com.hoang.testSOAPService2.convertClient.NumberToDollars;
import com.hoang.testSOAPService2.convertClient.NumberToDollarsResponse;
import com.hoang.testSOAPService2.convertClient.NumberToWords;
import com.hoang.testSOAPService2.convertClient.NumberToWordsResponse;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.transform.TransformerException;
import java.io.IOException;

public class NumberConvertClient extends WebServiceGatewaySupport {
    public NumberToWordsResponse getNumberConvert(String url, NumberToWords request){
        NumberToWordsResponse response = (NumberToWordsResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        ((SoapMessage)message).setSoapAction("");
                    }
                });
        return response;
    }

    public NumberToDollarsResponse getNumberConvertDollar(String url, NumberToDollars request){
        NumberToDollarsResponse response = (NumberToDollarsResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        ((SoapMessage)message).setSoapAction("");
                    }
                });
        return response;
    }
}

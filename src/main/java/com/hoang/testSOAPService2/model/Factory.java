package com.hoang.testSOAPService2.model;

import com.hoang.testSOAPService2.client.*;
import com.hoang.testSOAPService2.convertClient.NumberToDollars;
import com.hoang.testSOAPService2.convertClient.NumberToDollarsResponse;
import com.hoang.testSOAPService2.convertClient.NumberToWords;
import com.hoang.testSOAPService2.convertClient.NumberToWordsResponse;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class Factory {
    public Factory() {
    }

    public Multiply createMultiply() {
        return new Multiply();
    }

    public Divide createDivide() {
        return new Divide();
    }

    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    public Subtract createSubtract() {
        return new Subtract();
    }

    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    public Add createAdd() {
        return new Add();
    }

    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }


    public NumberToDollarsResponse createNumberToDollarsResponse() {
        return new NumberToDollarsResponse();
    }

    public NumberToWords createNumberToWords() {
        return new NumberToWords();
    }

    public NumberToDollars createNumberToDollars() {
        return new NumberToDollars();
    }

    public NumberToWordsResponse createNumberToWordsResponse() {
        return new NumberToWordsResponse();
    }
}
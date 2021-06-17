package com.hoang.testSOAPService2.model;

import com.hoang.testSOAPService2.flexcore.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;

@XmlRegistry
public class FlexcoreFactory {
    private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private static final QName _MessageBytesPvArrByteMessage_QNAME = new QName("http://tempuri.org/", "pv_arrByteMessage");
    private static final QName _PlaceOrderPvStrMessage_QNAME = new QName("http://tempuri.org/", "pv_strMessage");

    public FlexcoreFactory() {
    }

    public MessageBytes createMessageBytes() {
        return new MessageBytes();
    }

    public DoWorkResponse createDoWorkResponse() {
        return new DoWorkResponse();
    }

    public PlaceOrder createPlaceOrder() {
        return new PlaceOrder();
    }

    public Message createMessage() {
        return new Message();
    }

    public PlaceOrderResponse createPlaceOrderResponse() {
        return new PlaceOrderResponse();
    }

    public MessageResponse createMessageResponse() {
        return new MessageResponse();
    }

    public MessageBytesResponse createMessageBytesResponse() {
        return new MessageBytesResponse();
    }

    public DoWork createDoWork() {
        return new DoWork();
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "unsignedLong"
    )
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement(_UnsignedLong_QNAME, BigInteger.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "unsignedByte"
    )
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement(_UnsignedByte_QNAME, Short.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "unsignedInt"
    )
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement(_UnsignedInt_QNAME, Long.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "char"
    )
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement(_Char_QNAME, Integer.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "short"
    )
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement(_Short_QNAME, Short.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "guid"
    )
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement(_Guid_QNAME, String.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "unsignedShort"
    )
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement(_UnsignedShort_QNAME, Integer.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "decimal"
    )
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement(_Decimal_QNAME, BigDecimal.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "boolean"
    )
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement(_Boolean_QNAME, Boolean.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "duration"
    )
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement(_Duration_QNAME, Duration.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "base64Binary"
    )
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement(_Base64Binary_QNAME, byte[].class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "int"
    )
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement(_Int_QNAME, Integer.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "long"
    )
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement(_Long_QNAME, Long.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "anyURI"
    )
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement(_AnyURI_QNAME, String.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "float"
    )
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement(_Float_QNAME, Float.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "dateTime"
    )
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement(_DateTime_QNAME, XMLGregorianCalendar.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "byte"
    )
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement(_Byte_QNAME, Byte.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "double"
    )
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement(_Double_QNAME, Double.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "QName"
    )
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement(_QName_QNAME, QName.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "anyType"
    )
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement(_AnyType_QNAME, Object.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
            name = "string"
    )
    public JAXBElement<String> createString(String value) {
        return new JAXBElement(_String_QNAME, String.class, (Class)null, value);
    }

    @XmlElementDecl(
            namespace = "http://tempuri.org/",
            name = "pv_arrByteMessage",
            scope = MessageBytes.class
    )
    public JAXBElement<byte[]> createMessageBytesPvArrByteMessage(byte[] value) {
        return new JAXBElement(_MessageBytesPvArrByteMessage_QNAME, byte[].class, MessageBytes.class, value);
    }

    @XmlElementDecl(
            namespace = "http://tempuri.org/",
            name = "pv_strMessage",
            scope = PlaceOrder.class
    )
    public JAXBElement<String> createPlaceOrderPvStrMessage(String value) {
        return new JAXBElement(_PlaceOrderPvStrMessage_QNAME, String.class, PlaceOrder.class, value);
    }

    @XmlElementDecl(
            namespace = "http://tempuri.org/",
            name = "pv_strMessage",
            scope = Message.class
    )
    public JAXBElement<String> createMessagePvStrMessage(String value) {
        return new JAXBElement(_PlaceOrderPvStrMessage_QNAME, String.class, Message.class, value);
    }

    @XmlElementDecl(
            namespace = "http://tempuri.org/",
            name = "pv_strMessage",
            scope = PlaceOrderResponse.class
    )
    public JAXBElement<String> createPlaceOrderResponsePvStrMessage(String value) {
        return new JAXBElement(_PlaceOrderPvStrMessage_QNAME, String.class, PlaceOrderResponse.class, value);
    }

    @XmlElementDecl(
            namespace = "http://tempuri.org/",
            name = "pv_strMessage",
            scope = MessageResponse.class
    )
    public JAXBElement<String> createMessageResponsePvStrMessage(String value) {
        return new JAXBElement(_PlaceOrderPvStrMessage_QNAME, String.class, MessageResponse.class, value);
    }

    @XmlElementDecl(
            namespace = "http://tempuri.org/",
            name = "pv_arrByteMessage",
            scope = MessageBytesResponse.class
    )
    public JAXBElement<byte[]> createMessageBytesResponsePvArrByteMessage(byte[] value) {
        return new JAXBElement(_MessageBytesPvArrByteMessage_QNAME, byte[].class, MessageBytesResponse.class, value);
    }
}

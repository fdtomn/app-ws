
package com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllUserArrResponse_QNAME = new QName("http://service.ws.maven.nyx.com/", "getAllUserArrResponse");
    private final static QName _GetAllUser_QNAME = new QName("http://service.ws.maven.nyx.com/", "getAllUser");
    private final static QName _GetMapInfoResponse_QNAME = new QName("http://service.ws.maven.nyx.com/", "getMapInfoResponse");
    private final static QName _GetAllUserArr_QNAME = new QName("http://service.ws.maven.nyx.com/", "getAllUserArr");
    private final static QName _GetAllUserResponse_QNAME = new QName("http://service.ws.maven.nyx.com/", "getAllUserResponse");
    private final static QName _GetMapInfo_QNAME = new QName("http://service.ws.maven.nyx.com/", "getMapInfo");
    private final static QName _SayHello_QNAME = new QName("http://service.ws.maven.nyx.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://service.ws.maven.nyx.com/", "sayHelloResponse");
    private final static QName _User_QNAME = new QName("http://service.ws.maven.nyx.com/", "user");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link GetAllUserArr }
     * 
     */
    public GetAllUserArr createGetAllUserArr() {
        return new GetAllUserArr();
    }

    /**
     * Create an instance of {@link GetAllUser }
     * 
     */
    public GetAllUser createGetAllUser() {
        return new GetAllUser();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link GetMapInfoResponse }
     * 
     */
    public GetMapInfoResponse createGetMapInfoResponse() {
        return new GetMapInfoResponse();
    }

    /**
     * Create an instance of {@link MapConvertor }
     * 
     */
    public MapConvertor createMapConvertor() {
        return new MapConvertor();
    }

    /**
     * Create an instance of {@link GetAllUserArrResponse }
     * 
     */
    public GetAllUserArrResponse createGetAllUserArrResponse() {
        return new GetAllUserArrResponse();
    }

    /**
     * Create an instance of {@link GetAllUserResponse }
     * 
     */
    public GetAllUserResponse createGetAllUserResponse() {
        return new GetAllUserResponse();
    }

    /**
     * Create an instance of {@link GetMapInfo }
     * 
     */
    public GetMapInfo createGetMapInfo() {
        return new GetMapInfo();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserArrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "getAllUserArrResponse")
    public JAXBElement<GetAllUserArrResponse> createGetAllUserArrResponse(GetAllUserArrResponse value) {
        return new JAXBElement<GetAllUserArrResponse>(_GetAllUserArrResponse_QNAME, GetAllUserArrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "getAllUser")
    public JAXBElement<GetAllUser> createGetAllUser(GetAllUser value) {
        return new JAXBElement<GetAllUser>(_GetAllUser_QNAME, GetAllUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMapInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "getMapInfoResponse")
    public JAXBElement<GetMapInfoResponse> createGetMapInfoResponse(GetMapInfoResponse value) {
        return new JAXBElement<GetMapInfoResponse>(_GetMapInfoResponse_QNAME, GetMapInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserArr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "getAllUserArr")
    public JAXBElement<GetAllUserArr> createGetAllUserArr(GetAllUserArr value) {
        return new JAXBElement<GetAllUserArr>(_GetAllUserArr_QNAME, GetAllUserArr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "getAllUserResponse")
    public JAXBElement<GetAllUserResponse> createGetAllUserResponse(GetAllUserResponse value) {
        return new JAXBElement<GetAllUserResponse>(_GetAllUserResponse_QNAME, GetAllUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMapInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "getMapInfo")
    public JAXBElement<GetMapInfo> createGetMapInfo(GetMapInfo value) {
        return new JAXBElement<GetMapInfo>(_GetMapInfo_QNAME, GetMapInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.maven.nyx.com/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

}

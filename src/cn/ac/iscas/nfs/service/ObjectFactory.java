
package cn.ac.iscas.nfs.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.ac.iscas.nfs.service package. 
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

    private final static QName _GetRelatedObjectsResponse_QNAME = new QName("http://service.nfs.iscas.ac.cn/", "getRelatedObjectsResponse");
    private final static QName _GetBugIdByReq_QNAME = new QName("http://service.nfs.iscas.ac.cn/", "getBugIdByReq");
    private final static QName _GetReqIdByBugResponse_QNAME = new QName("http://service.nfs.iscas.ac.cn/", "getReqIdByBugResponse");
    private final static QName _GetBugIdByReqResponse_QNAME = new QName("http://service.nfs.iscas.ac.cn/", "getBugIdByReqResponse");
    private final static QName _CreateBugReqRel_QNAME = new QName("http://service.nfs.iscas.ac.cn/", "createBugReqRel");
    private final static QName _GetRelatedObjects_QNAME = new QName("http://service.nfs.iscas.ac.cn/", "getRelatedObjects");
    private final static QName _CreateBugReqRelResponse_QNAME = new QName("http://service.nfs.iscas.ac.cn/", "createBugReqRelResponse");
    private final static QName _GetReqIdByBug_QNAME = new QName("http://service.nfs.iscas.ac.cn/", "getReqIdByBug");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.ac.iscas.nfs.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBugIdByReq }
     * 
     */
    public GetBugIdByReq createGetBugIdByReq() {
        return new GetBugIdByReq();
    }

    /**
     * Create an instance of {@link GetReqIdByBugResponse }
     * 
     */
    public GetReqIdByBugResponse createGetReqIdByBugResponse() {
        return new GetReqIdByBugResponse();
    }

    /**
     * Create an instance of {@link GetRelatedObjectsResponse }
     * 
     */
    public GetRelatedObjectsResponse createGetRelatedObjectsResponse() {
        return new GetRelatedObjectsResponse();
    }

    /**
     * Create an instance of {@link CreateBugReqRelResponse }
     * 
     */
    public CreateBugReqRelResponse createCreateBugReqRelResponse() {
        return new CreateBugReqRelResponse();
    }

    /**
     * Create an instance of {@link GetReqIdByBug }
     * 
     */
    public GetReqIdByBug createGetReqIdByBug() {
        return new GetReqIdByBug();
    }

    /**
     * Create an instance of {@link GetBugIdByReqResponse }
     * 
     */
    public GetBugIdByReqResponse createGetBugIdByReqResponse() {
        return new GetBugIdByReqResponse();
    }

    /**
     * Create an instance of {@link GetRelatedObjects }
     * 
     */
    public GetRelatedObjects createGetRelatedObjects() {
        return new GetRelatedObjects();
    }

    /**
     * Create an instance of {@link CreateBugReqRel }
     * 
     */
    public CreateBugReqRel createCreateBugReqRel() {
        return new CreateBugReqRel();
    }

    /**
     * Create an instance of {@link JsonObject }
     * 
     */
    public JsonObject createJsonObject() {
        return new JsonObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatedObjectsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nfs.iscas.ac.cn/", name = "getRelatedObjectsResponse")
    public JAXBElement<GetRelatedObjectsResponse> createGetRelatedObjectsResponse(GetRelatedObjectsResponse value) {
        return new JAXBElement<GetRelatedObjectsResponse>(_GetRelatedObjectsResponse_QNAME, GetRelatedObjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBugIdByReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nfs.iscas.ac.cn/", name = "getBugIdByReq")
    public JAXBElement<GetBugIdByReq> createGetBugIdByReq(GetBugIdByReq value) {
        return new JAXBElement<GetBugIdByReq>(_GetBugIdByReq_QNAME, GetBugIdByReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReqIdByBugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nfs.iscas.ac.cn/", name = "getReqIdByBugResponse")
    public JAXBElement<GetReqIdByBugResponse> createGetReqIdByBugResponse(GetReqIdByBugResponse value) {
        return new JAXBElement<GetReqIdByBugResponse>(_GetReqIdByBugResponse_QNAME, GetReqIdByBugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBugIdByReqResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nfs.iscas.ac.cn/", name = "getBugIdByReqResponse")
    public JAXBElement<GetBugIdByReqResponse> createGetBugIdByReqResponse(GetBugIdByReqResponse value) {
        return new JAXBElement<GetBugIdByReqResponse>(_GetBugIdByReqResponse_QNAME, GetBugIdByReqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBugReqRel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nfs.iscas.ac.cn/", name = "createBugReqRel")
    public JAXBElement<CreateBugReqRel> createCreateBugReqRel(CreateBugReqRel value) {
        return new JAXBElement<CreateBugReqRel>(_CreateBugReqRel_QNAME, CreateBugReqRel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatedObjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nfs.iscas.ac.cn/", name = "getRelatedObjects")
    public JAXBElement<GetRelatedObjects> createGetRelatedObjects(GetRelatedObjects value) {
        return new JAXBElement<GetRelatedObjects>(_GetRelatedObjects_QNAME, GetRelatedObjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBugReqRelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nfs.iscas.ac.cn/", name = "createBugReqRelResponse")
    public JAXBElement<CreateBugReqRelResponse> createCreateBugReqRelResponse(CreateBugReqRelResponse value) {
        return new JAXBElement<CreateBugReqRelResponse>(_CreateBugReqRelResponse_QNAME, CreateBugReqRelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReqIdByBug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nfs.iscas.ac.cn/", name = "getReqIdByBug")
    public JAXBElement<GetReqIdByBug> createGetReqIdByBug(GetReqIdByBug value) {
        return new JAXBElement<GetReqIdByBug>(_GetReqIdByBug_QNAME, GetReqIdByBug.class, null, value);
    }

}

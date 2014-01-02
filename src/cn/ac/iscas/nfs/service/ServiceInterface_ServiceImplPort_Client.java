
package cn.ac.iscas.nfs.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2014-01-02T15:48:00.351+08:00
 * Generated source version: 3.0.0-milestone1
 * 
 */
public final class ServiceInterface_ServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.nfs.iscas.ac.cn/", "ServiceImpl");

    private ServiceInterface_ServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ServiceImpl.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ServiceImpl ss = new ServiceImpl(wsdlURL, SERVICE_NAME);
        ServiceInterface port = ss.getServiceImplPort();  
        
        {
        System.out.println("Invoking createBugReqRel...");
        java.lang.String _createBugReqRel_arg0 = "";
        java.lang.String _createBugReqRel_arg1 = "";
        java.lang.String _createBugReqRel_arg2 = "";
        java.lang.String _createBugReqRel_arg3 = "";
        boolean _createBugReqRel__return = port.createBugReqRel(_createBugReqRel_arg0, _createBugReqRel_arg1, _createBugReqRel_arg2, _createBugReqRel_arg3);
        System.out.println("createBugReqRel.result=" + _createBugReqRel__return);


        }
        {
        System.out.println("Invoking getRelatedObjects...");
        java.lang.String _getRelatedObjects_arg0 = "";
        java.lang.String _getRelatedObjects_arg1 = "";
        cn.ac.iscas.nfs.service.JsonObject _getRelatedObjects__return = port.getRelatedObjects(_getRelatedObjects_arg0, _getRelatedObjects_arg1);
        System.out.println("getRelatedObjects.result=" + _getRelatedObjects__return);


        }
        {
        System.out.println("Invoking getBugIdByReq...");
        java.lang.String _getBugIdByReq_arg0 = "";
        java.lang.String _getBugIdByReq_arg1 = "";
        java.lang.String _getBugIdByReq_arg2 = "";
        java.util.List<java.lang.String> _getBugIdByReq__return = port.getBugIdByReq(_getBugIdByReq_arg0, _getBugIdByReq_arg1, _getBugIdByReq_arg2);
        System.out.println("getBugIdByReq.result=" + _getBugIdByReq__return);


        }
        {
        System.out.println("Invoking getReqIdByBug...");
        java.lang.String _getReqIdByBug_arg0 = "";
        java.lang.String _getReqIdByBug_arg1 = "";
        java.lang.String _getReqIdByBug_arg2 = "";
        java.util.List<java.lang.String> _getReqIdByBug__return = port.getReqIdByBug(_getReqIdByBug_arg0, _getReqIdByBug_arg1, _getReqIdByBug_arg2);
        System.out.println("getReqIdByBug.result=" + _getReqIdByBug__return);


        }

        System.exit(0);
    }

}

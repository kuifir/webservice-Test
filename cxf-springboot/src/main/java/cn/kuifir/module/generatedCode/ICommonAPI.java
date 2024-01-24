package cn.kuifir.module.generatedCode;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-03-06T11:13:20.683+08:00
 * Generated source version: 3.5.1
 *
 */
@WebService(targetNamespace = "http://mobile.cnooc.com.cn/api/common", name = "ICommonAPI")
@XmlSeeAlso({ObjectFactory.class})
public interface ICommonAPI {

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getOrganUserTreeRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getOrganUserTreeResponse")
    @RequestWrapper(localName = "getOrganUserTree", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetOrganUserTree")
    @ResponseWrapper(localName = "getOrganUserTreeResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetOrganUserTreeResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getOrganUserTree(

        @WebParam(name = "queryBy", targetNamespace = "")
        java.lang.String queryBy,
        @WebParam(name = "parentOrganId", targetNamespace = "")
        int parentOrganId
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/setAppWhiteListRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/setAppWhiteListResponse")
    @RequestWrapper(localName = "setAppWhiteList", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.SetAppWhiteList")
    @ResponseWrapper(localName = "setAppWhiteListResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.SetAppWhiteListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String setAppWhiteList(

        @WebParam(name = "whiteList", targetNamespace = "")
        java.util.List<cn.kuifir.module.generatedCode.WhiteListItem> whiteList
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/authenticateRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/authenticateResponse")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.AuthenticateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String authenticate(

        @WebParam(name = "account", targetNamespace = "")
        java.lang.String account,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/pushNotifyRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/pushNotifyResponse")
    @RequestWrapper(localName = "pushNotify", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.PushNotify")
    @ResponseWrapper(localName = "pushNotifyResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.PushNotifyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String pushNotify(

        @WebParam(name = "senderAccount", targetNamespace = "")
        java.lang.String senderAccount,
        @WebParam(name = "recipientAccount", targetNamespace = "")
        java.lang.String recipientAccount,
        @WebParam(name = "notifyType", targetNamespace = "")
        cn.kuifir.module.generatedCode.NotifyType notifyType,
        @WebParam(name = "message", targetNamespace = "")
        java.lang.String message,
        @WebParam(name = "extraInfo", targetNamespace = "")
        cn.kuifir.module.generatedCode.PushNotify.ExtraInfo extraInfo
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/queryHyydyCloudDataRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/queryHyydyCloudDataResponse")
    @RequestWrapper(localName = "queryHyydyCloudData", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.QueryHyydyCloudData")
    @ResponseWrapper(localName = "queryHyydyCloudDataResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.QueryHyydyCloudDataResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String queryHyydyCloudData(

        @WebParam(name = "queryBy", targetNamespace = "")
        java.lang.String queryBy,
        @WebParam(name = "account", targetNamespace = "")
        java.lang.String account,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "company", targetNamespace = "")
        java.lang.String company,
        @WebParam(name = "department", targetNamespace = "")
        java.lang.String department,
        @WebParam(name = "tel", targetNamespace = "")
        java.lang.String tel,
        @WebParam(name = "withSubCompany", targetNamespace = "")
        boolean withSubCompany
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getUserInfoRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getUserInfoResponse")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetUserInfo")
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetUserInfoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public cn.kuifir.module.generatedCode.UserInfo getUserInfo(

        @WebParam(name = "account", targetNamespace = "")
        java.lang.String account,
        @WebParam(name = "queryBy", targetNamespace = "")
        java.lang.String queryBy
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getUserAccountByTokenRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getUserAccountByTokenResponse")
    @RequestWrapper(localName = "getUserAccountByToken", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetUserAccountByToken")
    @ResponseWrapper(localName = "getUserAccountByTokenResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetUserAccountByTokenResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getUserAccountByToken(

        @WebParam(name = "token", targetNamespace = "")
        java.lang.String token
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/pushNotifyPlusRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/pushNotifyPlusResponse")
    @RequestWrapper(localName = "pushNotifyPlus", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.PushNotifyPlus")
    @ResponseWrapper(localName = "pushNotifyPlusResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.PushNotifyPlusResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String pushNotifyPlus(

        @WebParam(name = "senderAccount", targetNamespace = "")
        java.lang.String senderAccount,
        @WebParam(name = "recipientAccount", targetNamespace = "")
        java.lang.String recipientAccount,
        @WebParam(name = "notifyType", targetNamespace = "")
        cn.kuifir.module.generatedCode.NotifyType notifyType,
        @WebParam(name = "message", targetNamespace = "")
        java.lang.String message,
        @WebParam(name = "extraInfo", targetNamespace = "")
        cn.kuifir.module.generatedCode.PushNotifyPlus.ExtraInfo extraInfo
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getTicketRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getTicketResponse")
    @RequestWrapper(localName = "getTicket", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetTicket")
    @ResponseWrapper(localName = "getTicketResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetTicketResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getTicket(

        @WebParam(name = "userAccount", targetNamespace = "")
        java.lang.String userAccount
    );

    @WebMethod
    @Action(input = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getUserDetailRequest", output = "http://mobile.cnooc.com.cn/api/common/ICommonAPI/getUserDetailResponse")
    @RequestWrapper(localName = "getUserDetail", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetUserDetail")
    @ResponseWrapper(localName = "getUserDetailResponse", targetNamespace = "http://mobile.cnooc.com.cn/api/common", className = "cn.kuifir.module.generatedCode.GetUserDetailResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getUserDetail(

        @WebParam(name = "queryBy", targetNamespace = "")
        java.lang.String queryBy,
        @WebParam(name = "account", targetNamespace = "")
        java.lang.String account
    );
}

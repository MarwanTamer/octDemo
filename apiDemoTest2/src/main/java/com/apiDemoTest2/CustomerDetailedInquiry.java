package com.apiDemoTest2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class CustomerDetailedInquiry {
    public CustomerDetailedInquiry() {}

    private String dial;
    private String fromdate;
    private String todate;
    private String Lang;
    private String TransactionID;
    private String callername;

    public CustomerDetailedInquiry(
         String dial, String fromdate,
         String todate, String Lang,
         String callername, String TransactionID
    ){
        super();
        this.dial = dial;
        this.fromdate = fromdate;
        this.todate = todate;
        this.Lang = Lang;
        this.TransactionID = TransactionID;
        this.callername = callername;

    }

    public String getdial(){
        return dial;
    }
    public void setDial(String dial) {
        this.dial = dial;
    }


    public String getFromdate(){
        return fromdate;
    }
    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate(){
        return todate;
    }
    public void setTodate(String todate) {
        this.todate = todate;
    }


    public String getLang(){
        return getLang();
    }
    public void setLang(String lang) {
        this.Lang= lang;
    }

    public String getTransactionID(){
        return TransactionID;
    }
    public void setTransactionID(String TransactionID ) {
        this.TransactionID = TransactionID;
    }

    public String getCallername(){
        return callername;
    }
    public void setCallername(String callername) {
        this.callername = callername;
    }

}

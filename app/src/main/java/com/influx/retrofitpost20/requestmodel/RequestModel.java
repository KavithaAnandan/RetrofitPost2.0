package com.influx.retrofitpost20.requestmodel;

/**
 * Created by Influx on 7/22/2016.
 */

public class RequestModel {

    String Categoryid, PartnerID, PartnerPassword;

    public RequestModel(String Categoryid, String PartnerID, String PartnerPassword) {
        this.Categoryid = Categoryid;
        this.PartnerID = PartnerID;
        this.PartnerPassword = PartnerPassword;

    }
}

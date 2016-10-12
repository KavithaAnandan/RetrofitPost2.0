package com.influx.retrofitpost20.model;

/**
 * Created by Influx on 7/22/2016.
 */

public class Statusof {

    String StatusID;
    String StatusDescription;
    String Response;


    public String getStatusDescription() {
        return StatusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        StatusDescription = statusDescription;
    }

    public String getStatusID() {
        return StatusID;
    }

    public void setStatusID(String statusID) {
        StatusID = statusID;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }
}

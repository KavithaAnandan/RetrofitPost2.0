package com.influx.retrofitpost20.responsemodel;

import com.influx.retrofitpost20.model.Colors;
import com.influx.retrofitpost20.model.Statusof;

import java.util.ArrayList;

/**
 * Created by Influx on 7/22/2016.
 */
public class ResponseCode {

    String __type;
    Statusof Status;
    ArrayList<Colors> allColors;


    public Statusof getStatus() {
        return Status;
    }

    public void setStatus(Statusof status) {
        Status = status;
    }

    public String get__type() {
        return __type;
    }

    public void set__type(String __type) {
        this.__type = __type;
    }

    public ArrayList<Colors> getAllColors() {
        return allColors;
    }

    public void setAllColors(ArrayList<Colors> allColors) {
        this.allColors = allColors;
    }
}

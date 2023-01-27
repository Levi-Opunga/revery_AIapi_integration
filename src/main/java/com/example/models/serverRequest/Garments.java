
package com.example.models.serverRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Garments implements Serializable
{

    @SerializedName("tops")
    @Expose
    private String tops;
    @SerializedName("bottoms")
    @Expose
    private String bottoms;
    private final static long serialVersionUID = 9163076745193565069L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Garments() {
    }

    /**
     * 
     * @param tops
     * @param bottoms
     */
    public Garments(String tops, String bottoms) {
        super();
        this.tops = tops;
        this.bottoms = bottoms;
    }

    public String getTops() {
        return tops;
    }

    public void setTops(String tops) {
        this.tops = tops;
    }

    public String getBottoms() {
        return bottoms;
    }

    public void setBottoms(String bottoms) {
        this.bottoms = bottoms;
    }

}

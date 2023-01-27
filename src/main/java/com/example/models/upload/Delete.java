
        package com.example.models.upload;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Delete {

    @SerializedName("garment_id")
    @Expose
    private String garmentId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Delete() {
    }

    /**
     *
     * @param garmentId
     */
    public Delete(String garmentId) {
        super();
        this.garmentId = garmentId;
    }

    public String getGarmentId() {
        return garmentId;
    }

    public void setGarmentId(String garmentId) {
        this.garmentId = garmentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Delete.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("garmentId");
        sb.append('=');
        sb.append(((this.garmentId == null)?"<null>":this.garmentId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
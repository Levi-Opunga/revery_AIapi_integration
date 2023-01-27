
package com.example.models.upload;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("garment_id")
    @Expose
    private String garmentId;
    @SerializedName("success")
    @Expose
    private Boolean success;

    /**
     * No args constructor for use in serialization
     */
    public Response() {
    }

    /**
     * @param garmentId
     * @param success
     */
    public Response(String garmentId, Boolean success) {
        super();
        this.garmentId = garmentId;
        this.success = success;
    }

    public String getGarmentId() {
        return garmentId;
    }

    public void setGarmentId(String garmentId) {
        this.garmentId = garmentId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Response.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("garmentId");
        sb.append('=');
        sb.append(((this.garmentId == null) ? "<null>" : this.garmentId));
        sb.append(',');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null) ? "<null>" : this.success));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
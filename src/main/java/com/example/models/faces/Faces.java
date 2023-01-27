package com.example.models.faces;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Faces {

    @SerializedName("face_ids")
    @Expose
    private List<String> faceIds = null;
    @SerializedName("success")
    @Expose
    private Boolean success;

    /**
     * No args constructor for use in serialization
     *
     */
    public Faces() {
    }

    /**
     *
     * @param success
     * @param faceIds
     */
    public Faces(List<String> faceIds, Boolean success) {
        super();
        this.faceIds = faceIds;
        this.success = success;
    }

    public List<String> getFaceIds() {
        return faceIds;
    }

    public void setFaceIds(List<String> faceIds) {
        this.faceIds = faceIds;
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
        sb.append(Faces.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("faceIds");
        sb.append('=');
        sb.append(((this.faceIds == null)?"<null>":this.faceIds));
        sb.append(',');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null)?"<null>":this.success));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
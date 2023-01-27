
package com.example.models.serverRes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TryOn implements Serializable
{

    @SerializedName("model_metadata")
    @Expose
    private ModelMetadata modelMetadata;
    @SerializedName("success")
    @Expose
    private Boolean success;
    private final static long serialVersionUID = 306148399167911460L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TryOn() {
    }

    /**
     * 
     * @param success
     * @param modelMetadata
     */
    public TryOn(ModelMetadata modelMetadata, Boolean success) {
        super();
        this.modelMetadata = modelMetadata;
        this.success = success;
    }

    public ModelMetadata getModelMetadata() {
        return modelMetadata;
    }

    public void setModelMetadata(ModelMetadata modelMetadata) {
        this.modelMetadata = modelMetadata;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "TryOn{" +
                "modelMetadata=" + modelMetadata +
                ", success=" + success +
                '}';
    }
}


package com.example.models.serverRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ReqBody implements Serializable {

    @SerializedName("garments")
    @Expose
    private Garments garments;
    @SerializedName("shoes_id")
    @Expose
    private String shoesId;
    @SerializedName("model_id")
    @Expose
    private String modelId;
    @SerializedName("background")
    @Expose
    private String background;
    private final static long serialVersionUID = -3868991233125948203L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReqBody() {
    }

    /**
     * 
     * @param garments
     * @param shoesId
     * @param modelId
     * @param background
     */
    public ReqBody(Garments garments, String shoesId, String modelId, String background) {
        super();
        this.garments = garments;
        this.shoesId = shoesId;
        this.modelId = modelId;
        this.background = background;
    }

    public ReqBody(Garments garments, String modelId, String background) {
        this.garments = garments;
        this.modelId = modelId;
        this.background = background;
    }

    public Garments getGarments() {
        return garments;
    }

    public void setGarments(Garments garments) {
        this.garments = garments;
    }

    public String getShoesId() {
        return shoesId;
    }

    public void setShoesId(String shoesId) {
        this.shoesId = shoesId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

}

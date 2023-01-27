
package com.example.models.serverRes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ModelMetadata implements Serializable
{

    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("model_file")
    @Expose
    private String modelFile;
    @SerializedName("model_id")
    @Expose
    private String modelId;
    @SerializedName("shoes_id")
    @Expose
    private Object shoesId;
    @SerializedName("version")
    @Expose
    private String version;
    private final static long serialVersionUID = -3645648202649462955L;
private  String url ;
    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelMetadata() {
    }

    /**
     * 
     * @param shoesId
     * @param gender
     * @param modelFile
     * @param modelId
     * @param version
     */
    public ModelMetadata(String gender, String modelFile, String modelId, Object shoesId, String version) {
        super();
        this.gender = gender;
        this.modelFile = modelFile;
        this.modelId = modelId;
        this.shoesId = shoesId;
        this.version = version;
        url= "https://media.revery.ai/generated_model_image/"+modelFile+".png";
    }

    @Override
    public String toString() {
        return "ModelMetadata{" +
                "gender='" + gender + '\'' +
                ", modelFile='" + modelFile + '\'' +
                ", modelId='" + modelId + '\'' +
                ", shoesId=" + shoesId +
                ", version='" + version + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getModelFile() {
        return modelFile;
    }

    public void setModelFile(String modelFile) {
        this.modelFile = modelFile;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Object getShoesId() {
        return shoesId;
    }

    public void setShoesId(Object shoesId) {
        this.shoesId = shoesId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return "https://media.revery.ai/generated_model_image/"+modelFile+".png";
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

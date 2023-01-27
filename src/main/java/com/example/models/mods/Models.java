package com.example.models.mods;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Models {

    @SerializedName("model_files")
    @Expose
    private List<String> modelFiles = null;
    @SerializedName("models")
    @Expose
    private List<String> models = null;
    @SerializedName("success")
    @Expose
    private Boolean success;

    /**
     * No args constructor for use in serialization
     *
     */
    public Models() {
    }

    /**
     *
     * @param models
     * @param success
     * @param modelFiles
     */
    public Models(List<String> modelFiles, List<String> models, Boolean success) {
        super();
        this.modelFiles = modelFiles;
        this.models = models;
        this.success = success;
    }

    public List<String> getModelFiles() {
        return modelFiles;
    }

    public void setModelFiles(List<String> modelFiles) {
        this.modelFiles = modelFiles;
    }

    public List<String> getModels() {
        return models;
    }

    public void setModels(List<String> models) {
        this.models = models;
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
        sb.append(Models.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("modelFiles");
        sb.append('=');
        sb.append(((this.modelFiles == null)?"<null>":this.modelFiles));
        sb.append(',');
        sb.append("models");
        sb.append('=');
        sb.append(((this.models == null)?"<null>":this.models));
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
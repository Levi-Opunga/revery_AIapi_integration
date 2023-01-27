
        package com.example.models.upload;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Upload {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("bottoms_sub_category")
    @Expose
    private String bottomsSubCategory;
    @SerializedName("garment_img_url")
    @Expose
    private String garmentImgUrl;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Upload() {
    }

    /**
     *
     * @param gender
     * @param bottomsSubCategory
     * @param garmentImgUrl
     * @param category
     * @param brand
     * @param url
     */
    public Upload(String category, String gender, String brand, String bottomsSubCategory, String garmentImgUrl, String url) {
        super();
        this.category = category;
        this.gender = gender;
        this.brand = brand;
        this.bottomsSubCategory = bottomsSubCategory;
        this.garmentImgUrl = garmentImgUrl;
        this.url = url;
    }

    public Upload(String category, String gender, String brand, String bottomsSubCategory, String garmentImgUrl) {
        this.category = category;
        this.gender = gender;
        this.brand = brand;
        this.bottomsSubCategory = bottomsSubCategory;
        this.garmentImgUrl = garmentImgUrl;
    }

    public Upload(String category, String gender, String brand, String garmentImgUrl) {
        this.category = category;
        this.gender = gender;
        this.brand = brand;
        this.garmentImgUrl = garmentImgUrl;
    }

    public Upload(String category, String gender, String garmentImgUrl) {
        this.category = category;
        this.gender = gender;
        this.garmentImgUrl = garmentImgUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBottomsSubCategory() {
        return bottomsSubCategory;
    }

    public void setBottomsSubCategory(String bottomsSubCategory) {
        this.bottomsSubCategory = bottomsSubCategory;
    }

    public String getGarmentImgUrl() {
        return garmentImgUrl;
    }

    public void setGarmentImgUrl(String garmentImgUrl) {
        this.garmentImgUrl = garmentImgUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Upload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("bottomsSubCategory");
        sb.append('=');
        sb.append(((this.bottomsSubCategory == null)?"<null>":this.bottomsSubCategory));
        sb.append(',');
        sb.append("garmentImgUrl");
        sb.append('=');
        sb.append(((this.garmentImgUrl == null)?"<null>":this.garmentImgUrl));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
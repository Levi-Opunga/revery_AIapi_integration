
package com.example.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Tryon implements Serializable {
    @SerializedName("bottoms_sub_category")
    @Expose
    private String bottoms_sub_category;

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("outerwear_splittable")
    @Expose
    private Boolean outerwearSplittable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tryon() {
    }

    /**
     * 
     * @param outerwearSplittable
     * @param category
     */
    public Tryon(String bottoms_sub_category, String category, Boolean outerwearSplittable) {
        super();
        this.bottoms_sub_category = bottoms_sub_category;
        this.category = category;
        this.outerwearSplittable = outerwearSplittable;
    }
    public Tryon(String category, Boolean outerwearSplittable) {
        super();
        this.category = category;
        this.outerwearSplittable = outerwearSplittable;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getOuterwearSplittable() {
        return outerwearSplittable;
    }

    public void setOuterwearSplittable(Boolean outerwearSplittable) {
        this.outerwearSplittable = outerwearSplittable;
    }

    public String getBottoms_sub_category() {
        return bottoms_sub_category;
    }

    public void setBottoms_sub_category(String bottoms_sub_category) {
        this.bottoms_sub_category = bottoms_sub_category;
    }

    @Override
    public String toString() {
        return "Tryon{" +
                "bottoms_sub_category='" + bottoms_sub_category + '\'' +
                ", category='" + category + '\'' +
                ", outerwearSplittable=" + outerwearSplittable +
                '}';
    }
}

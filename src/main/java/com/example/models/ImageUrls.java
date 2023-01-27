
package com.example.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ImageUrls implements Serializable {

    @SerializedName("product_image")
    @Expose
    private String productImage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageUrls() {
    }

    /**
     * 
     * @param productImage
     */
    public ImageUrls(String productImage) {
        super();
        this.productImage = productImage;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "ImageUrls{" +
                "productImage='" + productImage + '\'' +
                '}';
    }
}

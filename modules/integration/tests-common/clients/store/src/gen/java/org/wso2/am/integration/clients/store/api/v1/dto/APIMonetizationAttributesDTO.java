/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * APIMonetizationAttributesDTO
 */

public class APIMonetizationAttributesDTO {
  @SerializedName("fixedPrice")
  private String fixedPrice = null;

  @SerializedName("pricePerRequest")
  private String pricePerRequest = null;

  @SerializedName("currencyType")
  private String currencyType = null;

  @SerializedName("billingCycle")
  private String billingCycle = null;

  public APIMonetizationAttributesDTO fixedPrice(String fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

   /**
   * Get fixedPrice
   * @return fixedPrice
  **/
  @ApiModelProperty(example = "10", value = "")
  public String getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(String fixedPrice) {
    this.fixedPrice = fixedPrice;
  }

  public APIMonetizationAttributesDTO pricePerRequest(String pricePerRequest) {
    this.pricePerRequest = pricePerRequest;
    return this;
  }

   /**
   * Get pricePerRequest
   * @return pricePerRequest
  **/
  @ApiModelProperty(example = "1", value = "")
  public String getPricePerRequest() {
    return pricePerRequest;
  }

  public void setPricePerRequest(String pricePerRequest) {
    this.pricePerRequest = pricePerRequest;
  }

  public APIMonetizationAttributesDTO currencyType(String currencyType) {
    this.currencyType = currencyType;
    return this;
  }

   /**
   * Get currencyType
   * @return currencyType
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public APIMonetizationAttributesDTO billingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
    return this;
  }

   /**
   * Get billingCycle
   * @return billingCycle
  **/
  @ApiModelProperty(example = "month", value = "")
  public String getBillingCycle() {
    return billingCycle;
  }

  public void setBillingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIMonetizationAttributesDTO apIMonetizationAttributes = (APIMonetizationAttributesDTO) o;
    return Objects.equals(this.fixedPrice, apIMonetizationAttributes.fixedPrice) &&
        Objects.equals(this.pricePerRequest, apIMonetizationAttributes.pricePerRequest) &&
        Objects.equals(this.currencyType, apIMonetizationAttributes.currencyType) &&
        Objects.equals(this.billingCycle, apIMonetizationAttributes.billingCycle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedPrice, pricePerRequest, currencyType, billingCycle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIMonetizationAttributesDTO {\n");
    
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    pricePerRequest: ").append(toIndentedString(pricePerRequest)).append("\n");
    sb.append("    currencyType: ").append(toIndentedString(currencyType)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


package kz.diploma.adapter.access.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.Valid;

/**
 * ClientProductResponse
 */

public class ClientProductResponse   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("pan")
  private String pan;

  @JsonProperty("pin")
  private String pin;

  @JsonProperty("cvv")
  private String cvv;

  @JsonProperty("rbs")
  private String rbs;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("inAccess")
  private Boolean inAccess;

  @JsonProperty("outAccess")
  private Boolean outAccess;

  @JsonProperty("isBlocked")
  private Boolean isBlocked;

  @JsonProperty("expiredDate")
  private Date expiredDate;

  @JsonProperty("accountResponse")
  private AccountResponse accountResponse = null;

  public ClientProductResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ClientProductResponse createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public ClientProductResponse pan(String pan) {
    this.pan = pan;
    return this;
  }

  /**
   * Get pan
   * @return pan
  */
  @ApiModelProperty(value = "")


  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public ClientProductResponse pin(String pin) {
    this.pin = pin;
    return this;
  }

  /**
   * Get pin
   * @return pin
  */
  @ApiModelProperty(value = "")


  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public ClientProductResponse cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

  /**
   * Get cvv
   * @return cvv
  */
  @ApiModelProperty(value = "")


  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public ClientProductResponse rbs(String rbs) {
    this.rbs = rbs;
    return this;
  }

  /**
   * Get rbs
   * @return rbs
  */
  @ApiModelProperty(value = "")


  public String getRbs() {
    return rbs;
  }

  public void setRbs(String rbs) {
    this.rbs = rbs;
  }

  public ClientProductResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  @ApiModelProperty(value = "")


  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ClientProductResponse inAccess(Boolean inAccess) {
    this.inAccess = inAccess;
    return this;
  }

  /**
   * Get inAccess
   * @return inAccess
  */
  @ApiModelProperty(value = "")


  public Boolean getInAccess() {
    return inAccess;
  }

  public void setInAccess(Boolean inAccess) {
    this.inAccess = inAccess;
  }

  public ClientProductResponse outAccess(Boolean outAccess) {
    this.outAccess = outAccess;
    return this;
  }

  /**
   * Get outAccess
   * @return outAccess
  */
  @ApiModelProperty(value = "")


  public Boolean getOutAccess() {
    return outAccess;
  }

  public void setOutAccess(Boolean outAccess) {
    this.outAccess = outAccess;
  }

  public ClientProductResponse isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

  /**
   * Get isBlocked
   * @return isBlocked
  */
  @ApiModelProperty(value = "")


  public Boolean getIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  public ClientProductResponse expiredDate(Date expiredDate) {
    this.expiredDate = expiredDate;
    return this;
  }

  /**
   * Get expiredDate
   * @return expiredDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public Date getExpiredDate() {
    return expiredDate;
  }

  public void setExpiredDate(Date expiredDate) {
    this.expiredDate = expiredDate;
  }

  public ClientProductResponse accountResponse(AccountResponse accountResponse) {
    this.accountResponse = accountResponse;
    return this;
  }

  /**
   * Get accountResponse
   * @return accountResponse
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountResponse getAccountResponse() {
    return accountResponse;
  }

  public void setAccountResponse(AccountResponse accountResponse) {
    this.accountResponse = accountResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientProductResponse clientProductResponse = (ClientProductResponse) o;
    return Objects.equals(this.id, clientProductResponse.id) &&
        Objects.equals(this.createdAt, clientProductResponse.createdAt) &&
        Objects.equals(this.pan, clientProductResponse.pan) &&
        Objects.equals(this.pin, clientProductResponse.pin) &&
        Objects.equals(this.cvv, clientProductResponse.cvv) &&
        Objects.equals(this.rbs, clientProductResponse.rbs) &&
        Objects.equals(this.active, clientProductResponse.active) &&
        Objects.equals(this.inAccess, clientProductResponse.inAccess) &&
        Objects.equals(this.outAccess, clientProductResponse.outAccess) &&
        Objects.equals(this.isBlocked, clientProductResponse.isBlocked) &&
        Objects.equals(this.expiredDate, clientProductResponse.expiredDate) &&
        Objects.equals(this.accountResponse, clientProductResponse.accountResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, pan, pin, cvv, rbs, active, inAccess, outAccess, isBlocked, expiredDate, accountResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientProductResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    rbs: ").append(toIndentedString(rbs)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    inAccess: ").append(toIndentedString(inAccess)).append("\n");
    sb.append("    outAccess: ").append(toIndentedString(outAccess)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
    sb.append("    expiredDate: ").append(toIndentedString(expiredDate)).append("\n");
    sb.append("    accountResponse: ").append(toIndentedString(accountResponse)).append("\n");
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


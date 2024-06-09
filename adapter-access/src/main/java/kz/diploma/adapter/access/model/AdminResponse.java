package kz.diploma.adapter.access.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * AdminResponse
 */

public class AdminResponse   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("name")
  private String name;

  @JsonProperty("lastname")
  private String lastname;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("post")
  private String post;

  @JsonProperty("registration")
  private String registration;

  @JsonProperty("password")
  private String password;

  public AdminResponse id(Integer id) {
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

  public AdminResponse surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public AdminResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdminResponse lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
  */
  @ApiModelProperty(value = "")


  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public AdminResponse phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AdminResponse post(String post) {
    this.post = post;
    return this;
  }

  /**
   * Get post
   * @return post
  */
  @ApiModelProperty(value = "")


  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public AdminResponse registration(String registration) {
    this.registration = registration;
    return this;
  }

  /**
   * Get registration
   * @return registration
  */
  @ApiModelProperty(value = "")


  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public AdminResponse password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminResponse adminResponse = (AdminResponse) o;
    return Objects.equals(this.id, adminResponse.id) &&
        Objects.equals(this.surname, adminResponse.surname) &&
        Objects.equals(this.name, adminResponse.name) &&
        Objects.equals(this.lastname, adminResponse.lastname) &&
        Objects.equals(this.phoneNumber, adminResponse.phoneNumber) &&
        Objects.equals(this.post, adminResponse.post) &&
        Objects.equals(this.registration, adminResponse.registration) &&
        Objects.equals(this.password, adminResponse.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, surname, name, lastname, phoneNumber, post, registration, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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


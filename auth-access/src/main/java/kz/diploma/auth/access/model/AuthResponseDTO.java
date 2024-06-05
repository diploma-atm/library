package kz.diploma.auth.access.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AuthResponseDTO
 */

public class AuthResponseDTO   {
  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    CLIENT("CLIENT"),
    
    ADMIN("ADMIN");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("fio")
  private String fio;

  @JsonProperty("login")
  private String login;

  @JsonProperty("authToken")
  private String authToken;

  public AuthResponseDTO role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @ApiModelProperty(value = "")


  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public AuthResponseDTO fio(String fio) {
    this.fio = fio;
    return this;
  }

  /**
   * Get fio
   * @return fio
  */
  @ApiModelProperty(value = "")


  public String getFio() {
    return fio;
  }

  public void setFio(String fio) {
    this.fio = fio;
  }

  public AuthResponseDTO login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  */
  @ApiModelProperty(value = "")


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public AuthResponseDTO authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

  /**
   * Get authToken
   * @return authToken
  */
  @ApiModelProperty(value = "")


  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthResponseDTO authResponseDTO = (AuthResponseDTO) o;
    return Objects.equals(this.role, authResponseDTO.role) &&
        Objects.equals(this.fio, authResponseDTO.fio) &&
        Objects.equals(this.login, authResponseDTO.login) &&
        Objects.equals(this.authToken, authResponseDTO.authToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, fio, login, authToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthResponseDTO {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    fio: ").append(toIndentedString(fio)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


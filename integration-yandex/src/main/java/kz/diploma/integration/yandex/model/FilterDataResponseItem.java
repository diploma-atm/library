package kz.diploma.integration.yandex.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * FilterDataResponseItem
 */

public class FilterDataResponseItem   {
  @JsonProperty("lang")
  private String lang;

  @JsonProperty("speaker")
  private String speaker;

  public FilterDataResponseItem lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(value = "")


  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public FilterDataResponseItem speaker(String speaker) {
    this.speaker = speaker;
    return this;
  }

  /**
   * Get speaker
   * @return speaker
  */
  @ApiModelProperty(value = "")


  public String getSpeaker() {
    return speaker;
  }

  public void setSpeaker(String speaker) {
    this.speaker = speaker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterDataResponseItem filterDataResponseItem = (FilterDataResponseItem) o;
    return Objects.equals(this.lang, filterDataResponseItem.lang) &&
        Objects.equals(this.speaker, filterDataResponseItem.speaker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, speaker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDataResponseItem {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    speaker: ").append(toIndentedString(speaker)).append("\n");
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


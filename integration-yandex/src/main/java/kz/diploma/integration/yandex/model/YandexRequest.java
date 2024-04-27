package kz.diploma.integration.yandex.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

/**
 * YandexRequest
 */

public class YandexRequest   {
  @JsonProperty("text")
  private String text;

  /**
   * Gets or Sets speaker
   */
  public enum SpeakerEnum {
    JOHN("JOHN"),
    
    MADI("MADI"),
    
    AMIRA("AMIRA"),
    
    MARINA("MARINA"),
    
    ANTON("ANTON");

    private String value;

    SpeakerEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SpeakerEnum fromValue(String text) {
      for (SpeakerEnum b : SpeakerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("speaker")
  private SpeakerEnum speaker;

  public YandexRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  */
  @ApiModelProperty(value = "")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public YandexRequest speaker(SpeakerEnum speaker) {
    this.speaker = speaker;
    return this;
  }

  /**
   * Get speaker
   * @return speaker
  */
  @ApiModelProperty(value = "")


  public SpeakerEnum getSpeaker() {
    return speaker;
  }

  public void setSpeaker(SpeakerEnum speaker) {
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
    YandexRequest yandexRequest = (YandexRequest) o;
    return Objects.equals(this.text, yandexRequest.text) &&
        Objects.equals(this.speaker, yandexRequest.speaker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, speaker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YandexRequest {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


package kz.diploma.integration.yandex.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

/**
 * FilterDataResponse
 */

public class FilterDataResponse   {
  @JsonProperty("speakers")
  @Valid
  private List<FilterDataResponseItem> speakers = null;

  public FilterDataResponse speakers(List<FilterDataResponseItem> speakers) {
    this.speakers = speakers;
    return this;
  }

  public FilterDataResponse addSpeakersItem(FilterDataResponseItem speakersItem) {
    if (this.speakers == null) {
      this.speakers = new ArrayList<FilterDataResponseItem>();
    }
    this.speakers.add(speakersItem);
    return this;
  }

  /**
   * Get speakers
   * @return speakers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FilterDataResponseItem> getSpeakers() {
    return speakers;
  }

  public void setSpeakers(List<FilterDataResponseItem> speakers) {
    this.speakers = speakers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterDataResponse filterDataResponse = (FilterDataResponse) o;
    return Objects.equals(this.speakers, filterDataResponse.speakers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDataResponse {\n");
    
    sb.append("    speakers: ").append(toIndentedString(speakers)).append("\n");
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


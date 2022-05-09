package quan.phung.blog.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostDTO
{
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("content")
  private String content;

  @JsonProperty("title")
  private String title;

  @JsonProperty("view")
  private Integer view;

  @JsonProperty("created_date")
  private Timestamp createdDate;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("description")
  private String description;
}

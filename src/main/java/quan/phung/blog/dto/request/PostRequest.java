package quan.phung.blog.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest
{
  @JsonProperty("content")
  private String content;

  @JsonProperty("title")
  private String title;

  @JsonProperty("tags")
  private String tags;

  @JsonProperty("description")
  private String description;
}

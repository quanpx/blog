package quan.phung.blog.dto.request;

import java.sql.Timestamp;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SearchRequest
{
  private String tags;

  private String title;

  private Timestamp fromDate;

  private Timestamp toDate;

  private String publisher;

  private Integer page;

  private Integer size;
}

package quan.phung.blog.repository;

import java.util.List;

import quan.phung.blog.dto.request.SearchRequest;
import quan.phung.blog.model.Post;

public interface PostRepositoryCustom
{
  List<Post> searchPostByFilter(SearchRequest searchRequest);
}

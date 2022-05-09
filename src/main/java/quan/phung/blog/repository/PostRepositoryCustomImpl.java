package quan.phung.blog.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import quan.phung.blog.dto.request.SearchRequest;
import quan.phung.blog.model.Post;

public class PostRepositoryCustomImpl implements PostRepositoryCustom
{
  @Autowired
  private EntityManager entityManager;

  @Override
  public List<Post> searchPostByFilter(SearchRequest searchRequest)
  {
  return null;
  }


}

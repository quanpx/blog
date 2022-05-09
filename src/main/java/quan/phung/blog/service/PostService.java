package quan.phung.blog.service;

import java.util.List;

import quan.phung.blog.dto.PostDTO;
import quan.phung.blog.dto.request.PostRequest;
import quan.phung.blog.dto.request.SearchRequest;

public interface PostService
{
  List<PostDTO> getAllPosts();

  void addPost(PostRequest postRequest);

  PostDTO getPostDetail(Integer postId);

  List<PostDTO> searchPosts(SearchRequest searchRequest);
}

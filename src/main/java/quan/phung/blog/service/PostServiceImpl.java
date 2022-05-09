package quan.phung.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import quan.phung.blog.dto.PostDTO;
import quan.phung.blog.dto.request.PostRequest;
import quan.phung.blog.dto.request.SearchRequest;
import quan.phung.blog.model.Post;
import quan.phung.blog.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService
{
  @Autowired
  private PostRepository postRepository;

  @Autowired
  private ObjectMapper objectMapper;

  @Override
  public List<PostDTO> getAllPosts()
  {
    List<Post> posts = postRepository.findAll();
    List<PostDTO> postDTOS=new ArrayList<>();
    for (Post post:posts)
    {
      PostDTO postDTO = objectMapper.convertValue(post,PostDTO.class);
      postDTOS.add(postDTO);
    }
    return postDTOS;

  }
  @Override
  public void addPost(PostRequest postRequest)
  {
    Post post = objectMapper.convertValue(postRequest,Post.class);
    postRepository.save(post);
  }

  public PostDTO getPostDetail(Integer postId)
  {
    Optional<Post> postOpt = postRepository.findById(postId);
    return postOpt.map(post -> objectMapper.convertValue(post, PostDTO.class)).orElse(null);
  }

  @Override
  public List<PostDTO> searchPosts(SearchRequest searchRequest)
  {
    return null;
  }
}

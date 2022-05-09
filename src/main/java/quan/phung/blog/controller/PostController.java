package quan.phung.blog.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import quan.phung.blog.dto.PostDTO;
import quan.phung.blog.dto.request.PostRequest;
import quan.phung.blog.dto.request.SearchRequest;
import quan.phung.blog.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController
{
  @Autowired
  private PostService postService;

  @GetMapping("/all")
  public ResponseEntity<List<PostDTO>> getAllPosts()
  {
    return ResponseEntity.ok(postService.getAllPosts());
  }

  @GetMapping("/{id}")
  public ResponseEntity<PostDTO> getPostDetail(@PathVariable(name = "id") Integer postId)
  {
    return ResponseEntity.ok(postService.getPostDetail(postId));
  }

  @GetMapping
  public ResponseEntity<List<PostDTO>> searchPosts(
    @RequestParam(name="tags") String tags,
    @RequestParam(name="title") String title,
    @RequestParam(name="fromDate")Timestamp fromDate,
    @RequestParam(name="toDate") Timestamp toDate,
    @RequestParam(name="publisher") String publisher,
    @RequestParam(name="page") Integer page,
    @RequestParam(name="size") Integer size
  )
  {
    SearchRequest searchRequest = SearchRequest.builder()
      .tags(tags)
      .title(title)
      .publisher(publisher)
      .fromDate(fromDate)
      .toDate(toDate)
      .page(page)
      .size(size)
      .build();
    return ResponseEntity.ok(postService.searchPosts(searchRequest));
  }
  @PostMapping
  public void addPost(@RequestBody PostRequest postRequest)
  {
    postService.addPost(postRequest);
  }




}

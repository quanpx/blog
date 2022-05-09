package quan.phung.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import quan.phung.blog.model.Post;
import quan.phung.blog.repository.PostRepository;

@SpringBootApplication
public class BlogApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(BlogApplication.class, args);
  }

}

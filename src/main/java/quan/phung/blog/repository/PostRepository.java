package quan.phung.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quan.phung.blog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer>
{
}

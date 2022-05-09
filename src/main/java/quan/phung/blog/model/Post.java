package quan.phung.blog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="post")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Post extends Auditable
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private Integer id;

  @Column(name="tags")
  private String tags;

  @Column(name="title")
  private String title;

  @Column(name="view",columnDefinition = "integer default 0")
  private int view;

  @Column(name="content",columnDefinition = "TEXT")
  private String content;

  @Column(name="description",columnDefinition = "TEXT")
  private String description;

  @Column(name="is_delete")
  private boolean isDelete;



}

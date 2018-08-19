import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> blog;
  String name;

  public Blog(String name) {
    this.name = name;
    blog = new ArrayList<>();
  }

  public List addBlogPost(BlogPost blogPost) {
    blog.add(blogPost);
    return blog;
  }

  public List deleteBlogPost(int index) {
    blog.remove(index);
    return blog;
  }

  public List updateBlogPost(int index, BlogPost newBlogPost) {
    blog.set(index, newBlogPost);
    return blog;
  }

  public void printTitles() {
    for (BlogPost blogPost : blog) {
      System.out.println(blogPost.title);
    }
  }

  public int getBlogSize() {
    return blog.size();
  }
}

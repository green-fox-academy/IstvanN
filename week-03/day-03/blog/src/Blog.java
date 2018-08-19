import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> blog;
  String name;

  public Blog(String name) {
    this.name = name;
    blog = new ArrayList<>();
  }
}

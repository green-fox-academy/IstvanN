public class Main {

  public static void main(String[] args) {

    BlogPost loremIpsum = new BlogPost();
    loremIpsum.title = "Lorem Ipsum";
    loremIpsum.authorName = "John Doe";
    loremIpsum.publicationDate = "2000.05.04.";
    loremIpsum.text = "Lorem ipsum dolor sit amet.";

    BlogPost waitButWhy = new BlogPost();
    waitButWhy.title = "Wait but why";
    waitButWhy.authorName = "Tim Urban";
    waitButWhy.publicationDate = "2010.10.10.";
    waitButWhy.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost trump = new BlogPost();
    trump.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    trump.authorName = "William Turton";
    trump.publicationDate = "2017.03.28.";
    trump.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
  }
}

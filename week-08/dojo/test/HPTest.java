import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class HPTest {

  @Test
  public void testWithZeroBooks() {
    List<Integer> books = new ArrayList<>();
    assertEquals(0, HP.getPrice(books));
  }

}
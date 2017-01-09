import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MarkTest{
  Mark mark;
  Swag swag;
  Thief thief;

  @Before
  public void before() {
    mark = new Mark("Bob");
    swag = new Swag();
    thief = new Thief("Dick");
  }

  @Test
  public void hasName(){
    assertEquals("Bob", mark.getName());
  }

  @Test
  public void canAddGoodsAlsoKnownAsSwag(){
    mark.addPossession(swag);
    assertEquals(1, mark.ownedStuff());
  }

}
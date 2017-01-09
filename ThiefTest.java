import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ThiefTest{
  Thief thief;
  Swag swag;

  @Before
  public void before() {
    thief = new Thief("Dick");
    swag = new Swag();
  }

  @Test
  public void hasName(){
    assertEquals("Dick", thief.getName());
  }

  @Test
  public void canStealStuff() {
    Swag swag = new Swag();
    thief.steal(swag);
    assertEquals(1, thief.stolenGoods());
  }

  @Test 
  public void startsWithEmptyLootBag() {
    assertEquals(0, thief.stolenGoods());
  }


}
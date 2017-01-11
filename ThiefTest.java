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

  // @Test
  // public void canFillLootBag() {
  //   for(int i = 0; i < 20; i++) {
  //     thief.steal(swag);
  //   }
  //   assertEquals(10, thief.stolenGoods());
  // }

  // @Test
  // public void lootBagFullAfter5Items(){
  //   for(int i = 0; i<10; i++) {
  //     thief.steal(swag);
  //   }
  //   assertEquals(true, thief.isLootBagFull());

  // }

  @Test
  public void fencingGoods() {
    thief.steal(swag);
    thief.fence();
    assertEquals(0, thief.stolenGoods());
  }

}
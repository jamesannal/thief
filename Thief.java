import java.util.*;

public class Thief{
  
  private String name;
  private ArrayList<Swagable> bag;

  public Thief(String name){
    this.name = name;
    this.bag = new ArrayList<Swagable>();
  }

  public String getName(){
    return this.name;
  }

  public void steal(Swagable stuff){
    bag.add(stuff);
  }


  public int stolenGoods() {
    return bag.size();
  }

  public void fence() {
    bag.clear();
  
  }
}
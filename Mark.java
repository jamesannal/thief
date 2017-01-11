import java.util.*;

public class Mark{

  private String name;
  private ArrayList<Swagable> swag;

  public Mark(String name){
    this.name = name;
    swag = new ArrayList<Swagable>();
  }

  public String getName(){
    return name;
  }

  public void addPossession(Swag stuff){
    swag.add(stuff);
  }

  public int ownedStuff() {
    return swag.size();
  }

}
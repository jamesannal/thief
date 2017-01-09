public class Thief{
  private String name;
  private Swag[] bag;

  public Thief(String name){
    this.name = name;
    this.bag = new Swag[10];
  }

  public String getName(){
    return this.name;
  }
}
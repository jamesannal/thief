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

  public void steal(Swag stuff){
  int nextIndex = stolenGoods();
  bag[nextIndex] = stuff;
  }


  public int stolenGoods() {
    int count = 0;
    for(Swag swag : bag) {
      if(swag != null) {
        count += 1;
      }
    }
    return count;
  }
}
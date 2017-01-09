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
    if(isLootBagFull()) return;

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

  public boolean isLootBagFull() {
    return stolenGoods() == bag.length;
  }

  public void fence() {
    for(int i = 0; i< bag.length; i++) {

      bag[i] = null;
    }
  }
}
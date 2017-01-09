public class Mark{
  private String name;
  private Swag[] swag;

  public Mark(String name){
    this.name = name;
    swag = new Swag[20];
  }

  public String getName(){
    return name;
  }

  public void addPossession(Swag stuff){
  int nextIndex = ownedStuff();
  swag[nextIndex] = stuff;
  }

  public int ownedStuff() {
    int count = 0;
    for(Swag swag : swag) {
      if(swag != null) {
        count += 1;
      }
    }
    return count;
  }

}
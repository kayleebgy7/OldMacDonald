package OldMacDonald;

public class Chick extends Animal {
    private String type;
    private String sound1;
    private String sound2;
    private int randomNum = (int)(Math.random()*2+1);

  public Chick(String type, String sound1, String sound2) {
    this.type = type;
    this.sound1 = sound1;
    this.sound2 = sound2;

  }
  public Chick() {
    this("chick", "cluck", "cheep");
  }

    public String getSound() 
    {   
        if (randomNum == 1) {
            
            return sound1;

        }
        else if (randomNum == 2) {
            return sound2;
        } 
        return sound1;
    }
    public String getType() {
       
        return type;
    }
   
}

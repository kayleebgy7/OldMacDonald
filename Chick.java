package OldMacDonald;

public class Chick extends Animal {
    private String type = "Chick";
    private String sound1 = "chuck";
    private String sound2 = "cheep";

  public Chick(String type, String sound1, String sound2) {
    this.type = type;
    this.sound1 = sound1;
    this.sound2 = sound2;

  }

    public String getSound() 
    {
        int randomNum = (int)(Math.random()*2)+0;
    
        String result = "";
        if (randomNum == 1) {
            sound1 = "chuck";
            sound1 = result;

        }
        else if (randomNum == 2) {
            sound2 = "cheep";
            sound2 = result;
        } 
        return result;
    }
    public String getType() {
       
        return type;
    }
   
}

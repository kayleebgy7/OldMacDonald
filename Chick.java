package OldMacDonald;

public class Chick extends Animal {
  //instantiates the variables as private variables of the class
    private String type;
    private String sound1;
    private String sound2;
    private int randomNum = (int)(Math.random()*2 +1);

//no argument constructor to assign values
  public Chick() {
    this("chick", "cluck", "cheep");
  }

    //assigns values to variables
  public Chick(String type, String sound1, String sound2) {
    this.type = type;
    this.sound1 = sound1;
    this.sound2 = sound2;
  }
  
    //uses the random number to choose which sound to print
    public String getSound() 
    {
        if (randomNum == 1) 
        {
            return sound1;
         }

        else if (randomNum == 2)
        {
           return sound2;
        }
        return sound1;
     }
    public String getType() {
       
        return type;
    }
   
}

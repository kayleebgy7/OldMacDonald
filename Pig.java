package OldMacDonald;
public class Pig extends Animal {
    //instianted two String variables that are assigned to the value of an open string
    private String type = "";
    private String sound = "";

    //no argument constructor to assign values
    public Pig() {
        this("Pig", "oink");
    }

    //assigns values to variables
    public Pig(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    //returns the sound of the animal
    public String getSound() 
    {
       return sound;
    }
    
    //returns the animal type
    public String getType() {
   
        return type;
    }
   
}

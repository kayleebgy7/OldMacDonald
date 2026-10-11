package OldMacDonald;
public class Cow extends Animal {
    //instantiates the variables as private variables of the class
    private String type;
    private String sound;

    //no argument constructor to assign values
    public Cow() {
        this("Cow", "moo");
    }

    //assigns values to variables
    public Cow(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    //returns the sound
    public String getSound() 
    {
       return sound;
    }
    //returns the animal type
    public String getType() {
    
        return type;
   
    }
   
}



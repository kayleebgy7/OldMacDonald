package OldMacDonald;
public class Pig extends Animal {
    private String type = "";
    private String sound = "";

    public Pig(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public String getSound() 
    {
     
       return sound;
    
    }
    public String getType() {
   
        return type;
    }
   
}

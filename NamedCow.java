package OldMacDonald;

public class NamedCow extends Cow {
    //instantiates the variable as a private variable of the class
    private String name;

    //no argument constructor to assign values
    public NamedCow() {
        this("cow", "moo", "Whole Milk");
    }

    //assigns values to variables
    public NamedCow(String type, String sound, String name) {
        super(type, sound);
        this.name = name;
    }
    
    //returns the animal type
    public String getName() {
        return name;
    }
}


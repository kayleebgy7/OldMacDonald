package OldMacDonald;
public class WholeMilk extends Cow {
    private String name;

    public WholeMilk(String type, String sound, String name) {
        super(type, sound);
        this.name = "Whole Milk";
    }
    
    public String getName() {
        return name;
    }
}

package OldMacDonald;

public class Farm {
    private Animal [] a = new Animal [3];
    Farm () {
        a [0] = new WholeMilk ("Cow " ," moo ", "Whole Milk");
        a [1] = new Chick ("Chick " ," cluck ", "cheep");
        a [2] = new Pig ("Pig " ," oink ");
    }
    public void animalSounds() {
        for ( int i = 0; i < a . length ; i ++) {
        System . out . println ( a[ i ]. getType() + " goes " + a [ i ]. getSound() ) ;
        }
        System . out . println ( "The cow is known as " +((WholeMilk)a[0]) . getName () ) ;
    }
 }


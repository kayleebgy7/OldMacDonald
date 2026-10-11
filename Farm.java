package OldMacDonald;

public class Farm {
    private Animal [] a = new Animal [3];
    Farm () {
        //creates new objects of classes to have their types, sound, and names declared
        a [0] = new NamedCow ("cow" ,"moo ", "Whole Milk");
        a [1] = new Chick ("chick" ,"cluck ", "cheep");
        a [2] = new Pig ("pig" ,"oink ");
    }
    //method for printing the type and sound for each animal along with the named cow
    public void animalSounds() {
        for ( int i = 0; i < a . length ; i++) 
            {
            System.out.println( "The " + a[i].getType() + " goes " + a[i].getSound()) ;
            }
            System.out.println("The cow is known as " +((NamedCow ) a[0]).getName()) ;
    }
 }

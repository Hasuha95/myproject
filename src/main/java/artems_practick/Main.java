package artems_practick;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){




        Animal_to_run[] animals = new Animal_to_run[2];
        animals[0] = new Horse("Gerda", 55, 55);
        animals[1] = new Horse("Mustang", 80, 65);





        ResoultRep[] resolts = new ResoultRep[10];

        // Stadium "Olimp"

        Stadium olimp = new Stadium(500);
        System.out.println("Start...!!!!");
        resolts[0] = new ResoultRep(olimp.start(animals));

        resolts[1]= new ResoultRep(olimp.start(animals));





    }
    
}

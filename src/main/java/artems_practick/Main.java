package artems_practick;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){



/*

        Animal_to_run[] animals = new Animal_to_run[2];
        animals[0] = new Horse("Gerda", 55, 55);
        animals[1] = new Horse("Mustang", 80, 65);





        ResoultRep[] resolts = new ResoultRep[10];

        // Stadium "Olimp"

        Stadium olimp = new Stadium(500);
        System.out.println("Start...!!!!");
        resolts[0] = new ResoultRep(olimp.start(animals));

        resolts[1]= new ResoultRep(olimp.start(animals));



*/
    User iven = new User(" ivan", " 30");
    User iven2 = new User(" ivan2", " 30");
    User iven3 = new User(" ivan3", " 30");
    User iven4 = new User(" ivan4", " 30");
    User iven5 = new User(" ivan5", " 30");
    User iven6 = new User(" ivan6", " 30");
    User iven7 = new User(" ivan7", " 30");


    UserRep userRep = new UserRep();
    userRep.addUser(iven);
    userRep.addUser(iven2);
    userRep.addUser(iven3);
    userRep.addUser(iven4);
    userRep.addUser(iven5);
    userRep.addUser(iven6);
    userRep.addUser(iven7);


        System.out.println(userRep.toString() + userRep.getAmount());
    }


}

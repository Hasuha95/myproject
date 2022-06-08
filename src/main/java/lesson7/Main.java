package lesson7;

public class Main {

    public static void main(String[] args){

         Plate plate = new Plate("red", 250);



         Cat[] cat = new Cat[5];
        cat[0]=new Cat("Murzic", false, 55);
        cat[1]=new Cat("Barsic", false, 68);
        cat[2]=new Cat("Alisa", false, 48 );
        cat[3]=new Cat("banifatsiy", false, 90);
        cat[4]=new Cat("Amanda", false, 75);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i].getSatiety());
        }
        plate.addFood(80);
        System.out.println(plate.getFoodAmount());
    }
}

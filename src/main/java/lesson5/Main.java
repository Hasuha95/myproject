package lesson5;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //   name, job, emaill, number, paid, age

        Employee perdushkin = new Employee("Пердушкин Олег Петрович", "svarshick", "www.perdack@mail.ru", "8 800 555 35 35","22", "45");
        Employee chepuha = new Employee("Чепуха Иван Степаный", "охранник", "www.ohrana_tuoletov@mail.ru", "8 888 888 88 81", "12", "60");
        Employee molodoy = new Employee("Молодой Осёл Васильевич", "TicToker", "www.tictoc@mail.ru", " отсутствует, пишите в тикток", "1000000000", "17");
        Employee podrostkoviy = new Employee("Подростковый Максим Ализмович", "shkolnick", "www.chuhan@mail.ru", "8 929 999 09 09 /это мамин", "0", "15");
        Employee shpakiyan = new Employee("Шпакян Арсен Аликович", "я на ринке, Ара", "никакой почта нетю", "+35 111 11 11", "1000000", "42");

//        String[] newMen = new String[]{"Human", "no job", "no maill", "00000", "free", "00000"};
//        Employee newPerson = new Employee(newMen);

       /* int testI = 4235;
        String testS = String.valueOf(testI);
        System.out.println(testS);*/


//        System.out.print (Arrays.toString(perdushkin.getInformation()));

//        PersonRepository one = new PersonRepository(2);
//        one.addPerson(perdushkin.getInformation());
//        System.out.println(perdushkin.getInformation());

        PersonRepository first = new PersonRepository(3);
        first.addPerson(perdushkin.getInformation());


    }
}

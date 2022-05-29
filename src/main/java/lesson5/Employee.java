package lesson5;

public class Employee {
    private String name;
    private String job;
    private String emaill;
    private String number;
    private String paid;
    private String  age;

    private String[] parameters=new String[6];


    public Employee(String name, String job, String emaill, String number, String  paid, String age) {

        this.name=name;
        this.job=job;
        this.emaill=emaill;
        this.number=number;
        this.paid=paid;
        this.age=age;


        /*this.parameters[0]=this.name;
        this.parameters[1]=this.job;
        this.parameters[2]=this.emaill;
        this.parameters[3]=this.number;
        this.parameters[4]=this.paid;
        this.parameters[5]=this.age;*/
    }

    /*public Employee(String[] listOFinfirmation) {
        listOFinfirmation[0] = this.name;
        listOFinfirmation[1] = this.job;
        listOFinfirmation[2] = this.emaill;
        listOFinfirmation[3] = this.number;
        listOFinfirmation[4] = this.paid;
        listOFinfirmation[5] = this.age;
    }*/


//        System.out.println(name+" "+"должность: "+job+"  возраст: "+age+"лет "+" почта: "+emaill+"  зарплата: "+paid+" тыс.руб."+" контактный номер: "+number);




    public String[] getInformation() {
        String[] arr = new String[parameters.length];
        for (int i = 0; i < parameters.length; i++) {
            arr[i] = parameters[i];
        }
        System.out.println(name+" "+"должность: "+job+"  возраст: "+age+"лет "+" почта: "+emaill+"  зарплата: "+paid+" тыс.руб."+" контактный номер: "+number);
        return arr;
    }

}

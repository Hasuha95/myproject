package artems_practick;

import java.util.Arrays;

public class Stadium {
    int size;


    public Stadium(int size) {
        this.size = size;
    }



    public Statistic[] start(Animal_to_run[] arr){

        float[] number = new float[arr.length];
        Statistic[] rep = new Statistic[arr.length];

        for (int i = 0; i < arr.length; i++) {
            number[i] = arr[i].runTime(size);
        }
        Arrays.sort(number);
        for (int i = 0; i <number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[i] == arr[j].runTime(size)){
                    rep[i]=new Statistic(arr[j].name, i+1, arr[j].runTime(size));
                }
            }
        }
//        System.out.println(Arrays.toString(number));
        return rep;
    }

}

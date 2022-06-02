package artems_practick;

import java.util.Arrays;

public class ResoultRep {

    Statistic[] list = new Statistic[10];

    public ResoultRep(Statistic[] list) {
        this.list = list;
    }

    public void getInfo(){
        for (int i = 0; i < list.length; i++) {
            list[i].getInfoAboutRun();
        }

    }
}

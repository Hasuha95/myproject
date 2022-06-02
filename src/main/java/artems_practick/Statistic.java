package artems_practick;

public class Statistic {

    private String name;
    private int position;
    private int number = 0;
    private float time;

    public Statistic(String name, int position, float time) {
        this.name = name;
        this.position = position;
        this.time = time;
        number++;
    }

    public void getInfoAboutRun(){
        System.out.println("участник " + name + " занял " + position + " место. " + " Результат забега - " + time);
    }
}

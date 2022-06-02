package artems_practick;


public class Animal_to_run {

    String name;
    float speed;
    float stamina;

    public Animal_to_run(String name, int speed, int stamina) {
        this.name=name;
        this.speed=speed;
        this.stamina=stamina;
    }

    public float runTime (int s){
        float time;
        time=s/speed + (stamina/100)/2;

        return time;
    }

}

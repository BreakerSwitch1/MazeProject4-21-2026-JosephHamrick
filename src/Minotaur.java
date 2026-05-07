import java.util.Random;
public class Minotaur {
    private int minotaur_speed;
    private int minotaur_max_health;
    private int minotaur_current_health;
    private Space current_space;
    public int getSpeed(){return minotaur_speed;}
    public String getHealth(){return ""+minotaur_current_health+" / "+minotaur_max_health;}
    private Random random = new Random();

    public Minotaur(int speed, int max_health, Space start){
        minotaur_speed = speed;
        minotaur_max_health = max_health;
        minotaur_current_health = max_health;
        current_space = start;
    }
    public Minotaur(Space start){
        minotaur_speed = 1;
        minotaur_max_health = 10;
        minotaur_current_health = 10;
        current_space = start;
    }

    public void moveMinotaur(){

        for(int i = 0; i<minotaur_speed; i++){
            current_space = current_space.connectedSpaces[random.nextInt(current_space.connectedSpaces.length)];
        }

    }
    public Space getCurrentSpace(){
        return current_space;
    }


}

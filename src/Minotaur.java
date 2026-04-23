public class Minotaur {
    private int minotaur_speed;
    private int minotaur_max_health;
    private int minotaur_current_health;
    public int getSpeed(){return minotaur_speed;}
    public String getHealth(){return ""+minotaur_current_health+" / "+minotaur_max_health;}

    public Minotaur(int speed, int max_health){
        minotaur_speed = speed;
        minotaur_max_health = max_health;
        minotaur_current_health = max_health;
    }
}

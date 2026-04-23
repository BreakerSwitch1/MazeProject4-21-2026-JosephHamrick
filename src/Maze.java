public class Maze {
    private int size_x;
    private int size_y;
    private boolean use_minotaur;

    int getSize_x(){return size_x;}
    int getSize_y(){return size_y;}

    public void setup(boolean minotaur_active){
        if(minotaur_active == true){
            Minotaur mn = new Minotaur(1,10);
        }
    }
}

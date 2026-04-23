import java.util.Scanner;
public class Main {
    public static Maze mz;
    public static void main(String[] args) {
        MazeReader mr = new MazeReader();
        mr.read_file();
        mz = new Maze();
        boolean minotaur_stalks = use_minotaur();
        mz.setup(minotaur_stalks);

    }

    public static boolean use_minotaur(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Should the minotaur stalk the maze? (y/n) ");
        String input_string = sc.next();
        return(input_string.equals("y"));
    }
}
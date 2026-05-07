import java.util.Scanner;
public class Main {
    public static Maze mz;
    public static void main(String[] args) {
        MazeReader mr = new MazeReader();
        String maze_to_use = chose_maze();
        mz = new Maze();
        mz.setup(mr.read_file(maze_to_use));

        mz.getMinotaur().moveMinotaur();

    }

    public static boolean use_minotaur(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Should the minotaur stalk the maze? (y/n) ");
        String input_string = sc.next();
        return(input_string.equals("y"));
    }

    public static String chose_maze(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the file path of the maze you wish to read: ");
        String input_string = sc.next();
        return(input_string);
    }
}
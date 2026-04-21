import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MazeReader mr = new MazeReader();
        mr.read_file();
        boolean minotaur_stalks = use_minotaur();

    }

    public static boolean use_minotaur(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Should the minotaur stalk the maze? (y/n) ");
        String input_string = sc.next();
        return(input_string.equals("y"));
    }
}
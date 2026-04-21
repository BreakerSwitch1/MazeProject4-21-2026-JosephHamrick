import java.util.Scanner;
import java.io.*;
public class MazeReader {
    private Space[] spaces;

    public void read_file(){
        try{
            File file = new File("Mazes/Maze1");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String[] tokens = sc.nextLine().split(",");
                spaces = new Space[tokens.length];
                for(int i = 0; i<tokens.length; i++){
                    if(tokens[i].equals("X")){
                        System.out.println("Wall");
                    }else{
                        if(tokens[i].equals("O")){
                            System.out.println("Space");
                        }
                    }
                }
            }
        }catch (java.io.FileNotFoundException ex){}
    }
}

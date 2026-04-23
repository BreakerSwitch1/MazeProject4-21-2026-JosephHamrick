import java.util.Scanner;
import java.io.*;
public class MazeReader {
    private Space[] spaces;
    private int rows;
    private int collums;

    public void read_file(){
        try{
            File file = new File("Mazes/Maze1");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String[] tokens = sc.nextLine().split(",");
                spaces = new Space[tokens.length];
                for(int j = 0; j<1; j++){
                    System.out.println("");
                }
                for(int i = 0; i<tokens.length; i++){
                    if(tokens[i].equals("X")){
                        System.out.print("X");
                    }else{
                        if(tokens[i].equals("O")){
                            System.out.print("O");
                        }else{
                            if(tokens[i].equals("E")){
                                System.out.print("E");
                            }else{
                                if(tokens[i].equals("S")){
                                    System.out.print("S");
                                }
                            }
                        }
                    }
                }collums++;

            }
        }catch (java.io.FileNotFoundException ex){}
    }
}


class GridID extends SpaceID{
    public int[] coordinates = new int[2];

    GridID(int i, int j){
        coordinates[0] = i;
        coordinates[1] = j;
    }
}
import java.util.Scanner;
import java.io.*;
import java.math.*;
public class MazeReader {
    private Space[] spaces;
    private int rows;

    public void read_file(String file_to_read){

        try{
            File file = new File(file_to_read);
            Scanner sc = new Scanner(file);

            //find how large of an array we need to store all spaces
            int totalSpaces = 0;
            while(sc.hasNextLine()){
                String[] tokens = sc.nextLine().split(",");
                for(int i = 0; i<tokens.length; i++){
                    if(is_open_space(tokens,i)){
                        totalSpaces++;
                    }
                }
            }
            spaces = new Space[totalSpaces];

            //go through file again to make space objects
            int currentSpace = 0;
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                String[] tokens = sc.nextLine().split(",");
                for(int i = 0; i<tokens.length; i++){
                    if(is_open_space(tokens,i)){
                        //assignSpaceType(spaces[i], tokens, i);
                        spaces[currentSpace] = new Space(new GridID(rows, i));
                        spaces[currentSpace].spaceType = assignSpaceType(tokens, i);
                        currentSpace++;
                    }
                }
                rows++;
            }

            //go through each space in array and loop through for all connected
            for(int i = 0; i<spaces.length; i++){
                for(int j = 0; j<spaces.length; j++){
                    //uses function inside grid id to decide if they are connected
                    if(spaces[i].id.isConnected((GridID) spaces[j].id)){
                        spaces[i].connectedSpaces[spaces[i].findFirstEmptyIndex()] = spaces[j];
                    }
                }
            }

            //return spaces;

        }catch (java.io.FileNotFoundException ex){}
    }
    public boolean is_open_space(String[] tokens, int index){
        if(tokens[index].equals("O")){
            return true;
        }else{
            if(tokens[index].equals("S")){
                return true;
            }
            else{
                if(tokens[index].equals("E")){
                    return true;
                }
            }
        }
        return false;
    }
    public Space.Type assignSpaceType(String[] tokens, int index){
        if(tokens[index].equals("S")){
            System.out.println("Start Found");
            return Space.Type.start;
        }
        else if(tokens[index].equals("E")){
            return Space.Type.exit;
        }
        else{
            return Space.Type.open;
        }
    }
}


class GridID extends SpaceID{
    public int[] coordinates = new int[2];

    GridID(int i, int j){
        coordinates[0] = i;
        coordinates[1] = j;
    }

    public Boolean isConnected(GridID nextSpace){
        if( getAbsDistance(this.coordinates[0], nextSpace.coordinates[0]) == 1 && getAbsDistance(this.coordinates[1], nextSpace.coordinates[1]) == 0){
            //nextSpace has a coordinate 1 apart in the i axis
            return true;
        }else if( getAbsDistance(this.coordinates[1], nextSpace.coordinates[1]) == 1 && getAbsDistance(this.coordinates[0], nextSpace.coordinates[0]) == 0){
            //nextSpace has a coordinate 1 apart in the j axis
            return true;
        }else{
            //nextSpace is not next to the space
            return false;
        }
    }
    public int getAbsDistance(int x, int y){
        return Math.abs(x - y);
    }

}
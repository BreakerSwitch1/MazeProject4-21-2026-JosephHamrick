public class MazeSolver {
    private Maze maze;

    public MazeSolver(Maze maze){

    }

    public void solve(){
        escapeFrom(start);
    }

    private boolean escapeFrom(Space sp){
        sp.has_visited = true;
        if(sp.spaceType == Space.Type.exit){
            return true;
        }else{
            for(int i = 0; i < sp.connectedSpaces.length; i++){
                if(sp.has_visited == false){
                    if(escapeFrom(sp.connectedSpaces[i])){
                        return true;
                    }
                }
            }
        }

        //for each adjacent space:
        //if not visited
        //escapeFrom(connection)
        return false;
    }
}

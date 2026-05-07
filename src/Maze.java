public class Maze {

    private boolean use_minotaur;
    private Space[] spaces;
    private Minotaur minotaur;


    public void setup(Space[] sp){
        spaces = sp;
        minotaur = new Minotaur(getMinotaurStart());
    }
    private Space getMinotaurStart(){
        return findSpecialSpace(Space.Type.minotaur_start);
    }
    public Space findSpecialSpace(Space.Type type){
        for(int i=0; i<spaces.length; i++){
            if(spaces[i].spaceType == type){
                return spaces[i];
            }
        }
        return null;
    }

    public Minotaur getMinotaur(){
        return minotaur;
    }
}

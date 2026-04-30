public class Space {
    public enum Type{open,start,exit}
    public Type spaceType;
    public boolean has_visited = false;
    public SpaceID id;
    public Space[] connectedSpaces = new Space[4];

    Space(SpaceID spaceID){
        id = spaceID;
    }

    public int findFirstEmptyIndex() throws IndexOutOfBoundsException{
        for(int i = 0; i<connectedSpaces.length; i++){
            if(connectedSpaces[i] == null){
                return i;
            }
        }
        //if array is already full, throw exception
        throw new IndexOutOfBoundsException();
    }
}

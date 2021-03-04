public class Ship
{
    private int row = UNSET;
    private int col = UNSET;
    private int length = UNSET;
    private int direction = UNSET;
    
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    public Ship(int length){
        this.length = length;
    }
    
    public boolean isLocationSet(){
        if(row == -1){
            return false;
        }
        else if(col == -1){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean isDirectionSet(){
        if(direction == UNSET){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void setLocation(int row, int col){
        this.row = row;
        this.col = col;
    }
    
    public void setDirection(int direction){
        this.direction = direction;
    }
    
    public int getRow(){
        return row;
    }
    
    public int getCol(){
        return col;
    }
    
    public int getLength(){
        return length;
    }

    public int getDirection(){
        return direction;
    }    
    
    private String directionToString(){
        if(direction == 0){
            return "horizontal";
        }
        else if(direction == 1){
            return "vertical";
        }
        else{
            return "unset direction";
        }
    }
    
    private String locationToString(){
        return (row + " " + col);
    }
    
    public String toString(){
        
        if(getRow() == -1){
        return directionToString() + " ship of length " + getLength() + " at (unset location)"  ;  
        }
        else{
        return directionToString() + " ship of length " + getLength() + " at (" + getRow() + ", " + getCol() + ")" ;}
    }
    
    
}

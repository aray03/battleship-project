public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    public int row;
    public int col;
    public int status;
    public boolean setship;
    
    public Location(){
       status = UNGUESSED;
    }
    
    public boolean checkHit(){
        return hasShip();
    }
    
    public boolean checkMiss(){
        if(hasShip()){
            return false;
        }
        return true;
    }
    
    public boolean isUnguessed(){
        if(status == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void markHit(){
        status = HIT;
    }
    
    public void markMiss(){
        status = MISSED;
    }
    
    public boolean hasShip(){
        return setship;
    }
    
    public void setShip(boolean val){
        setship = val;
    }
    
    public void setStatus(int statuss){
        status = statuss;
    }
    
    public int getStatus(){
        return status;
    }
    
    
    
    
    




















}

public class Grid
{
    private Location[][] grid;
    
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;
   // public String[][] grid = [10][10];
    
    public Grid(){
      grid = new Location[NUM_ROWS][NUM_COLS];
      
       for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                grid[row][col] = new Location();
            } 
        }
      
      
         
    }
    
    public void markHit(int row, int col){
        grid[row][col].markHit();
    }
    
    public void markMiss(int row, int col){
        grid[row][col].markMiss();
    }
    
    public void setStatus(int row, int col, int status){
        grid[row][col].setStatus(status);
    }
    
    public int getStatus(int row, int col){
        return grid[row][col].getStatus();
    }
    
    public boolean alreadyGuessed(int row, int col){
        return grid[row][col].isUnguessed();
    }
    
    public void setShip(int row, int col, boolean val){
        grid[row][col].setShip(val);
    }
    
    public boolean hasShip(int row, int col){
        return grid[row][col].hasShip();
    }
    
    public Location get(int row, int col){
        return grid[row][col];
    }
    
    public int numRows(){
        return NUM_ROWS;
    }
    
    public int numCols(){
        return NUM_COLS;
    }
    
    public void addShip(Ship s){
        int row = s.getRow();
        int col = s.getCol();
        int length = s.getLength();
        int  direction = s.getDirection();
        
        for(int put = 0; put < length; put++){
            //Direction 1 is verticle
            //Direction 0 is horizontal
            if(direction == 1){
                grid[row + put][col].setShip(true);
            }
            else if(direction == 0){
                grid[row][col + put].setShip(true);
            }
        }
        
        
        
    }
    
    public void printStatus(){
        
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        String[] ABCs = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        
        for(int row = 0; row < 10; row++){
            System.out.print(ABCs[row] + " ");
            for(int col = 0; col < 10; col++){
            if(grid[row][col].getStatus() == 1){
                    System.out.print("X ");
            }
            else if(grid[row][col].getStatus() == 2){
                System.out.print("O ");
            }
                else{
                System.out.print("- ");
                }
                
            }
            System.out.println("");
        }
        
    }
        
    public void printShips(){
         System.out.println("  1 2 3 4 5 6 7 8 9 10");
        String[] ABCs = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        
        for(int row = 0; row < 10; row++){
            System.out.print(ABCs[row] + " ");
            for(int col = 0; col < 10; col++){
                if(grid[row][col].hasShip()){
                    System.out.print("X ");
                }
                else{
                System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }}

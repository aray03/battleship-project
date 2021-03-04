import java.util.Scanner;
public class Battleship extends ConsoleProgram
{
    public Player human = new Player();
    
    public void run()
    {
        // Start here! This class should interact with the user
        // to play the game of Battleship
        
        // You only need to allow for the user to set up each player's
        // ships and for each player to make a guess on the other player's grid
        // Don't worry about finishing the whole game yet.
        
        // You will probably need to make additions to the Player class to
        // allow for this setting up and guessing
       
       shipPrep();
       botPrep();
       System.out.println("Good Job You Didn't Mess Up!");
       play();
    }   
    
    public void shipPrep(){
        
        Scanner sc = new Scanner(System.in);
        String[] ABCs = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.println("Ship Placer Ver 2.157");
       for(int z = 0; z < 5; z++){ 
            
            
            
            
            
            //Row
            space();
            human.printMyShips();
            System.out.println("This Ship is " + human.SHIP_LENGTHS[z] + " spaces long!");
            
            int row = -1;
            
            while(row == -1){
                
                System.out.print("Put in a Row! (A-J): ");
                String tempRow = sc.nextLine().toUpperCase();
                
                
                if(tempRow.equals("A")){
                    row = 0;
                }
                else if(tempRow.equals("B")){
                    row = 1;
                }
                else if(tempRow.equals("C")){
                    row = 2;
                }
                else if(tempRow.equals("D")){
                    row = 3;
                }
                else if(tempRow.equals("E")){
                    row = 4;
                }
                else if(tempRow.equals("F")){
                    row = 5;
                }
                else if(tempRow.equals("G")){
                    row = 6;
                }
                else if(tempRow.equals("H")){
                    row = 7;
                }
                else if(tempRow.equals("I")){
                    row = 8;
                }
                else if(tempRow.equals("J")){
                    row = 9;
                }
                else{
                    System.out.println("Error: Not A Row");
                }
            }

            
            //Col
            int good = -1;
            int col = -1;
            while(good == -1){
                System.out.print("Put in a Column! (1-10): ");
                col = sc.nextInt()-1;
                
                if(col < 10 && col > -1){
                    good = 1;
                }
                else{
                    System.out.println("Error: Not A Column");
                }
            }

            int dir = -1;
            
            good = -1;
            while(good == -1){
                sc.nextLine();
                System.out.print("Horizontal or Vertical?: ");
                String tempDir = sc.nextLine();
                tempDir = tempDir.trim();
               // int dir = -1;
                
                if(tempDir.toLowerCase().equals("horizontal") || tempDir.toLowerCase().equals("h")){
                     dir = 0;
                     good = 1;
                }
                else if(tempDir.toLowerCase().equals("vertical") || tempDir.toLowerCase().equals("v")){
                     dir = 1;
                     good = 1;
                }
                else{
                    System.out.println("Error Direction Not Working!");
                }
            }
            
            if(human.checkShipClear(row, col, dir, human.SHIP_LENGTHS[z], 1)){
                human.chooseShipLocation(human.playerShips[z], row, col, dir, 1);
                space();
            }
            else{
                System.out.println("You messed up start crying!");
                z--;
                space();
                System.out.print("Error: Spot Already Taken! (Hit Enter To Continue)");
                sc.nextLine();
            }
       }
       human.printMyShips();
       System.out.println("Congratulations! All your ships have been placed!");
       System.out.print("(Press Enter To Begin!)");
       sc.nextLine();
    }
    
    public void space(){
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public void botPrep(){
        //Side note I don't like this I am crying many tears
        //java java
        //yes user?
        //hogging RAM?
        //no user
        //telling lies?
        //no user
        //open task manager
        //NO
        int row;
        int col;
        int dir;
        for(int z = 0; z < 5; z++){
            dir = Randomizer.nextInt(2);
            if(dir == 0){
                col = Randomizer.nextInt(10-human.SHIP_LENGTHS[z]);
                row = Randomizer.nextInt(9);
            }
            else{
                col = Randomizer.nextInt(9);
                row = Randomizer.nextInt(10-human.SHIP_LENGTHS[z]);
             //   System.out.println("Hi");
            }
            
            if(human.checkShipClear(row, col, dir, human.SHIP_LENGTHS[z], 0)){
                human.chooseShipLocation(human.botShips[z], row, col, dir, 0);
            }
            else{
                z--;

            }
            
            
        }
     
        
    System.out.println("The Bot Grid has been Created!");
    }
    
    public void play(){
        int hitCount= 0;
        int botHitCount = 0;
        Scanner sc = new Scanner(System.in);
        
        boolean gameOn = true;
        while(gameOn){
            System.out.println("      Your Board");
            human.printMyShips();
            System.out.println("      Your Guesses");
            human.printMyGuesses();
            
            
            
            
            
            
            int row = -1;
            
            while(row == -1){
                
                System.out.print("Put in a Row! (A-J): ");
                String tempRow = sc.nextLine().toUpperCase();
                
                
                if(tempRow.equals("A")){
                    row = 0;
                }
                else if(tempRow.equals("B")){
                    row = 1;
                }
                else if(tempRow.equals("C")){
                    row = 2;
                }
                else if(tempRow.equals("D")){
                    row = 3;
                }
                else if(tempRow.equals("E")){
                    row = 4;
                }
                else if(tempRow.equals("F")){
                    row = 5;
                }
                else if(tempRow.equals("G")){
                    row = 6;
                }
                else if(tempRow.equals("H")){
                    row = 7;
                }
                else if(tempRow.equals("I")){
                    row = 8;
                }
                else if(tempRow.equals("J")){
                    row = 9;
                }
                else{
                    System.out.println("Error: Not A Row");
                }
            }
            //int row=1;
            
            //Col
            int good = -1;
            int col = -1;
            while(good == -1){
                System.out.print("Put in a Column! (1-10): ");
                col = sc.nextInt()-1;
                
                if(col < 10 && col > -1){
                    good = 1;
                }
                else{
                    System.out.println("Error: Not A Column");
                }
            }
            
            
            human.recordPlayerGuess(row, col);
            if(human.botGrid.hasShip(row,col)){
                System.out.println("HIT!");
                hitCount++;
            }
            sc.nextLine();
            space();
            
            if(hitCount >= 15){
                System.out.println("Good Job You WIN!");
                gameOn = false;
            }
            
            
            col = Randomizer.nextInt(9)+1;
            row = Randomizer.nextInt(9)+1;
            
            human.recordOpponentGuess(row, col);
            if(human.recordOpponentGuess(row, col)){
                botHitCount++;
            }
            
            
            
            System.out.println("     Your Status");
            human.printOpponentGuesses();
            System.out.println("Press Enter To Continue");
            sc.nextLine();
            
            if(botHitCount >= 15){
                System.out.println("You Lose!");
                gameOn = false;
            }
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
    }
    
}

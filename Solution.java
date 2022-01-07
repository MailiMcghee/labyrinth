public class Solution{
    
    
    int[] solution;
    int j;//max lenght of map
    int[] map = new int[j];
    private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;
    int rows;
    int cols;
    int currentLoc;
    Labyrinth l = new Labyrinth(rows, cols);
    int lastCol = cols - 1; 
    int lastRow = rows -1;
    int cc ;
    int steps = 0;
    int cr ;
    int[] locs = new int[rows * cols];
    public int i = 0;



public int[] solveLabyrinth( Labyrinth l){

   
     for(cc = 0; l.isValid(cr,cc);){// checks if current step is valid
      
         

        if(l.isStone(cr ,cc + 1)){ //checks right 
            //update location and mark on map...make method
            map(RIGHT);
            cc++;
           
           
        } 
         
        else if(l.isValid(cr + 1,cc) && l.isStone(cr + 1, cc)){ // checks 1 step down
            cr++;
            map(DOWN);
        }

        else if(l.isValid(cr,cc - 1) && l.isStone(cr, cc - 1)){ // checks left 
            cc--;
            map(LEFT);
        }
        else if(l.isValid(cr - 1,cc) && l.isStone(cr - 1, cc)){//checks up
            cr--;
            //update method
            map(UP);
        }
        
        
        else{
            
            backtrack();

        }
         for(cr = 0; l.isValid(cr,cc);cr++){
                 
            }

         }
         
        return solution;
     }
        
 



public void map(int direction ){ // tracks the moves in an array
 
    j = lastCol & lastRow;
    int i; //position tracker

    for( i = 0; cc != lastCol && cr != lastRow; i++){ //for every move that is not (row-1,col-1) add that step to the map
        map[i] = direction;
    }
}
 
public void location(int row, int col){ //records the actual locations that have been visited
    
    
    for(i = 0; cc != lastCol && cr != lastRow; i++){
        locs[i] = row & col;
    }
}

    
public void backtrack(){//moves one step back
    
    boolean f = false;
    int stepBack = locs[i-1];
    int currentLoc = cr & cc;
    

    currentLoc = stepBack; // makes last location the current location(taking a step back)
    
    f = l.isValid(cr,cc); // makes the last path taken unavalable because of dead end 
    
}
}





    
    



   
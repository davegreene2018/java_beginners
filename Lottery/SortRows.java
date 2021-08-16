
// Java code to sort 2D matrix row-wise 
import java.io.*; 
import java.util.Arrays; 
  
public class Sort2DMatrix { 
  
    static int sortRowWise(int m[][]) 
    { 
        // One by one sort individual rows. 
        for (int i = 0; i < m.length; i++) 
            Arrays.sort(m[i]); 
  
        // printing the sorted matrix 
        for (int i = 0; i < m.length; i++) { 
            for (int j = 0; j < m[i].length; j++) 
                System.out.print(m[i][j] + " "); 
            System.out.println(); 
        } 
  
        return 0; 
    } 
  
    // driver code 
    public static void main(String args[]) 
    { 
        int m[][] = { { 9, 8, 7, 1 }, 
                      { 7, 3, 0, 2 }, 
                      { 9, 5, 3, 2 }, 
                      { 6, 3, 1, 2 } }; 
  
        sortRowWise(m); 
    } 
}
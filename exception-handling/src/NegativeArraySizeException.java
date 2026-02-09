// Negative  Array Size exception
//Pupose: To learn Negative Array Size Exception 
 /* We are declaring negative array size It gives us Exception --> Negative Arrays Size Exception 
 To manage it we are handling it using try catch block 
  Approach
  1. Add statement that caused error in Program to try block
  2. Add type of Exception or Exception or Throwable(root class of Exceptions and errors)
 */
import java.util.Arrays;
public class NegativeArraySizeException {
    
     public static void main(String[] args) {
        
        try{
            int arr[]= new int[-1];
        }
        catch(Exception e ){
           System.out.println(e.getMessage());
        }
       
     }
}

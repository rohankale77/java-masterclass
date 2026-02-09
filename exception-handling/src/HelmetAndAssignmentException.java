import java.util.Scanner;


class HelmetNotFoundException extends Exception{}
class AssignmentNotCompletedException extends RuntimeException{

}
public class HelmetAndAssignmentException {
    

    public static void main(String[] args) {
          
       try{
         travelling();
       }
       catch(HelmetNotFoundException e){
        System.out.println("Helmet Exception Handled ");
       }

       attendBatch(true);
    }
    public static void travelling() throws HelmetNotFoundException{
        System.out.println("travelling started");
    }

    public static void attendBatch(boolean assignment)  
    {
            if(assignment)
            {
                try{
                checkAssignment();
                   }
                   catch(AssignmentNotCompletedException e)
                   {
                    System.out.println("throw him/her out of the class");
                   }
            }

            System.out.println("Class Completed");
    }
    public static void checkAssignment()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your response");
        String resp=sc.next().toUpperCase();
        

        if(resp.equals("YES")){
            System.out.println("Continue your class");
        }
        else{
            throw new AssignmentNotCompletedException();
        }
    }
}

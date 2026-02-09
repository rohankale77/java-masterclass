
import java.util.Scanner;
public class ArithmeticException {
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();

        System.out.println("Enter Second No");
        int b=sc.nextInt();
         
        
        try{
             System.out.println("try");
              System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Cannot divide no by zero");
        }
    

        
        
    }
}

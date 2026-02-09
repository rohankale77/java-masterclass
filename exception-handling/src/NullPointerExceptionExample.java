/*  Null Pointer Exception */
public class NullPointerExceptionExample {
    public static void main(String[] args) throws Throwable {
        String str="Hello Java";
        
        try{
            str=null;
            System.out.println(str.isEmpty());
        }
        catch(NullPointerException e){
            System.out.println("Exception Handled");
        }
        }
        
    }


public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        int num=0;
             try{
             num=new java.util.Scanner(System.in).nextInt();
             }

             catch(java.util.InputMismatchException e){
                System.out.println("Input is mismatch");
             }

    }
}

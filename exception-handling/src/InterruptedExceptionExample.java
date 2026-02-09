public class InterruptedExceptionExample {
      
    // public static void main(String[] args) throws InterruptedException{
    //     String str=" Hello Java";
         
    //     for(int i=0;i<str.length();i++){
    //         System.out.println(str.charAt(i)+" ");
    //         Thread.sleep(250);
    //     }
    // }

    public static void main(String[] args)  {
        System.out.println(" main() starts");
          
        m1();

        System.out.println("main() ends");
        
    }
        public static void m1() {
             System.out.println("m1 starts");
             String str="Execution of Java";
             System.out.println(str);
             
             try{
             Thread.sleep(2000); 
             }
             catch(Exception e){
                System.out.println("Exception handled ");
             }
             System.out.println("m1 ends");
             

        }

     
     
}

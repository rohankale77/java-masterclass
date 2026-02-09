public class IndexOutOfBoundsExceptionExample {
     
    public static void main(String[] args) {
        
        // // Storing the Ice-Cream flavours in string array 
        // String flavours[]={ "Vanilla","Strawberry","Butter Scotch ","chocolate","Mango"};
         
        //  for(int i=0;i<=flavours.length;i++){
        //     try{
        //     System.out.println(flavours[i]+ " ");
        //  }
        //  catch(ArrayIndexOutOfBoundsException e ){
        //     System.out.println(e.getMessage());
        //  }
        // }





          String str="Hello Java";
          for(int i=0;i<=str.length();i++){
          
             try{
                  System.out.print(str.charAt(i) + " ");
             }
             catch(StringIndexOutOfBoundsException e){
                System.out.println("\n String Out  of bounds exception");
                System.out.println(e.getMessage());
             }
          }
    }
}

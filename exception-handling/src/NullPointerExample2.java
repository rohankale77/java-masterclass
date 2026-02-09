public class NullPointerExample2 {
    

     public static void main(String[] args) {
         
        int arr[]={12,23,56};
        //printing an array
        for(int i=0;i<arr.length;i++){
        System.out.print(i+" ");
        }

        arr=null;
        
         try{
             System.out.println(arr[0]);

         }
         catch(Exception e){
            System.out.println(e.getMessage());
         }

     }
}

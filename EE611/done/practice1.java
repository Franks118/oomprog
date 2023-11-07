import java.util.Scanner;
public class practice1{
    public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.print("how may numbers will you enter: ");
    int n = s.nextInt();
     System.out.println("great enter "+n+" integers");
   int[]array = new int[n];
   for(int i = 0;i < n ;i++){
      array[i] = s.nextInt();
   }
   System.out.println("unsorted");
    for(int i = 0;i < n ;i++){
  
     System.out.println(array[i]);
   }

     
        bubblesortascending(array);
       
         System.out.println("sorted ascending");
        for(int i:array){
   
            System.out.println(i);
            
        
        }
                   bubblesortdescending(array);
                      System.out.println("sorted descending");
                   
         for(int k:array){
            
            System.out.println(k);
                    
        
        }



             }
    public static void bubblesortascending(int array[]){
        for(int i = 0;i < array.length-1;i++){
            for(int j = 0;j < array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
  
    
}
 public static void bubblesortdescending(int array[]){
        for(int k = 0;k < array.length-1;k++){
            for(int j = 0;j < array.length-k-1;j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

}
}

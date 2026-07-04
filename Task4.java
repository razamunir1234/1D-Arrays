public class Task4 {
     
    public static void main(String[] args) {
        int arr[]=  {2, 4, 2, 15, 4, 5, 6, 9, 12, 2};
       
        printUnique(arr);
    }//main
    
    public static void printUnique(int array[]){
     
        for(int i=0; i<array.length; i++){
            int count=0;
        for(int j=0; j<array.length; j++){
           if(array[i]==array[j]){
           count++;
           }
          

        }//inner for
         if(count==1){
                 System.out.println("Elements are unique: "+array[i]);

           }

        }//outer for   
                                                                                                                                                                         
    }//method
    
}//class



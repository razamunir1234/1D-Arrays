public class Task3 {
    public static void main(String[] args) {
        int arr1[]=  {4, 2, 3, 17, 19, 12, 16, 7, 100};
        int arr2[]=  {3, 9, 5, 12, 6, 17, 8, 7};
        printCommon(arr1, arr2);
    }//main
    public static void printCommon(int firstarray[], int secondarray[]){
        System.out.print("{");
        for(int i=0; i<firstarray.length; i++){
        for(int j=0; j<secondarray.length; j++){
            if(firstarray[i]==secondarray[j]){
            
                System.out.print(" " + firstarray[i] + " ");
                
            }

        }//inner for

        }//outer for   
        System.out.println("}");                                                                                                                                                                           
    }//method
    
}//class

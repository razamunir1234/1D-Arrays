public class Task5 {
    public static void main(String[] args) {
        int array[]=  {3, 8, 13, 18, 21, 24, 29, 36, 37, 41};
        int num=4;
         replacewithNextMultiple(array, num);
          printArray(array);
    }
    public static void replacewithNextMultiple(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=num){
                arr[i] = num;
            }
            if(arr[i]%num!=0){
                arr[i] = arr[i]+ (num - (arr[i]%num));
            }
          }
       } 
        public static void printArray(int array []){
            for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ ", ");

        }

    }

}

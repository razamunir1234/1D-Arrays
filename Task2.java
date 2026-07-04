public class Task2 {
    public static void main(String[] args) {
        int arr[] ={2, 4, 31, 12, 7, 47, 63, 41, 67, 55};
        printPrime(arr);
        
}
    public static void printPrime(int [] arr){
         for(int i=0; i<arr.length; i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i] + ",  ");
            }
         }
       

    }
    public static boolean isPrime(int number){
        boolean isprime =true;
       if(number<=1){
        isprime=false;
 
       }
       for(int i=2; i<=number/2;i++){
        if(number%i==0){
            isprime=false;
          
        }
       }
       return isprime;
        
       
    }
}
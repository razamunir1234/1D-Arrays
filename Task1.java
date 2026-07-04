public class Task1 {
    public static void main(String[] args) {
        int arr[]={3,2,12,15,17,22,25,26,28};
        Sumevenodd(arr );

    }
    public static void Sumevenodd(int arr []){
        int evenadd=0;
        int oddadd = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0){
                evenadd+=arr[i];
            }
            if(arr[i]%2!=0){
                oddadd+=arr[i];
            }
        }
        System.out.println("sum of even numbers:  " + evenadd);
         System.out.println("sum of odd numbers:  " + oddadd);

    }
}

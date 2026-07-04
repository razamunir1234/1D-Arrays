public class linearsearch {
    public static void main(String[] args) {
        int []arr={10,20,30,50,60,100,70};

linear(arr);
}

    
    public static void linear(int []arr){
        int target=50;
         for (int i=0; i < arr.length; i++) {
        if(arr[i]==target){
            System.out.println("index found :" + i);
        }
            
        }
    }
}


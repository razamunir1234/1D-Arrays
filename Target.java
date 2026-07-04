public class Target {
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        target(arr);
    }
    public static void target(int []arr){
        int tg=9;
        for (int i = 0; i < arr.length; i++) {
            for (int j= i+1; i < arr.length; i++) {
                if(arr[i]+arr[j]==tg){
                   System.out.println("index found :"+i+ ", "+j);
                }   
            
            }
        }
      
         
    }

}

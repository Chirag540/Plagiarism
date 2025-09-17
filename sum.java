public class sum {
    public static void main(String[] args) {
        int arr[] ={5,2,4,8,9};
        int sum = 17;
        boolean found = false;
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+ arr[j]==sum){
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] +"=" +sum);
                
                }
            }
        
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}

package Day(21-06-25);

public class FindingDuplicates {
    public static void main(String[] args) {
        int[] arr = {12,2,2,10,10};
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    System.out.println(arr[j]);
                }
                
            }
            
        }
        
    }
    
}


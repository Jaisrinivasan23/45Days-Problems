package Day(23-06-25);

public class ArrayLeastNum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        for(int i=0;i<arr.length;i++){
            int val = -1;
            for(int j=i;j<arr.length;j++){
                if(arr[i]-arr[j]==1){
                    val=arr[j];
                    }
            }System.out.println(val);
        }
    }  
}

package Day(21-06-25);

public class LinearSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,12};
        for(int i = 0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}

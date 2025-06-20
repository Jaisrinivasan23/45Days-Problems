package Day(20-06-25);

public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    
}
}

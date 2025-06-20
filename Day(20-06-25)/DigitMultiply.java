package Day(20-06-25);

public class DigitMultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int mul =1;
        while(num>0){
            int digit = num%10;
            mul*=digit;
            num = num/10;
        }System.out.println(mul);
    }
}

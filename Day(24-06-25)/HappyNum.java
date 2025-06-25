class Main {
    public static void main(String[] args) {
        int num = 4;
        HappyNum(num);
    }
    static int SquareSum(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            int digitSq = digit*digit;
            sum+=digitSq;
            num = num/10;
        }return sum;
    }
    static void HappyNum(int num){
        while(num!=1&&num!=4){
            num = SquareSum(num);
        }
        if (num == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}
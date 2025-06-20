class Main {
    public static void main(String[] args) {
        int val = 2300,sum = 0,count =0;
        while(val>0){
            int digit = val%10;
            sum+=digit;
            val = val/10;
        }System.out.println(count);
    }
}
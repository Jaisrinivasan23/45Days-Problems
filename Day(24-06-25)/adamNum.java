class adamNum {
    public static void main(String[] args) {
        int num = 45;
        int numsq = num*num;
        int rev =0;
        while(num>0){
            int digit = num%10;
            rev = (rev*10)+digit;
            num = num/10;
        }
        int rev_Sq = rev*rev;
        int revsq1 = 0;
        while(rev_Sq>0){
            int digit = rev_Sq%10;
            revsq1 = (revsq1*10)+digit;
            rev_Sq = rev_Sq/10;
        }
        if(revsq1 == numsq){
            System.out.println("Adam");
        }else{
            System.out.println("NotAdam");
        }
    }
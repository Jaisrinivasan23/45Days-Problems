public class PalindromeChecker {

    public static void main(String[] args) {
        int num = 100;
    while (true){
        int value = num;
        int rev = 0;
        while(value>0){
            int digit = value%10;
            rev = (rev*10)+digit;
            value = value/10;
        }
        if(num == rev){
            System.out.println(num);
            break;
        }else{
            num++;
        }
    }
        
}

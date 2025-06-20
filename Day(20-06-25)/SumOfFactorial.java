import java.util.Scanner;
class SumOfFactorial {
    public static void main(String[] args) {
        System.out.println(SumOfFactorial(123));
    }
    static int Factorial(int num){
           int fact = 1;
            if(num == 1 || num == 0){
                return fact;
            }else{
                for(int i=1;i<=num;i++){
                    fact = fact*i;
                }
                return fact;
            }
        }
    static int SumOfFactorial(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum+=Factorial(digit);
            num = num/10;
        }return sum;
    }
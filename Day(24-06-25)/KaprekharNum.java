public class KaprekharNum {
public static void main(String[] args) {
        int num = 45;
        int sq = num*num;
        String chsq = Integer.toString(sq);
        for(int i=1;i<chsq.length();i++){
            String Left = chsq.substring(0,i);
            String right = chsq.substring(i);
            
            int num1 = Integer.parseInt(Left);
            int num2 = Integer.parseInt(right);
            
            if(num1+num2 == num){
                System.out.println("True");
                break;
            }System.out.println("False");
            }
            
}
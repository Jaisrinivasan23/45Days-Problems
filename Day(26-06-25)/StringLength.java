public class StringSpace {
    public static void main(String[] args) {
        String str = "Hello";
        int count = 0;
        for(char ch:str.toCharArray()){
            count++;
        }System.out.println(count);
    }
}
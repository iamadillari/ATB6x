package ex_20042024;

public class ex_07 {
    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println(str1==str2); //FALSE
        System.out.println(str1.equals(str2)); //true
    }

}

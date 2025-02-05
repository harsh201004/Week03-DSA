package stringbuilder.reversethestring;

public class ReverseStringMain {
    public static void main(String[] args) {

        String str = "Hello";
        StringReverse reverser = new StringReverse();
        String reversedStr = reverser.reverseString("Hello");

        System.out.println("Given string: " + str);
        System.out.print("Reversed string: ");
        System.out.println(reversedStr);
    }
}

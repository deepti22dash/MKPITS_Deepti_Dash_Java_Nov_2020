public class ReversingString
{
    public static void main(String[] args) {
        String string = "Gourav Dash";
        String reversedStr = "";
        for(int i = string.length()-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }
        System.out.println("Original string: " + string);

        System.out.println("Reverse of given string: " + reversedStr);
    }
}

public class FindingPowerOfANumber {
    public static void main(String[] args) {
        int number = 7, p = 4;
        long result = 1;
        int i = p;
        for (;i != 0; --i)
        {
            result *= number;
        }
        System.out.println(number+"^"+p+" = "+result);
    }
}


public class SwapTwoNumbers
{
    static void swapNumbers(int a, int b)
    {
        System.out.println("Before swapping");
        System.out.println("a= " + a + ", b= " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping");
        System.out.println("a= " + a + ", b= " + b);
    }
    public static void main(String[] args)
    {
        int a = 68;
        int b= 49;
        swapNumbers(a,b);
    }
}


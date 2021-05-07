public class ComparisonOfObjects
{
    public static void main(String[] args)
    {

        Double x = new Double(1234.00);

        Long y = new Long(1234);

        System.out.println("Objects are not equal, hence it returns " + x.equals(y));

        System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));
    }
}

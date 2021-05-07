public class RandomNumbersEx2
    {
        public static void main( String args[] )
        {
            int min = 400;
            int max = 800;
//Generate random double value from 400 to 800
            System.out.println("Random value of type double between "+min+" to "+max+ ":");
            double a = Math.random()*(max-min+1)+min;
            System.out.println(a);
//Generate random int value from 400 to 800
            System.out.println("Random value of type int between "+min+" to "+max+ ":");
            int b = (int)(Math.random()*(max-min+1)+min);
            System.out.println(b);
        }
    }


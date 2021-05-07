public class LargestElementOfArray {
    public static void main(String[] args) {

              int [] arr = new int [] {78, 21, 5, 500, 96};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element of the array: " + max);
    }
}



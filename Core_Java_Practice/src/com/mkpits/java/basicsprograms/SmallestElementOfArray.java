public class SmallestElementOfArray {
    public static void main(String[] args) {


        int [] arr = new int [] {9, 11, 76, 85, 51};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}


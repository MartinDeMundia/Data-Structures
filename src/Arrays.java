public class Arrays {
    public static void main (String[] args)
    {
        // declaring integer array.
        int[] arr;
        // allocating memory for 5 integers.
        arr = new int[5];
        // initialize first element of the array
        arr[0] = 1;
        // initialize second element of the array
        arr[1] = 4;
        arr[2] = 15;
        arr[3] = 21;
        arr[4] = 6;
        // accessing the array elements
        for (int j : arr) System.out.println(j);

    }
}

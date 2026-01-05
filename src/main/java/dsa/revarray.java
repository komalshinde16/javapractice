package dsa;

public class revarray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 4, 3, 9, 4, 5};


        for (int i = arr.length -1; i>=0; i--){
            System.out.println(arr[i] + " ");
        }
    }
}

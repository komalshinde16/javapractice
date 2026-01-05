package dsa;

public class sumofarrays {
    public static void main(String[] args) {
        int[]arr = {1,4,2,5,8,9,3,7,5};
        int sum =0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum ="+sum);
    }

}

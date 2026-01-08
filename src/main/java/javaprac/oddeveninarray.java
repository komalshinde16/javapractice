package javaprac;

public class oddeveninarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int even =0, odd=0;

        for(int n :arr){
            if(n%2==0) {
                even++;
            } else
                    odd++;
            }
        System.out.println(even);
        System.out.println(odd);
        }
    }

//it counts no of even and odd present in the set of array.and
// does not print the odd & even numbers,
//so keep it in mind

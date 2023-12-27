package NullyTest;

import java.util.Arrays;
import java.util.Random;

public class RandomDistinct {
    private long random() {
        Random rand = new Random();
        return rand.nextInt(10);
    }

    public static void main(String[] args) {
        long[] arr = new long[6];
        for(int i = 0; i < arr.length; i++) {
            long random = new RandomDistinct().random();
            arr[i] = random;
            for(int j = 0; j < i; j++) {
                if(random == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

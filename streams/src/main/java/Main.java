import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by User on 27.10.2018.
 */

public class Main {


    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 8, 4, 6, 4, 9, 12, -2, 0, -4, 6, 4};
        int number = 5;

        double mid = Arrays.stream(arr)
                .average()
                .getAsDouble();
        System.out.println("mid: " + mid);

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();
        int minIndex = IntStream.range(0, arr.length-1)
                .filter(a -> arr[a]==min)
                .findFirst()
                .getAsInt();



        System.out.println("minElement: " + min + " index: " + minIndex);

        long nulls = Arrays.stream(arr)
                .filter(a -> a == 0)
                .count();
        System.out.println("zeros: " + nulls);

        long moreThanNull = Arrays.stream(arr)
                .filter(a -> a > 0)
                .count();
        System.out.println("more than zero: " + moreThanNull);

        int[] multiplied = Arrays.stream(arr)
                .map(a -> a*number)
                .toArray();
        System.out.println("multiplied array: " + Arrays.toString(multiplied));




    }

}

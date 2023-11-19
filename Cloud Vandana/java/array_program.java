import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(list);
        arr = list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
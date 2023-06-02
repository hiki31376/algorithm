
import java.util.Arrays;
import java.util.List;

import sort.BubbleSort;


public class App {
    public static void main(String[] args) throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] temp = {6,5,3,1,8,7,2,4};
        List<Integer> arr = Arrays.asList(temp);
        bubbleSort.sort(arr);

        System.out.println(arr.toString());
    }
}

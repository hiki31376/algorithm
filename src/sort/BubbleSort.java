package sort;

import java.util.List;

public class BubbleSort implements SortAlgoritm{
    @Override
    public List<Integer> sort(List<Integer> arr) {
        int temp = 0;

        for(int i = 0; i < arr.size()-1; i++) {       // 1.
            for(int j= 1 ; j < arr.size()-i; j++) { // 2.
                if(arr.get(j-1) > arr.get(j)) {     // 3.
                    // swap(arr[j-1], arr[j])
                    temp = arr.get(j-1);
                    arr.set(j-1, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr;
    }
}

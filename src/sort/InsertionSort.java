package sort;

import java.util.List;

public class InsertionSort implements SortAlgoritm{
    @Override
    public List<Integer> sort(List<Integer> arr) {
        for(int index = 1 ; index < arr.size() ; index++){ // 1.
            int temp = arr.get(index);
            int prev = index - 1;
            while( (prev >= 0) && (arr.get(prev) > temp) ) {    // 2.
                arr.set(prev+1, arr.get(prev));
                prev--;
            }
            arr.set(prev+1, temp);
        }
        return arr;
    }
}

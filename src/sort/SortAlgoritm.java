package sort;

import java.util.List;

public interface SortAlgoritm{
    public abstract List<Integer> sort( List<Integer> arr);

    default void swap(List<Integer> arr , int i , int j){
        int temp;
        temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j,temp);
    }

}

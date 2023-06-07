package sort;

import java.util.List;

public class QuickSort implements SortAlgoritm{

    @Override
    public List<Integer> sort(List<Integer> arr) {
        quickSort(arr, 0, arr.size()-1);
        return arr;
    }
    public void quickSort(List<Integer> arr , int left , int right){
        if(left >= right) return;

        int pivot = partition(arr, left, right);

        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1, right);
    }

    public int partition(List<Integer> arr , int left , int right){
        int pivot = arr.get(left); // 가장 왼쪽값을 피벗으로 설정
        int i = left, j = right;
        
        while(i < j) {
            while(pivot < arr.get(j)) {
                j--;
            }
            while(i < j && pivot >= arr.get(i)){
                i++;
            }
            swap(arr, i, j);
        }
        arr.set(left, i);
        arr.set(i, pivot);
        
        return i;
    }
}
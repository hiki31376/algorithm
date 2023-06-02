package sort;

import java.util.List;
/*
 * 버블 알고리즘 
 * 시간 복잡도는 최악, 최선, 평균 모두 O(n^2) 이다 
 * 정렬 돼있지 않은 원소가 정렬 됐을때의 자리로 가기 위해서, 교환 연산(swap)이 많이 일어나게 된다.
 * 정렬하고자 하는 배열 안에서 교환하는 방식이므로, 다른 메모리 공간을 필요로 하지 않다.
 * => 제자리 정렬(in-place sorting)
 * 안정 정렬(Stable Sort) 이다.
 * 
 */
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

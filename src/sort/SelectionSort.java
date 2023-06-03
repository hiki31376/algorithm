package sort;

import java.util.List;
/*
 * 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘
 * 주어진 배열 중에 최소값을 찾는다.
 * 그 값을 맨 앞에 위치한 값과 교체한다. (pass)
 * 맨 처음 위치를 뺀 나머지 배열을 같은 방법으로 교체한다.
 * 제자리 정렬(in-place sorting)
 * 불안정 정렬(Unstable Sort)
 * 시간복잡도가 O(n^2)
 */
public class SelectionSort implements SortAlgoritm {
      @Override
      public List<Integer> sort(List<Integer> arr) {
        int indexMin, temp;
        for (int i = 0; i < arr.size()-1; i++) {        // 1.
            indexMin = i;
            for (int j = i + 1; j < arr.size(); j++) {  // 2.
                if (arr.get(j) < arr.get(indexMin)) {           // 3.
                    indexMin = j;
                }
            }
            // 4. swap(arr[indexMin], arr[i])
            temp = arr.get(indexMin);
            arr.set(indexMin, arr.get(i));
            arr.set(i,temp);
        }
          return arr;
      }
}

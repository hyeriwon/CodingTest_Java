class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int a1 = 0, a2 = 0;

        // arr1 합계 계산
        for (int i = 0; i < arr1.length; i++) {
            a1 += arr1[i];
        }

        // arr2 합계 계산
        for (int i = 0; i < arr2.length; i++) {
            a2 += arr2[i];
        }

        // 배열 길이 비교
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            // 배열 길이가 같을 때 합계 비교
            if (a1 == a2) {
                return 0;
            } else if (a1 > a2) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

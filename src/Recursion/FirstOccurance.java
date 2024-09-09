package Recursion;

public class FirstOccurance {
    public static int findFirstOcc(int a[], int key, int start) {
        if (key == a[start]) {
            return start;
        }
        if (start >= a.length - 1) return -1;
        return findFirstOcc(a, key, start + 1);


    }

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 4, 5, 6, 7, 8, 9, 9};
        int key = 2;
        int start = 0;
        int res = findFirstOcc(a, key, start);
        System.out.println(res);
    }
}

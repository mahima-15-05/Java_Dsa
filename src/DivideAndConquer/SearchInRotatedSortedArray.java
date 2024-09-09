package DivideAndConquer;
/*
 * Sorted rotated array with distinct numbers (in ascending order). It is rotated at a pivot point.
 * Find the index of given element
 * eg - [5,6,7,0,1,2] target = 0, output = 4
 * Linear search - O(n)
 * Divide and Conquer O(nlogn)
 */

public class SearchInRotatedSortedArray {
    public static int search(int a[], int target, int si, int ei) {
        if(si>ei)return -1;
        int mid = si + (ei - si) / 2;
        if (a[mid] == target) return mid;

        //If my mid lies on L1
        if (a[si] <= a[mid]) {
            // case a : left of L1
            if (a[si] <= target && a[mid] >= target) {
                return search(a, target, si, mid);

            } else {
                return search(a, target, mid + 1, ei);
            }

        }
        // if mid lies on line L2



        if(a[mid]<=target && target<=a[ei]){
            //case c
            return search(a,target,mid+1,ei);
        }
        else{
            //case d
            return search(a,target,si,mid-1);

        }

    }

    public static void main(String[] args) {
        int a[] = {4, 5, 6, 7, 0, 1, 2}; //target =0, output -> 4
        int target = 0;
        int targetIndex = search(a, target, 0, a.length - 1);
        System.out.println("Target Index : " + targetIndex);


    }

}

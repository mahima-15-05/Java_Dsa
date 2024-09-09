package DivideAndConquer;
/*
* Quick sort works on Pivot and partition approach
* In most cases last element of the array is taken as pivot
* Worst case time complexity is that which occurs when the array is already sorted either in descending order on in descending order
* i.e., pivot is either largest or smallest element
*/
public class QuickSort {
    public static void printArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }

    //partition using (pivot)
    public static void quickSort(int a[], int start,int end){
        if(start>=end)return;
        int pidx = partition(a,start,end);
//        left part
        quickSort(a,start,pidx-1);

//        right part
        quickSort(a,pidx+1,end);
    }
    public static int partition(int a[], int start, int end){
        int pivot =a[end];
        int i =start-1; // to make place for ele smaller than pivot
        for(int j=start; j<end;j++){
            if(a[j]<=pivot){
                i++;
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }

           i++;
           int temp = pivot;
           a[end]=a[i];
           a[i]=temp;


        return i;

    }



    public static void main(String[] args) {
        int a[] = {4,3,2,1};
        System.out.println("Original array");
        printArray(a);
        System.out.println();
        quickSort(a,0,a.length-1);
        System.out.println("Array sorted");
        printArray(a);

    }
}

package DivideAndConquer;

public class MergeSort {
    public static void mergeArray(int a[], int start,int mid,int end){
        int arr[] =new int[a.length];
        int left =start;
        int right = mid+1;
        int cnt=0;
        while(left<=mid && right<=end){
            if(a[left]<a[right]){
                arr[cnt]=a[left];
                cnt++;
                left++;
            }
            else{
                arr[cnt]=a[right];
                right++;
                cnt++;
            }

        }
        while (right<=end){
            arr[cnt]=a[right];
            right++;
            cnt++;
        }
        while (left<=mid){
            arr[cnt]=a[left];
            left++;
            cnt++;
        }
        for(int i=start; i<=end;i++){
            a[i]= arr[i-start];
        }


    }
    public static void divideAndSort(int a[], int start, int end){
        if(start>=end)return;
        int mid = start+(end-start)/2;
        divideAndSort(a,start,mid);
        divideAndSort(a,mid+1,end);
        mergeArray(a,start,mid,end);

    }

    public static void main(String[] args) {
        int a[] = {8,6,9,4};
        int start=0;int end =a.length-1;
        divideAndSort(a,start,end);
        System.out.println("Sorted array is ;");
        for(int i=0; i<a.length;i++){

            System.out.print(a[i]+" ");
        }
    }
}

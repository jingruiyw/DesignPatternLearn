package algorithms;

/**
 * 二分查找
 * 是对有序数组进行的
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] a = {1,2,3,5,6,7,9,10};
        int m = rank(6,a);

        System.out.println(m);
    }

    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1 ;

        while (lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(key < a[mid]) { hi = mid - 1;}
            else if(key > a[mid]){ lo = mid + 1;}
            else {return mid;}
        }
       return -1;
    }
}

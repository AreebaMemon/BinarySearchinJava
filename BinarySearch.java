public class binarySearch {
    int binarySearch(int[] arr,int x,int low,int high){
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        binarySearch b = new binarySearch();
        int[] a = {3, 4, 5, 6, 7, 8, 9};
        int n = a.length;
        int x = 5;
        int result = b.binarySearch(a, x, 0, n - 1);
        if (result == -1) {
            System.out.println("Number is Not Found : ");
        } else {
            System.out.println("Number is Found : "+ result);
        }
    }
}

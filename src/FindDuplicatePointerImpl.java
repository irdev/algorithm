
// if element between 0 - (n-1) that n is array size
//pointer algorithm
class FindDuplicatePointerImpl {
    public static void main(String[] args) {
        FindDuplicatePointerImpl duplicate = new FindDuplicatePointerImpl();
        int arr[] = {1, 2, 3, 1, 3, 6, 6};
        duplicate.printRepeating(arr, arr.length);
    }

    void printRepeating(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }
} 

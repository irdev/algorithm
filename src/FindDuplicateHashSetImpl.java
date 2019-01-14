import java.util.HashSet;
import java.util.Set;

class FindDuplicateHashSetImpl {
    public static void main(String[] args) {
        FindDuplicateHashSetImpl duplicate = new FindDuplicateHashSetImpl();
        int arr[] = {7, 5, 6, 12, 8, 5, 13};
        duplicate.printRepeating(arr);
    }

    void printRepeating(int arr[]) {
        Set<Integer> temp = new HashSet<>();
        int i;
        for (i = 0; i < arr.length; i++) {
            if (temp.contains(arr[i])) {
                System.out.println(arr[i]);
            }
            temp.add(arr[i]);
        }
    }
} 
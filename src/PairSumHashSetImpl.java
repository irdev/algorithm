import java.util.HashSet;

class PairSumHashSetImpl {
    static void printPairs(int arr[], int sum) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
            if (temp >= 0 && s.contains(temp)) {
                System.out.println("(" + arr[i] + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 5, 8, 12, 17, 21, 25};
        int n = 18;
        printPairs(A, n);
    }
}

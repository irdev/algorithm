class PairSumSortedImpl {
    /**
     * @param array sorted number array
     * @param sum
     */
    static void printPair(int array[], int sum) {
        int l, r;

        l = 0;
        r = array.length - 1;
        while (l < r) {
            if (array[l] + array[r] == sum) {
                System.out.println(array[l] + "," + array[r]);
                break;
            } else if (array[l] + array[r] < sum)
                l++;
            else
                r--;
        }
    }


    public static void main(String args[]) {
        int array[] = {1, 5, 8, 12, 17, 21, 25};
        int sum = 18;
        printPair(array, sum);

    }

} 

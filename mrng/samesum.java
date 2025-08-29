class SameSum {
    public static void main(String args[]) {
        int arr[] = {1, 1, 1, 2, 9, 6, -1};

        int l = 0, r = arr.length - 1;
        int start = 0, end = 0;

        while (l < r) {
            if (start < end) {
                start += arr[l];
                l++;
            } else {
                end += arr[r];
                r--;
            }
        }

        System.out.println("Start sum: " + start);
        System.out.println("End sum: " + end);
    }
}


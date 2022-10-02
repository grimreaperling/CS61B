package testing;

public class Sort {
    /** A method to sort the elements in the string array */
    public static void sort(String[] x) {
        sort(x, 0);
    }

    /** Sort x starting at position start */
    public static void sort(String[] x, int start) {
        if (x.length - 1 == start) {
            return;
        }
        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

    /** Swap the item a with b. */
    public static void swap(String[] x, int a, int b) {
        String tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }

    /** Return index of the smallest string in the x, starting at start */
    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}

public class Mearge {

    public static void conquer(int a[], int mid, int si, int ei) {
        int mearged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (a[idx1] <= a[idx2]) {
                mearged[x++] = a[idx1++];
            } else {
                mearged[x++] = a[idx2++];
            }
        }

        while (idx1 <= mid) {
            mearged[x++] = a[idx1++];
        }

        while (idx2 <= ei) {
            mearged[x++] = a[idx2++];
        }

        for(int i = 0, j = si; i < mearged.length; i++, j++) {
            a[j] = mearged[i];
        }

    }

    public static void divide(int a[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si)/2;
        divide(a, si, ei);
        divide(a, mid + 1, ei);
        conquer(a, mid, si, ei);
    }

    public static void main(String[] args) {
        
    }
}
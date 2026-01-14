public class Dipu {
    static void reverse(double[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            double t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        double[] arr = {5.8, 2.6, 9.0, 3.4, 7.1};
        reverse(arr);
        for (double x : arr) System.out.print(x + " ");
    }
}

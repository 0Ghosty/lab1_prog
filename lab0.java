public class lab0 {
    public static void main(String[] args){
        short[] a = new short [] {17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6 ,5 ,4, 3};
        double[] x = new double[19];
        double[][] c = new double[15][19];

        for (int n = 0; n < 19; n++){
            x[n] = ((Math.random() * (11.0 - (-13.0)) + (-13.0)));
        }

        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 19; j++){
                if (a[i] == 7){
                    c[i][j] = Math.pow(Math.E, Math.log(3 * (Math.abs(x[j]) + 1)));
                } else if (a[i] == 3 || a[i] == 5 || a[i] == 8 || a[i] == 9 || a[i] == 10 || a[i] == 12 || a[i] == 13){
                    c[i][j] = Math.pow(Math.cbrt(Math.log(Math.abs(x[j]))), (Math.pow((3 / (x[j] - 1)) / (Math.pow(x[j], x[j]) + 1), 3) / 2));
                } else {
                    c[i][j] = Math.cbrt(Math.pow(Math.E, Math.cbrt(Math.cbrt(x[j]))));
                }
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%.4f ", c[i][j]);
            }
            System.out.println("\n");
        }
    }
}
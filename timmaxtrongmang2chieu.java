public class timmaxtrongmang2chieu {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{13,14},{15,16},{18,10}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong mang la:" + max);
    }
}

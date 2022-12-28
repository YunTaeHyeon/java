public class RaggedArray {
    public static void main(String[] args) {

        int[][] ar;
        ar = new int[3][];

        ar[0] = new int[3];
        ar[1] = new int[2];
        ar[2] = new int[4];

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i].length);
        }
    }
}

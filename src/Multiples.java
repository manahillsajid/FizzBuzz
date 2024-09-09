public class Multiples {
    public static void main(String[] args) {
        for(int j = 1; j <= 1000; j++) {
            if (j % 3 == 0 || j % 5 == 0) {
                System.out.println(j);
            }
        }
    }
}

public class Multiplies {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        while (i < 1000) {
            if (i % 3 == 0) {
                num++;
            } else if (i % 5 == 0) {
                num++;
            }
            i++;
        }
        System.out.println(num);
    }
}

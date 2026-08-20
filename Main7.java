public class Main7 {
    public static void main(String[] args) {
        int t = 0; 

        for (int i = 250; i <= 750; i++) {
            int n = i;
            int p = 0;

            while (n > 0) {
                int d = n % 10;

                if (d == 2 || d == 3 || d == 5 || d == 7) {
                    p++;
                }

                n = n / 10;
            }

            if (p >= 2) {
                t++;
            }
        }

        System.out.println("minimum 2 digit is prime: " + t);
    }
}
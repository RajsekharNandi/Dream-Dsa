public class Main7{
    public static void main(String[] args) {

        int d;
        boolean flag;
        int count = 0;
        for (int i = 250; i <= 750; i++) {
            int n = i;
            flag = true;

            while (n != 0) {
                d = n % 10;

                if (d != 2 && d != 3 && d != 5 && d != 7) {
                    flag = false;
                    break;
                }

                n = n / 10;
            }

            if (flag) {
                
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}


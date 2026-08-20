class Main {
    public static void main(String[] args) {

        int d;
        boolean flag;

        for (int i = 100; i <= 999; i++) {
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
                System.out.println(i);
            }
        }
    }
}


import java.util.*;

class Student {
    int n1, n2, n3;
    String name;

    Student(String n, int a, int b, int c) {
        name = n;
        n1 = a;
        n2 = b;
        n3 = c;
    }

    public void display() {
        double percentage = (n1 + n2 + n3) / 3.0;

        System.out.println("Student Name: " + name);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Main4 {
    public static void main(String[] args) {

        int m1, m2, m3;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the details of student " + (i + 1));

            name = sc.nextLine();

            m1 = sc.nextInt();
            m2 = sc.nextInt();
            m3 = sc.nextInt();

            
            sc.nextLine();

            s[i] = new Student(name, m1, m2, m3);
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Details of student " + (i + 1));
            s[i].display();
        }

        sc.close();
    }
}
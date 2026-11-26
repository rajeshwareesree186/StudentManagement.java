

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Student s = new Student(id, name, dept);

        System.out.print("\nEnter Subject 1 Marks: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        int m3 = sc.nextInt();

        s.setMarks(m1, m2, m3);

        s.displayStudent();

        sc.close();
    }
}

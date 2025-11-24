import java.util.Scanner;

class Student {
    int rno;
    String name;
    int marks;


    Student(int rno, String name,int marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student RNO: " + this.rno);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Marks: " + this.marks);
        System.out.println("----------------------------");
    }
}

public class ArrayofObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Student RNO: ");
            int rno = sc.nextInt();

            System.out.print("Enter Student Name: ");
            String name = sc.next();

            System.out.print("Enter Student Marks: ");
            int marks = sc.nextInt();

            arr[i] = new Student(rno, name, marks);
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            arr[i].display();
        }
    }
}
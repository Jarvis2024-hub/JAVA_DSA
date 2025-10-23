package PROJECTS;

import java.util.*;

class Student {
    String name;
    int[] marks;
    double avg;
    String grade;

    // Constructor
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.avg = calculateAvg();
        this.grade = assignGrade();
    }

    double calculateAvg() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    String assignGrade() {
        return (avg >= 90) ? "A" :
               (avg >= 80) ? "B" :
               (avg >= 70) ? "C" :
               (avg >= 60) ? "D" :
               (avg >= 50) ? "E" : "F";
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) System.out.print(mark + " ");
        System.out.println("\nAverage: " + avg + "\nGrade: " + grade);
        System.out.println("---------------------------------------");
    }
}

public class studentResultMgmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("=== Student Result Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // fix → consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter number of subjects: ");
                    int n = sc.nextInt();

                    int[] marks = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter mark for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                    students.add(new Student(name, marks));
                    System.out.println("Student " + name + " added successfully!\n");
                    break;
                }

                case 2: {
                    if (students.isEmpty()) {
                        System.out.println("No students found!\n");
                    } else {
                        System.out.println("=== All Student Details ===");
                        for (Student s : students) {
                            s.displayInfo();
                        }
                        System.out.println();
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter the student's name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Student s : students) {
                        if (s.name.equalsIgnoreCase(searchName)) {
                            s.displayInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("No student found!\n");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Exiting system. Be safe!");
                    break;
                }

                default:
                    System.out.println("Enter a valid option (1–4)!\n");
            }
        } while (choice != 4);

        sc.close();
    }
}

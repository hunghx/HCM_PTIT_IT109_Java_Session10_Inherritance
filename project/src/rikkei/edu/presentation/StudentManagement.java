package rikkei.edu.presentation;

import rikkei.edu.business.StudentManager;
import rikkei.edu.entity.Student;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Student Management System!");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show Student List");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    showStudentList();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    private static void showStudentList(){
        Student[] list = StudentManager.findAll();
        int size = StudentManager.size();
        if(size == 0){
            System.err.println("Danh sách trong");
            return;
        }
        System.out.println("Danh sách sinh vien");
        for (int i = 0; i <size ; i++) {
            System.out.println(list[i]);
        }
    }
}

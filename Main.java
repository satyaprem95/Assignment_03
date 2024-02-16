package assignment3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        studentFunctions studfuncs = new studentFunctions();
        boolean run= true;
        int choice;

        do{
            System.out.print("\n\nWhat operation do you want to perform:\n1)Add Student\n2)Display Student Details\n3)Search\n4)Edit Student Detail\n5)Delete Student\n6)Exit\n=");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    studfuncs.addStudent();
                    break;

                case 2:
                    studfuncs.printStudentDetails();
                    break;

                case 3:
                    studfuncs.searchStudent();
                    break;

                case 4:
                    studfuncs.editStudent();
                    break;

                case 5:
                    studfuncs.deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you for using");
                    run = false;
                    break;
            }
        }while(run);
    }
}

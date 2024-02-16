package assignment3;
import java.util.ArrayList;
import java.util.Scanner;

public class studentFunctions {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent()
    {
        System.out.print("\nHow many students do you want to enter: ");
        int totalEnter = sc.nextInt();

        for(int i=0; i<totalEnter; i++)
        {
            System.out.print("\nPRN: ");
            int prn = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Total Marks: ");
            float marks = sc.nextFloat();

            System.out.print("DOB: ");
            String dob = sc.next();

            studentList.add(new Student(prn, name, dob, marks));
        }
    }

    public void printStudentDetails()
    {
        for (Student student : studentList) {
            int prn = student.getPRN();
            String name = student.getName();
            String dob = student.getDob();
            float marks = student.getMarks();

            System.out.print("\n\nPRN: " + prn + "\nName: " + name + "\nDOB: " + dob + "\nMarks: " + marks);
        }
    }

    public void searchStudent()
    {
        System.out.print("\nBy what parameter do you want to search: \n1)PRN\n2)Name\n3)Index\n=");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.print("Enter the PRN you want to search: ");
                int prn = sc.nextInt();

                for (Student student : studentList)
                {
                    if (student.getPRN() == prn)
                    {
                        String name = student.getName();
                        String dob = student.getDob();
                        float marks = student.getMarks();
                        System.out.println("\n\nPRN: " + prn + "\nName: " + name + "\nDOB: " + dob + "\nMarks: " + marks);
                    }
                    else
                    {
                        System.out.println("Student not found!");
                    }
                }
                break;

            case 2:
                System.out.print("Enter the name you want to search: ");
                String name = sc.next();

                for (Student student : studentList)
                {
                    if (name.equals(student.getName()))
                    {
                        int prn1 = student.getPRN();
                        String dob = student.getDob();
                        float marks = student.getMarks();
                        System.out.println("\n\nPRN: " + prn1 + "\nName: " + name + "\nDOB: " + dob + "\nMarks: " + marks);
                    }
                    else
                    {
                        System.out.println("Student not found!");
                    }
                }
                break;

            case 3:
                System.out.print("Enter the index you want to search: ");
                int index = sc.nextInt();

                Student student = studentList.get(index);

                int prn_index = student.getPRN();
                String name_index = student.getName();
                String dob_index = student.getDob();
                float marks_index = student.getMarks();
                System.out.println("\n\nPRN: " + prn_index + "\nName: " + name_index + "\nDOB: " + dob_index + "\nMarks: " + marks_index);
                break;
        }
        }

    public void editStudent()
        {
            System.out.print("Enter the PRN of student you want to edit: ");
            int prn = sc.nextInt();

            for (Student student : studentList)
            {
                if (student.getPRN() == prn)
                {
                    System.out.println("Student Found! \nEnter the new details below:");
                    System.out.print("PRN: ");
                    int prn_edit = sc.nextInt();

                    System.out.print("Name: ");
                    String name_edit = sc.next();

                    System.out.print("Total Marks: ");
                    float marks_edit = sc.nextFloat();

                    System.out.print("DOB: ");
                    String dob_edit = sc.next();

                    studentList.set(studentList.indexOf(student), new Student(prn_edit, name_edit, dob_edit, marks_edit));

                }
                else
                {
                    System.out.println("Student not found!");
                }
            }
        }

    public void deleteStudent()
        {
            System.out.print("Enter the PRN of student you want to delete: ");
            int prn = sc.nextInt();
//            Student s_delete = new Student(0,"X","Y",0);

            for (Student student : studentList)
            {
                if (student.getPRN() == prn)
                {
                    System.out.println("Student Found!\nStudnet Details Deleted");

                    studentList.remove(student);
                    break;
                }
                else
                {
                    System.out.println("Student not found!");
                    return;
                }
            }
        }
}

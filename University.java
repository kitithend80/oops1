public class University {
    String universityName;

    University(String universityName) {
        this.universityName = universityName;
    }

    class Department {
        String deptName;
        String deptCode;

        Department(String deptName, String deptCode) {
            this.deptName = deptName;
            this.deptCode = deptCode;
        }

        void displayDepartmentDetails() {
            System.out.println("University Name: " + universityName);
            System.out.println("Department Name: " + deptName);
            System.out.println("Department Code: " + deptCode);
        }
    }

    class Student {
        String studentName;
        int rollNumber;

        Student(String studentName, int rollNumber) {
            this.studentName = studentName;
            this.rollNumber = rollNumber;
        }

        void displayStudentDetails() {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll Number: " + rollNumber);
        }
    }

    public static void main(String[] args) {
        University university = new University("AMRITA VISHWA VIDYAPEETHAM");

        University.Department department = university.new Department("Computer Science", "CSE011");
        University.Student student = university.new Student("A.SAMHITHA", 24011);

        department.displayDepartmentDetails();
        System.out.println();
        student.displayStudentDetails();
    }
}

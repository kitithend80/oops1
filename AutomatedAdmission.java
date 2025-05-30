class Student {
    String name;
    double percentage;

    Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    void studentsinfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Percentage: " + percentage);
    }
}

class UG extends Student {
    UG(String name, double percentage) {
        super(name, percentage);
    }

    void checkEligibility() {
        if (percentage >= 60) {
            System.out.println(name + " is eligible for admission in UG.");
        } else {
            System.out.println(name + " is not eligible for admission in UG.");
        }
    }
}

class PG extends Student {
    PG(String name, double percentage) {
        super(name, percentage);
    }

    void checkEligibility() {
        if (percentage >= 70) {
            System.out.println(name + " is eligible for admission in PG.");
        } else {
            System.out.println(name + " is not eligible for admission in PG.");
        }
    }
}

public class AutomatedAdmission {
    public static void main(String[] args) {
        UG ug = new UG("Samhitha", 80);
        ug.studentsinfo();
        ug.checkEligibility();

        PG pg = new PG("Akku", 75);
        pg.studentsinfo();
        pg.checkEligibility();
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displaySuper() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    String specialization;
    String hospital;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctorInfo() {
        displaySuper();
        System.out.println("Specialization: " + specialization);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayTeacherInfo() {
        displaySuper();
        System.out.println("Subject: " + subject);
    }
}

class Lawyer extends Person {
    String field;
    int casesWon;

    Lawyer(String name, int age, String field) {
        super(name, age);
        this.field = field;
    }

    void display() {
        displaySuper();
        System.out.println("Field: " + field);
    }
}

public class inherit2 {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Rahul", 40, "Cardiologist");
        Teacher t1 = new Teacher("Anita", 35, "Mathematics");
        Lawyer l1 = new Lawyer("Arjun", 45, "Criminal Law");

        System.out.println("Doctor Info");
        d1.displayDoctorInfo();

        System.out.println("\nTeacher:");
        t1.displayTeacherInfo();

        System.out.println("\nLawyer:");
        l1.display();
    }
    
}

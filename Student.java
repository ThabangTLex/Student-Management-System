
    package model;

    public abstract class Student {

        protected String studentId;
        protected String name;
        protected String email;
        protected String department;

        public Student(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public abstract double calculateTuition();
        public abstract String getStudentType();

        public void displayStudentDetails() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Department: " + department);
            System.out.println("Student Type: " + getStudentType());
            System.out.println("Tuition: $" + calculateTuition());
        }
    }



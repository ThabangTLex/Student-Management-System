package model;

public class UndergraduateStudent extends Student {

    private int creditHours;
    private double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double tuitionPerCredit = 300.0;
        double total = creditHours * tuitionPerCredit;
        return total - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship Amount: $" + scholarshipAmount);
        System.out.println("-----------------------------------");
    }

    // ===== BUILDER CLASS =====
    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;

        private int creditHours;
        private double scholarshipAmount = 0.0; // optional default

        public Builder(String studentId, String name, String email, String department) {
            this.studentId = studentId;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}


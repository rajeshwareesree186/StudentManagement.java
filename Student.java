
class Student {

    private int studentId;
    private String name;
    private String department;
    private int subject1;
    private int subject2;
    private int subject3;

   
    Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    
    public void setMarks(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    
    public int calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

   
    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return "A+";
        } 
        else if (average >= 80) {
            return "A";
        } 
        else if (average >= 70) {
            return "B";
        } 
        else if (average >= 60) {
            return "C";
        } 
        else if (average >= 50) {
            return "D";
        } 
        else {
            return "Fail";
        }
    }

    public String calculateResult() {

        if (subject1 >= 35 && subject2 >= 35 && subject3 >= 35) {
            return "PASS";
        } 
        else {
            return "FAIL";
        }
    }
    public void displayStudent() {

        System.out.println("\n===== STUDENT REPORT =====");

        System.out.println("Student ID   : " + studentId);
        System.out.println("Name         : " + name);
        System.out.println("Department   : " + department);

        System.out.println("Subject 1    : " + subject1);
        System.out.println("Subject 2    : " + subject2);
        System.out.println("Subject 3    : " + subject3);

        System.out.println("Total Marks  : " + calculateTotal());
        System.out.println("Average      : " + calculateAverage());
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("Result       : " + calculateResult());
    }
}

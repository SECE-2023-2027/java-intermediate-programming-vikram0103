package Problem2;
class Student {
    private String studentId;
    private String studentName;
    private int mark1;
    private int mark2;
    private int mark3;

    public Student(String studentId, String studentName, int mark1, int mark2, int mark3) {
        this.studentId = studentId;
        this.studentName = studentName;
        setMark1(mark1);
        setMark2(mark2);
        setMark3(mark3);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public void setMark1(int mark1) {
        this.mark1 = (mark1 < 0 || mark1 > 100) ? 0 : mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = (mark2 < 0 || mark2 > 100) ? 0 : mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = (mark3 < 0 || mark3 > 100) ? 0 : mark3;
    }

    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90)
            return 'A';
        else if (avg >= 80)
            return 'B';
        else if (avg >= 70)
            return 'C';
        else if (avg >= 60)
            return 'D';
        else
            return 'F';
    }
}
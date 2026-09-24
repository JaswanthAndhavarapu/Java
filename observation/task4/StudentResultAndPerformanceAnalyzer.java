class Student {
    int rollNo;
    String name;
    int[] marks;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int total() {
        int t = 0;
        for (int m : marks)
            t += m;
        return t;
    }

    int highest() {
        int h = marks[0];
        for (int m : marks)
            h = Math.max(h, m);
        return h;
    }

    int lowest() {
        int l = marks[0];
        for (int m : marks)
            l = Math.min(l, m);
        return l;
    }

    double percentage() {
        return Math.round(total() / 5.0 * 100) / 100.0;
    }

    String grade() {
        double p = percentage();

        if (p >= 90) return "A+";
        if (p >= 80) return "A";
        if (p >= 70) return "B";
        if (p >= 60) return "C";
        if (p >= 50) return "D";
        return "F";
    }

    void display() {
        String n = name.trim().toUpperCase();

        System.out.println("STUDENT PERFORMANCE REPORT");
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Name        : " + n);
        System.out.println("Name Length : " + n.length());
        System.out.println("Total       : " + total() + "/500");
        System.out.println("Average     : " + total() / 5.0);
        System.out.println("Highest     : " + highest());
        System.out.println("Lowest      : " + lowest());
        System.out.println("Percentage  : " + percentage() + "%");
        System.out.println("Grade       : " + grade());
        System.out.println("Result      : " + (percentage() >= 50 ? "PASS" : "FAIL"));
        System.out.println("Remark      : " +
                (grade().equals("A+") ? "Excellent" :
                 grade().equals("A") ? "Very Good" :
                 grade().equals("B") ? "Good" :
                 grade().equals("C") ? "Satisfactory" :
                 grade().equals("D") ? "Needs Improvement" : "Work Hard"));
    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 88, 95};

        Student s = new Student(101, "  Jaswanth  ", marks);
        s.display();
    }
}

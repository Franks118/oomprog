public class Students {
    private int id;
    private String name;
    private String course;
    private double gpa;

    public Students(int id, String name, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.gpa = gpa;
    }

    public int getID() {
        return this.id;
    }

    public String getN() {
        return this.name;
    }

    public String getCourse() {
        return this.course;
    }

    public double getGpa() {
        return this.gpa;
    }
}


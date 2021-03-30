class Student {

    private String name;
    private String id;
    private float gpa;

    public Student(String name, String id, float gpa)
    {
        this.name = name;
        this.gpa = gpa;
        this.id = id;

        // gpa = [0,4]
        if(this.gpa < 0)
            this.gpa = 0;
        else if(this.gpa > 4)
            this.gpa = 4;
    }

    public String getName() {
        return name;
    }

    public float getGPA() {
        return gpa;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " | ID: " + this.id + " | GPA: " + String.format("%.2f", this.gpa);
    }
}

class Undergrad extends Student {

    private int year;

    public Undergrad(String name, String id, int year, float gpa) {
        super(name, id, gpa);
        this.year = year;

        if(this.year < 1)
            this.year = 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " | ID: " + this.getId() + " | Year: " + this.year + " | GPA: " + String.format("%.2f", this.getGPA());
    }
}

class Graduate extends Student {

    private String thesisTitle;

    public Graduate(String name, String id, float gpa, String thesisTitle) {
        super(name, id, gpa);
        this.thesisTitle = thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " | ID: " + this.getId() + " | GPA: " + String.format("%.2f", this.getGPA()) + " | Thesis Title: " + this.thesisTitle;
    }
}

public class GraduateMain {

    public static void main(String args[])
    {
        Graduate std = new Graduate("Bruh", "1010110001", 2.50f,"Title");

        System.out.println("Before:");
        System.out.println(std);

        std.setName("i sucks lol");
        std.setThesisTitle("still title");
        System.out.println("\nAfter:");
        System.out.println(std);
    }

}

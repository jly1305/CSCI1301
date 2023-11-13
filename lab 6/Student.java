public class Student {

     private double gpa;
     private int id;
     private String name;


    public void setgpa(double GPA) {
        gpa = GPA;
    }

    public void setid(int ID) {
        id = ID;
    }

    public void setname(String NAME) {
        name = NAME;
    }

    public double getgpa() {
        return gpa;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public Student (String NAME, double GPA, int ID)
    {
        gpa = GPA;
        name = NAME;
        id = ID;
    }

      public String toString() {
        return "\n***Print Student Information***" +
         "\nStudent Name: __" + name + "___\nStudent ID: ___" + id + "___\nStudent GPA: ___" + gpa + "___";
    }

   

}  
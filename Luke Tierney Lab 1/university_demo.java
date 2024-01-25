public class university_demo {
   
   public static void main(String[] args) {
      
      university student1 = new university("Luke","GCSU",99);
      university student2 = new university("O block","KSU",69);
      System.out.println(student1.toString());
      
      System.out.println("The information is : " + student1);
      System.out.println(student2);      
      
      System.out.println("Number of students: " + student1.getCount());
      }
  }
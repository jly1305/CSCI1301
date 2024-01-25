public class university {

   private String name;
   private String abbreviation;
   private int rank;
   private static int count;
   
   public university(String name, String abbreviation, int rank) {
      this.name = name;
      this.abbreviation = abbreviation;
      this.rank = rank; 
      increase();
   }
   
   public void setName(String newName) {
      this.name = newName;
   }
   
   public void setAbbreviation(String newAbbreviation) {
      this.abbreviation = newAbbreviation;
   }
   
   public void setRank(int newRank) {
      this.rank = newRank;
   }
   
   public String toString() {
      return ("Name:" + name + " Abbreviation:" + abbreviation + " Rank:" + rank); 
   }
    
   private static void increase() {
      count++;
   }
   
   public static int getCount() {
      return count;
   }
   
   
   
}
   
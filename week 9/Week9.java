// A = remove static form sleep methods
public class Week9 {
  public class Animal{
    private String breed;
    private String eye;
    private int weight;
    private int height;
  
  
    public Animal(){
      this.breed = "mamal";
      this.eye = "Brown";
      this.weight = 25; /*In KG */
      this.height = 2; /*In M */
    }
  
    public Animal(String a){
      this.breed = a;
      this.eye = "Brown";
      this.weight = 25; /*In KG */
      this.height = 2; /*In M */
    }
  
    public Animal(String a, String b){
      this.breed = a;
      this.eye = b;
      this.weight = 25; /*In KG */
      this.height = 2; /*In M */
    }
  
    public Animal(String a, String b, int c){
      this.breed = a;
      this.eye = b;
      this.weight = c; /*In KG */
      this.height = 2; /*In M */
    }
  
    public Animal(String a, String b, int c, int d){
      this.breed = a;
      this.eye = b;
      this.weight = c; /*In KG */
      this.height = d; /*In M */
    }
   public String sound(){
     return "make sound";
   }
  }
  public class dog extends Animal{
      public dog(String a, String b){
        super(a, b, 5, 1);
      }
      public String sound(){
        return "WOOF";
      }
  }
}

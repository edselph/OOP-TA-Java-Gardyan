import java.util.*;
public class part2 {
  public static void main(String[] args){
    Vector <Studata> SD = new Vector <Studata>();
    SD.add(new Studata("2440074174","Morris Kim", "Violet"));
    SD.add(new Studata("2440102493","Raffles Teh Weihan", "Green"));
    SD.add(new Studata("2440081614","Edward", "Blue"));
    SD.add(new Studata("2440105785","Hassan Mohamed Hasan", "Red"));
    SD.add(new Studata("2440061285","Monique Senjaya", "Blue"));
    SD.add(new Studata("2440100273","Ariel Putra", "Yellow"));
    SD.add(new Studata("2440065163","Ardelia Shaula Araminta", "Black"));
    SD.add(new Studata("2440077301","Jason Jeremy Wijadi", "White"));
    SD.add(new Studata("2440071973","Raphael Reynaldi", "Red"));

    Studata key;
    int u;
    
    for(int i = 1; i<SD.size(); i++){
      key = SD.get(i);

      u = i-1;

      while(u>= 0 && SD.get(i-1).Name.compareTo(key.Name)>0){
        SD.set(u+1, SD.get(u));
      }
      SD.set(u+1, key);
    }

    System.out.println("Sort by Name:");
    System.out.println("................");
    for(Studata Student : SD){
      Student.printString();
    }

    System.out.println("................");
    System.out.println();
    
    for(int i = 1; i <SD.size(); i++){
      key =SD.get(i);
     u = i - 1;
      while(u >= 0 &&SD.get(i - 1).Color.compareTo(key.Color) > 0){
         SD.set(u+1,SD.get(u)); 
          u --;
      }
     SD.set(u +1, key);
  }

  System.out.println("Sorted by Color:");
  System.out.println("................");
  for(Studata student: SD){
      student.printString();
  }
  System.out.println("................");
 }
}
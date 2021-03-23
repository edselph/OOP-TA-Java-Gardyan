import java.util.*;
public class part2b {
  public static void main(String[] args){

    ArrayList<Studata>SD = new ArrayList<Studata>();
   SD.add(new Studata("Edsel Putra Harren", "Red Velvet", "2440081942"));
   SD.add(new Studata("Jason Jeremy Wijadi", "White", "2440077301"));
   SD.add(new Studata("Monique Senjaya", "Blue", "2440061285"));
   SD.add(new Studata("Morris Kim", "Violet", "2440074174"));
   SD.add(new Studata("Ardelia Shaula Araminta", "Black", "2440065163"));

    Studata key;
    int u;

    for(int i = 1; i <SD.size(); i++){
        key =SD.get(i);
       u = i - 1;
        while(u >= 0 &&SD.get(i - 1).Name.compareTo(key.Name) > 0){
           SD.set(u+1,SD.get(u)); 
            u--;
        }
       SD.set(u+1, key);
    }

    System.out.println("Sorted by name:");
    System.out.println("................");
    for(Studata student:SD){
        student.printString();
    }
    System.out.println("................");
    System.out.println();

    for(int i = 1; i <SD.size(); i++){
        key =SD.get(i);
       u = i - 1;
        while(u >= 0 &&SD.get(i - 1).Color.compareTo(key.Color) > 0){
           SD.set(u+1,SD.get(u)); 
            u--;
        }
       SD.set(u+1, key);
    }
    //print
    System.out.println("Sorted by Color:");
    System.out.println("................");
    for(Studata student:SD){
        student.printString();
    }
    System.out.println("................");
  }
}
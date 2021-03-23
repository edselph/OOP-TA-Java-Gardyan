public class Array_alpha_part1 {
  public static void main(String[] args){

    String [] Names = { "Morris Kim", "Raffles Teh Weihan",
     "Edward", "Hassan Mohamed Hasan", "Monique Senjaya",
     "Ariel Putra", "Ardelia Shaula Araminta", 
     "Jason Jeremy Wijadi", "Raphael Reynaldi"
    };

    String [] Color ={ "Violet", "Green", "Blue",
     "Red", "Blue", "Yellow",
     "Black", "White", "Red"
    };

    String [] Ids = { "2440074174", "2440102493", "2440081614",
     "2440105785", "2440061285", "2440100273", 
     "2440065163", "2440077301" , "2440071973"
    };

    String key1, key2, key3;
    int u;

    for(int i = 1; i < Names.length; i++){
      key1 = Names[i];
      key2 = Color[i];
      key3 = Ids[i];
      u = i - 1;
      while(u >= 0 && Names[u].compareTo(key1) > 0){
          Names[u+1] = Names[u];
          Color[u+1] = Color[u];
          Ids[u+1] = Ids[u];
          u--;
      }
      Names[u+1] = key1;
      Color[u+1] = key2;
      Ids[u+1] = key3;
  }

  System.out.println("Sorted by name:");
  System.out.println("=============================================");
  for(int i = 0; i < Names.length; i++){
      System.out.println(Ids[i] + " | " + Names[i] + " | " + Color[i] + " | ");
  }
  System.out.println("=============================================");
  System.out.println();

  for(int i = 1; i < Color.length; i++){
      key1 = Names[i];
      key2 = Color[i];
      key3 = Ids[i];
      u = i - 1;
      while(u >= 0 && Color[u].compareTo(key2) > 0){
          Names[u+1] = Names[u];
          Color[u+1] = Color[u];
          Ids[u+1] = Ids[u];
          u--;
      }
      Names[u+1] = key1;
      Color[u+1] = key2;
      Ids[u+1] = key3;
  }

  System.out.println("Sorted by colour:");
  System.out.println("=============================================");
  for(int i = 0; i < Names.length; i++){
      System.out.println(Ids[i] + " | " + Names[i] + " | " + Color[i] + " | ");
  }
  System.out.println("=============================================");
 }
}
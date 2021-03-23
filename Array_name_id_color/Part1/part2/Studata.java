public class Studata {
  
    String Name;
    String Color;
    String Ids;

    public Studata(String n, String c, String i){
        Name = n;
        Color = c;
        Ids = i;
        return;
    }

    public void printString(){
        String printString ="| " + Ids + " | " + Name + " | " + Color + " | ";
        System.out.println(printString);
    }
}


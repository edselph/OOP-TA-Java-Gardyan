interface Dog {
  int eye = 2;
  int tail = 1;
  int limb = 4;
  String breed = " ";

  default String makeSound(){
    return null;
  }
}

abstract class Golden implements Dog{
  String breed = "Golden big boy";
  int tail = 9;

  @Override
  public String makeSound() {
     return null;
  }
}

class MyGolden extends Golden {
  String breed = "Golden big boy";
  int tail = 9;
  String name = "Cubby";

  @Override
  public String makeSound(){
    return "Woofie wof wof";
  }

  String chaseCat(){
    return "Cubby casing a cat wof wof";
  }
}
public class Matrix{
  public static void main(String[] args){
    int m1[][] = {
                  {3,5},
                  {4,2}
                 };
    int m2[][] = {
                  {9,8},
                  {7,6}
                 };
    int sum = 0;
    int m3[][] = new int[2][2];
    
    for(int i=0;i<2;i++){
      for(int o=0; o<2 ;o++){
        for(int p=0;p<2;p++){
          sum = sum + m1[i][o]*m2[o][p];{
            m3[i][o] = sum;
          }
        }
      }
    }
    for(int i=0;i<2;i++){
      for(int o=0;o<2;o++){
        System.out.println(m3[i][o]+ "  ");{
          System.out.println();
        }
      }
    }

    System.out.println("=============");
    System.out.println("Dot Section");

    /// DOT ///
    int x[] = {2,4,6};
    
    int z[] = {7,5,2};
    int sum_dot = 0;
    int DOT[] = new int [3];

    for(int q=0;q<x.length;q++){
      sum_dot = sum_dot + x[q]*z[q];
      DOT[q] = sum_dot;
      System.out.println("The DOT is = "+ DOT[q]);
    }
  }
}
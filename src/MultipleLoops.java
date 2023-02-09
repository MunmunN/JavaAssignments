public class MultipleLoops {
  public static void main(String[]args){
//    for(int i=1; i<=4;i++){//i--rows
//      //i==1
//      for(int j=1; j<=5; j++){//i=1 & j=1-----j=columns
//        System.out.print("*");
//      }
//      //i=1
//      System.out.println();
//    }


    for(int i=1; i<=5;i++){//i--rows
      //i==1
      for(int j=i; j<=5; j++){//i=1 & j=1-----j=columns
        System.out.print("*");
      }
      //i=1
      System.out.println();
    }




  }
}

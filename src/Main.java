public class Main {

  public static void main(String[] args) {
    int num=1000;
    for(int i=1; i<=10; i++)
    {
//      if(i%2==0){
////        System.out.println(i+"");
//      }
      if(i==4){

        continue;
      }
      if(i==8){
        break;
      }

      System.out.println(i+"");

    }

  }
}

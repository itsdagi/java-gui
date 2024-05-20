package theAbstract;
abstract class Absx{
    int myInt = 9;
   abstract public void showMe();
}

 class Concx extends Absx{
  public void showMe(){
        System.out.println("Now this.");
    }
 }

public class Demo3 {
    public static void main(String[] args){
        Concx c = new Concx();
        Absx a = new Concx();
        System.out.println(a.myInt);
    }
}

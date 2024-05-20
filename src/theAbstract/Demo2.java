package theAbstract;
abstract class Abs{
    abstract void ShowMe();
    public void method1(){
        System.out.println("Originally, I am from method1 in Abs class. But I am complete");
    }
    public void method2(){
        System.out.println("Originally, I am from method2 in abs class, but I am also complete");
    }
}
 class Conc extends Abs {
     @Override
     void ShowMe() {

     }

     public void method1(){
        System.out.println("Now I am method1 from conc class");
    }

}
public class Demo2{
    public static void main(String[] args){
        System.out.println("-- abstract class demo 2 --");
        Conc co = new Conc();
        co.method1();

        Abs a = new Conc();


        a.method2();
    }
}

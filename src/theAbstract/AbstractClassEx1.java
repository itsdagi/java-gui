package theAbstract;

abstract class Myabs {

    public abstract void showMe();{

    }
        }
 class myConcrete extends Myabs{

    @Override
    public void showMe(){
        System.out.println("I am from concrete class :");
        System.out.println("I am suppliying the method body for showMe()");
    }
 }

public interface AbstractClassEx1 {
    public static void main(String[] args){
        System.out.println("** abstract class demo ! **");
     myConcrete co = new myConcrete();
     co.showMe();
    }
}

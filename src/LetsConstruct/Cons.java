package LetsConstruct;

 class Ho {
    Ho(){
        System.out.println("This is a constructor of Hos");
    }

}
class What extends Ho{
    What(){
        System.out.println("This is a constructor of What");
    }
}
public class Cons {
    public static void main(String[] args){
        What what = new What();
    }
}
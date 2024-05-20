package methodover;
class ParentCov{
    int i;
    int getMultipliedNumber(int x){
        System.out.println("Inside Parent");
        this.i=x;
        return (int)(i*1.75);
    }
}

class ChildCov extends ParentCov{
    int getMultipliedNumber(int x){
        //error: Return type incompatible
        // double getMultipliedNumber(int x)

        System.out.println("Inside Child");
        this.i = x;
        return i*50;
    }
}

public class MethodOver {
    public static void main(String[] args) {
    ParentCov pOb = new ParentCov();
    int result1 = pOb.getMultipliedNumber(10);
    System.out.println(result1);

    pOb = new ChildCov();

    result1 = pOb.getMultipliedNumber(10);
    System.out.println(result1);
    }
}
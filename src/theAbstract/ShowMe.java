package theAbstract;
abstract class Hummx {
      public void how(){
           System.out.println("why not me");
       }
}
class ConcHum extends Hummx{
        public void how(){

    }
}
class ShowMe{
    public static void main(String[] args){
        Hummx h = new ConcHum();

        h.how();
    }
}
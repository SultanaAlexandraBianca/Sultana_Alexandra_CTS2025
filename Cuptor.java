package singleton;
public class Cuptor {
    private static Cuptor instanta=null;
    private String preparat;
    private Cuptor(){
        this.preparat=preparat;
        System.out.println("Acesta este preparatul");

    }
    public static synchronized Cuptor getInstance(){
        if(instanta==null)
        {instanta=new Cuptor();}
        return instanta;
    }

        public void descrierePreparat(){
            System.out.println("Acest preparat se va gati:");
        }
}

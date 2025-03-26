package singleton;
public class ConexiuneBD {
   private static ConexiuneBD instanta=null;
   private ConexiuneBD(){
       System.out.println("Constructor Apelat");

   }
   public static synchronized ConexiuneBD getInstance(){
       if(instanta==null)
       {
           instanta=new ConexiuneBD();
       }
       return instanta;
   }
   public void conecteaza(){
       System.out.println("Conectat la baza de date");

   }
}

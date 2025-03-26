//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package singleton;
import singleton.ConexiuneBD;


public class Main {
    public static  void main(String[]args)
    {
        ConexiuneBD conexiune1= ConexiuneBD.getInstance();
        conexiune1.conecteaza();
        ConexiuneBD conexiune2=ConexiuneBD.getInstance();
        conexiune2.conecteaza();
        System.out.println("Sunt aceeasi instanta?" + (conexiune1==conexiune2));



    }
}

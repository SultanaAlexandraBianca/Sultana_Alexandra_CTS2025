//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package builder;
import builder.PTBuilder;
import builder.PachetTransport;


public class Main {
    public static void main(String[] args) {
        PachetTransport pachet1= new PTBuilder()
                .areWifi()
                .areAerConditionat()
                .build();


        PachetTransport pachet2= new PTBuilder()
                .areWifi()
                .areLocdejoaca()
                .build();


        System.out.println("Pachet 1:");
        pachet1.AfiseazaDetalii();
        System.out.println(" Pachet 2:");
        pachet2.AfiseazaDetalii();
        }

}
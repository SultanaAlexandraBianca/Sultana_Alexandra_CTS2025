package builder;
public class PachetTransport {
    private boolean areWifi;
    private boolean areAerConditionat;
    private boolean areLocdejoaca;

    public PachetTransport(boolean areWifi, boolean areLocdejoaca, boolean areAerConditionat)
    {
        this.areAerConditionat=areAerConditionat;
        this.areLocdejoaca=areLocdejoaca;
        this.areWifi=areWifi;

    }
    public void AfiseazaDetalii()
    {
        System.out.println("Pachet Transport");
        System.out.println("Are Wifi?"+(areWifi? 1:0));
        System.out.println("Are aer Conditionat?"+(areAerConditionat? 1:0));
        System.out.println("Are Loc de Joaca?"+(areLocdejoaca? 1:0));
    }
}

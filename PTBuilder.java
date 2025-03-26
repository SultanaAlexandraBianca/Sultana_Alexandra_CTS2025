package builder;

public class PTBuilder {
    private boolean areWifi;
    private boolean areAerConditionat;
    private boolean areLocdejoaca;

    public PTBuilder areWifi(){
        this.areWifi=true;
        return this;

    }
    public PTBuilder areAerConditionat(){
        this.areAerConditionat=true;
        return this;
    }
    public PTBuilder areLocdejoaca(){
        this.areLocdejoaca=true;
        return this;
    }
    public builder.PachetTransport build(){
        return new builder.PachetTransport(areWifi,areLocdejoaca,areAerConditionat);
    }
}

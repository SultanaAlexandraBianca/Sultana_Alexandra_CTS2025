package factory_method;

public class FabricaTurGhidat implements factory_method.FabricaPT {
    @Override
    public factory_method.PachetTuristic crearePachet(){
        return new factory_method.PachetTurGhidat();
    }
}

package gof.comportamental.mediator;

public interface IATCMediator {

    public void registerRunWay(Runway runway);
    public void registerFlight(Flight flight);
    public boolean isLandingOk();
    public void setLandingStatus(boolean status);
}

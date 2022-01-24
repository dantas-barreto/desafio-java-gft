package gof.estrutural.Flyweight;

public class CounterTerrorist implements Player {

    private final String TASK;

    private String wearpon;

    public CounterTerrorist() {
        TASK = "DEFFUSE BOMB";
    }

    @Override
    public void assignWearpon(String wearpon) {
        this.wearpon = wearpon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with wearpon " + wearpon + " | Task is " + TASK);
    }
}

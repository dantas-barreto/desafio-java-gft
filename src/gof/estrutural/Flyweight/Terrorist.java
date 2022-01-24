package gof.estrutural.Flyweight;

public class Terrorist implements Player {

    private final String TASK;

    private String wearpon;

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    @Override
    public void assignWearpon(String wearpon) {
        this.wearpon = wearpon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with wearpon " + wearpon + " | Task is " + TASK);
    }
}

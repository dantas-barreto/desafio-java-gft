package gof.comportamental.chainOfResponsability;

public class ZeroProcessor extends Processor {

    public ZeroProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor: " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}

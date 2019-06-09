package lab05.ex01;

public class Pork implements Commodity {
    private Temperature temperature = Temperature.WARM;
    private State state = State.SOLID;

    @Override
    public Temperature getTemperature() {
        return this.temperature;
    }

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "commodity = Pork [" +
                "Temperature()=" + temperature +
                ", State()=" + state +
                ']';
    }
}
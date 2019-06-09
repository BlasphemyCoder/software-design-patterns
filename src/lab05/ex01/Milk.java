package lab05.ex01;

public class Milk implements Commodity {
    private Temperature temperature = Temperature.WARM;
    private State state = State.LIQUID;

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
        return "commodity = Milk [" +
                "Temperature()=" + temperature +
                ", State()=" + state +
                ']';
    }
}

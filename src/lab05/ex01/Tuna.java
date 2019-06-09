package lab05.ex01;

public class Tuna implements Commodity {
    private Temperature temperature = Temperature.COLD;
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
        return "commodity = Tuna [" +
                "Temperature()=" + temperature +
                ", State()=" + state +
                ']';
    }
}
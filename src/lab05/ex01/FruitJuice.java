package lab05.ex01;

public class FruitJuice implements Commodity {
    private Temperature temperature = Temperature.COLD;
    private State state = State.LIQUID;
    private String fruit = "Orange";

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
        return "commodity = FruitJuice [" +
                "Fruit()=" + fruit +
                ", Temperature()=" + temperature +
                ", State()=" + state +
                ']';
    }
}

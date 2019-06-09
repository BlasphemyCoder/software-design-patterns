package lab05.ex01;

public class ContainerFactory {

    // Factory method that returns a specific container depending on the specified commodity (temperature and state)
    public static Container createContainerFor(Commodity commodity) {
        Container container = null;

        switch (commodity.getState()) {
            case LIQUID:

                switch (commodity.getTemperature()) {
                    case WARM:
                        container = new TermicBottle();
                        break;
                    case COLD:
                        container = new PlasticBottle();
                        break;
                }
                break;

            case SOLID:

                switch (commodity.getTemperature()) {
                    case WARM:
                        container = new Tupperware();
                        break;
                    case COLD:
                        container = new PlasticBag();
                        break;
                }
                break;
        }

        return container;
    }
}

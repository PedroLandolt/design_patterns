package pl.factory_method;

import pl.strategy.ImpatientStrategy;
import pl.strategy.OrderingStrategy;
import pl.strategy.SmartStrategy;

public class FerengiRace extends AlienClient {

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }

}

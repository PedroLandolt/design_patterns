package pl.factory_method;

import pl.strategy.ImpatientStrategy;
import pl.strategy.OrderingStrategy;
import pl.strategy.SmartStrategy;

public class RomulanRace extends AlienClient {

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }

}

package eca.patterns.flyweight;

/**
 * A client maintains references to flyweights in addition to computing and maintaining extrinsic state
 */
public class Client {

    private Flyweight flyweight = FlyweightFactory.getFlyweight();
    private int currentState = 0;

    public void operation(int newState) {
        flyweight.doOperation(currentState, newState);
        currentState = newState;
    }

}

package eca.patterns.flyweight;

/**
 * Declares an interface through which flyweights can receive and act on extrinsic state.
 */
public interface Flyweight {

    void doOperation(int previousState, int newState);

}

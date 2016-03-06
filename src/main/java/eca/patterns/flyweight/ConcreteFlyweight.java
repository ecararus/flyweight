package eca.patterns.flyweight;

/**
 * Implements the Flyweight interface and stores intrinsic state.
 * A ConcreteFlyweight object must be sharable.
 * The Concrete flyweight object must maintain state that it is intrinsic to it, and must be able to manipulate state that is extrinsic.
 * In the war game example graphical representation is an intrinsic state, where location and health states are extrinsic.
 * Soldier moves, the motion behavior manipulates the external state (location) to create a new location.
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * Intrinsic State maintained by flyweight implementation
     * E.G. Shape ( graphical represetation)
     * how to display the object is up to the flyweight implementation
     */
    private Object strategicState; // we can hold subject of state mutation.

    public void doOperation(int previousState, int newState) {
        // delete subject of representation from previous location
        // then render subject of representation in new location.
        System.out.println("Move from previous State " + previousState + " to new State " + newState);
    }
}

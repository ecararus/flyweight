package eca.patterns.flyweight;

/**
 * The factory creates and manages flyweight objects.
 * In addition the factory ensures sharing of the flyweight objects.
 * The factory maintains a pool of different flyweight objects and returns an object from the pool if it is already created, adds one to the pool and returns it in case it is new.
 * In the war example a Soldier Flyweight factory can create two types of flyweights : a Soldier flyweight, as well as a Colonel Flyweight.
 * When the Client asks the Factory for a soldier, the factory checks to see if there is a soldier in the pool, if there is, it is returned to the client,
 * if there is no soldier in pool, a soldier is created, added to pool, and returned to the client, the next time a client asks for a soldier,
 * the soldier created previously is returned, no new soldier is created.
 */
public class FlyweightFactory {

    private static Flyweight flyweight; // Out of scope concurrency issue.

    public static Flyweight getFlyweight() {
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight();
        }
        return flyweight;
    }

}

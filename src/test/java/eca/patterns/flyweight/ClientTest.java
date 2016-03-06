package eca.patterns.flyweight;

import org.testng.annotations.Test;

public class ClientTest {

    @Test
    public void operation() throws Exception {
        Client[] clients = {new Client(), new Client(), new Client()};
        //Change state for each client separately by using only one Flyweight.
        clients[0].operation(1);
        clients[1].operation(2);
        clients[2].operation(3);
    }

}
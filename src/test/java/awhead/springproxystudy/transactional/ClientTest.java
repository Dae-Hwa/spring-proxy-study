package awhead.springproxystudy.transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientTest {

    @Autowired
    Client client;

    @Test
    void test2() {
        client.run();
    }
}
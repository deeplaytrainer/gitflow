import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void test(){
        String name = "vlad";
        Player player = new Player(name,"black");

        assertEquals(name,player.getName());
    }
}
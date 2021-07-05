import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void test(){
        String name = "vlad";
        Player player = new Player(name, Player.Color.BLACK);

        assertEquals(name,player.getName());
    }
}
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void test(){
        String name = "vlad";
        Player.Color color = Player.Color.BLACK;
        Player player = new Player(name, color,12);

        assertEquals(name,player.getName());
    }
}
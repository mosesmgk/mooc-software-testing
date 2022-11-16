package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void oneG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("gg");
        Assertions.assertEquals(true, result);
    }
}

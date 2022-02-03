import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void modulo() {
	// failing test
        assertEquals(0, SkillDemo1.mod(10, 5));
    }
}
import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSkillDemo()
    {
        String goodChoice = "homework";
        String badChoice = "video games";
        assertEquals(goodChoice, SkillDemo.shouldIDoHomeworkOrPlayVideoGames());
        //fails initially
    }
}

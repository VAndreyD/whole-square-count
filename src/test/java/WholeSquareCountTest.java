import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class WholeSquareCountTest {

    @Test
    public void wholeSquareCount() {
        Assert.assertEquals(WholeSquareCount.getWholeSquareCount(4, 17), 3);
        Assert.assertEquals(WholeSquareCount.getWholeSquareCount(20, 38), 2);
    }
}

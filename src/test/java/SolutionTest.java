import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void uniquePathsTest1() {
        int m = 3;
        int n = 7;
        int output = 28;
        Assert.assertEquals(output, new Solution().uniquePaths(m, n));
    }

    @Test
    public void uniquePathsTest2() {
        int m = 3;
        int n = 2;
        int output = 3;
        Assert.assertEquals(output, new Solution().uniquePaths(m, n));
    }

}

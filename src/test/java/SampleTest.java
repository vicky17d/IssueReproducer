import com.github.vicky17d.issuereproducer.classloaderissue.MyService;
import com.intellij.testFramework.LightPlatformTestCase;

public class SampleTest extends LightPlatformTestCase {
    public void testSample() {
        MyService.getInstance();
        assertTrue(true);
    }
}
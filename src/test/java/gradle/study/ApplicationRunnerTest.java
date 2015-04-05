package gradle.study;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

/**
 * <p>
 * {@link gradle.study.ApplicationRunner}をテストするクラスです。
 *
 * @author shirotter
 * @since 1.0
 */
public class ApplicationRunnerTest {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationRunnerTest.class.getName());

    @Test
    public void testMain() {
        logger.info("{} started.", ApplicationRunnerTest.class.getName());
        assertTrue(true);
    }

}

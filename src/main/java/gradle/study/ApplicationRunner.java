package gradle.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * アプリケーション実行の起点となるクラスです。
 * <p>
 * Javaの仕様上、{@link ApplicationRunner}がJavaコマンドラインから実行されると、
 * {@link #main(String[])}が呼び出されます。
 *
 * @author shirotter
 * @since 1.0
 */
public class ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);

    /**
     * <p>
     * アプリケーション実行の起点となるメソッドです。
     * <p>
     * このメソッドは以下のような処理を行います。
     * <ol>
     *   <li>標準出力に"Study Gradle!!"と表示
     * </ol>
     *
     * @param args 起動時の実行引数
     *
     * @author shirotter
     * @since 1.0
     */
    public static void main(String[] args) {
        logger.info("{} started.", ApplicationRunner.class.getName());
        System.out.println("Study Gradle!!");
    }

}

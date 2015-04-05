package gradle.study;

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
        System.out.println("Study Gradle!!");
    }

}

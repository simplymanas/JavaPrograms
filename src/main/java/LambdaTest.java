import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Manas Dash on 08/12/17 6:27 AM.
 * 100DaysOFCode
 */
public class LambdaTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
          //  @Override
            public void run() {
                System.out.println("runnable test1");
            }
        };

        //Running with Lambda

        Runnable runnableWithLambda  = ()-> System.out.println("runnable with lambda");

        runnable.run();
        runnableWithLambda.run();

    }
}


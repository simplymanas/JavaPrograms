/**
 * Created by Manas Dash on 14/11/17 7:17 AM.
 * Learning REST API
 */
public class StaticTest {
private static int counter;

public StaticTest(){
    this.counter = 16;
}


    public static void main(String[] args) {
        StaticTest.counter = 17;
        StaticTest staticTest = new StaticTest();
        StaticTest.counter = 17;
        System.out.println(StaticTest.counter);
    }
}

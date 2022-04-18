package StringsStepik;
import java.util.Scanner;
import org.apache.commons.lang3.time.StopWatch;

public class Main {

    public static void main(String[] args) {
        StopWatch swStr = StopWatch.createStarted();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str = str + "a";
        }
        swStr.stop();

        StopWatch swBuilder = StopWatch.createStarted();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        swBuilder.stop();

        System.out.println("String: " + swStr.toString() + "\nBuilder: " + swBuilder.toString());
    }
}

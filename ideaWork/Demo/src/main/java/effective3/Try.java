package effective3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * try-with-resources
 */
public class Try {

    static String firstLineOfFile(String path, String defaultVal) {
        try(BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}

import waarheid.lib.CodeRedTruthException;
import waarheid.lib.TruthDefender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaarheidCLI {

    public static void main(String[] arg) {
        TruthDefender truthDefender = new TruthDefender();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Input the message to check (for truth):");
            String input = reader.readLine();
            String output = truthDefender.CheckMessage(input);
            System.out.println("The Truth is: " + output);
        } catch (IOException e) {
            System.out.println("An unexpected io error has occurred.");
        } catch (CodeRedTruthException e) {
            System.out.println("Code Red Truth Violation: Send special truth forces for rehabilitation.");
        }
    }
}

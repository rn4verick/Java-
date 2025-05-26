package Assessment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WordFetcher {

    public static String getRandomWord() {
        try {
            URL url = new URL("https://random-word-api.herokuapp.com/word");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String response = in.readLine();
                in.close();


                return response.substring(2, response.length() - 2);
            }
        } catch (Exception e) {
            System.out.println("Error fetching word. Using default.");
        }

        return "default";
    }
}

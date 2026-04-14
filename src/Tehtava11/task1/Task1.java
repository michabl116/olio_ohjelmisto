package Tehtava11.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Task1 {
    public static void main(String[] args) {
        String csvUrl = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        double sum = 0;
        int count = 0;

        try {
            URL url = new URL(csvUrl);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");

                String date = parts[0];
                String tempStr = parts[2];

                if (date.startsWith("1.1.2023")) {
                    double temp = Double.parseDouble(tempStr.replace(",", "."));
                    sum += temp;
                    count++;
                }
            }

            br.close();

            if (count > 0) {
                System.out.println("Average temperature on 1/1/2023: " + (sum / count));
            } else {
                System.out.println("No data found for 1/1/2023.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

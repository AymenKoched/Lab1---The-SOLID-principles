package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingModule implements Encoding {
    private final Database database;

    public EncodingModule(Database database) {
        this.database = database;
    }

    @Override
    public void encodeWithFiles() throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("DIP/src/com/directi/training/dip/exercise_refactored/afterEncryption.txt"))) {

            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        }
    }

    @Override
    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        URL url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {

            StringBuilder inputStringBuilder = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                inputStringBuilder.append((char) c);
            }

            String inputString = inputStringBuilder.toString();
            String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
            database.write(encodedString);
        }
    }
}

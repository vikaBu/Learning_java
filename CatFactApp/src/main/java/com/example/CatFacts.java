package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class CatFacts {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://catfact.ninja/fact");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder responseBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                responseBuilder.append(line);
            }

            reader.close();

            JSONObject json = new JSONObject(responseBuilder.toString());
            String fact = json.getString("fact");

            System.out.println("A cat fact to brighten your day:");
            System.out.println(fact);

        } catch (Exception e) {
            System.out.println("aww no! no cat fact available right meow: " + e.getMessage());
        }
    }
}

package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;

public class Main {
    static List<Character.UnicodeBlock> listImages = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String DEMO_KEY = "UI3fltKQr4rR4INRLPgTorQjxkpIxTgT4oCqm8Jy";
        URL url = new URL("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=" + DEMO_KEY);

        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
            System.out.println("<<<<<Соединение установлено>>>>>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream inputStream = connection.getInputStream();
        String responseString = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining());
        System.out.println("responseString: \n" + responseString);

        Gson gson = new Gson();
        String json = gson.toJson(responseString);
    }
}
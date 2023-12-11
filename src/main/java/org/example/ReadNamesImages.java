package org.example;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadNamesImages {
    List<String> listImages = new ArrayList<>();

    public List<String> getListImages(HttpURLConnection connection) {
        try {
            InputStream inputStream = connection.getInputStream();
            String responseString = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.joining());

            int i = 0;
            String temp = null;

            for (i = 0; i < responseString.length() - 1; i++) {
                temp = StringUtils.substringBetween(responseString, "\"img_src\":\"", "\",\"earth_date\"");
                listImages.add(temp);
                int start = responseString.indexOf("img_src:");
                int end = responseString.indexOf("\",\"earth_date\"");
                String responseStringSUB = responseString.substring(0 + 3, end + 9);
                responseString = responseString.replace(responseStringSUB, "");
//                System.out.println("temp.length() = " + temp.length());
            }
//            System.out.println("listImages.size() = " + listImages.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listImages;
    }
}

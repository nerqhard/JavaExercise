package oop.exercise3;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {
    private static Gson gson = new Gson();

    public static <T> List<T> readJsonFile(String path, Class<T[]> exClass) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        StringBuilder json = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            json.append(line);
        }

        T[] arr = gson.fromJson(json.toString(), exClass);
        List<T> object = new ArrayList<>(Arrays.asList(arr));

        bufferedReader.close();
        fileReader.close();
        return object;
    }

    public static <T> void writeJsonFile(String path, List<T> object) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String json = gson.toJson(object);

        bufferedWriter.append(json);

        bufferedWriter.close();
        fileWriter.close();
    }
}

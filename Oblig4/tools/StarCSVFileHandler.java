package tools;

import astronomy.Star;
import interfaces.ObjectFileHandler;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class StarCSVFileHandler implements ObjectFileHandler<Star> {
    @Override
    public void writeObjectsToFile(List<Star> stars, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Star star : stars) {
                writer.append(String.join(":", star.getName(), String.valueOf(star.getRadius()),
                        String.valueOf(star.getMass()), String.valueOf(star.getEffectiveTemp()))).append("\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<Star> readObjectsFromFile(String filename) {
        List<Star> stars = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(":");
                Star star = new Star(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]),
                        Double.parseDouble(data[3]));
                stars.add(star);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(stars);
        return stars;
    }
    }

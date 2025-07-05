package com.mycompany.medicallogreader;

import java.io.*;

public class MedicalLogReader {
    public static void main(String[] args) {
        File medicalLogFile = new File("medical_log.txt"); // Existing file path
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(medicalLogFile));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file - " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file - " + e.getMessage());
            }
        }
    }
}

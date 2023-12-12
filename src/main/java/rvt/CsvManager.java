package rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvManager {
    public static final String HOBBIES_FILE_PATH = "data/hobbies.csv";

    private InputStream is;

    public CsvManager(String filePath) {
        this.is = CsvManager.class.getClassLoader().getResourceAsStream(filePath);
    }

    public ArrayList<String> getAllHobbies() {
        ArrayList<String> hobbies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(this.is))) {
            String header = reader.readLine(); // This reads and discards the first line
            String line;
            while ((line = reader.readLine()) != null) {
                String[] nextLine = line.split(", ");
                hobbies.add(nextLine[1]);
             
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hobbies;
    }

    // public void writeStudentsToCSV(ArrayList<Student> students) {
    //     try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_PATH))) {
    //         writer.write("Vārds, Uzvārds, Epasts, Grupa");
    //         writer.newLine();
    //         for (Student student : students) {
    //             writer.write(student.getVards() + ", ");
    //             writer.write(student.getUzvards() + ", ");
    //             writer.write(student.getEpasts() + ", ");
    //             writer.write(student.getGrupa());
    //             writer.newLine();
    //         }
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // public void removeItemsFromCSV(List<Student> studentsToRemove) {
    //     ArrayList<Student> studentList = getAllStudents();
    //     Iterator<Student> iterator = studentList.iterator();

    //     while (iterator.hasNext()) {
    //         Student student = iterator.next();
    //         for (Student studentToRemove : studentsToRemove) {
    //             if (student.getVards().equalsIgnoreCase(studentToRemove.getVards())) {
    //                 iterator.remove();
    //                 break; // Exit the loop after removing the student
    //             }
    //         }
    //     }

    //     writeStudentsToCSV(studentList);
    // }

}

import java.io.*;

public class CSVCopy {
    public static void main(String[] args) {
        String sourceFile = "students.csv";
        String destinationFile = "students_copy.csv";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Isi file berhasil disalin ke 'students_copy.csv'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

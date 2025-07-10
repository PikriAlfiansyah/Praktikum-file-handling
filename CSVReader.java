import java.io.*;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        String csvSplitBy = ",";
        int baris = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                for (String item : data) {
                    System.out.print(item + "\t");
                }
                System.out.println();
                baris++;
            }
            System.out.println("Jumlah baris (termasuk header): " + baris);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

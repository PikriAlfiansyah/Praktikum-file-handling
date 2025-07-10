import java.io.*;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true));
             Scanner sc = new Scanner(System.in)) {

            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();

            System.out.print("Masukkan Umur: ");
            String umur = sc.nextLine();

            System.out.print("Masukkan Prodi: ");
            String prodi = sc.nextLine();

            String line = nim + "," + nama + "," + umur + "," + prodi;

            bw.write(line);
            bw.newLine();

            System.out.println("Data berhasil ditambahkan ke file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

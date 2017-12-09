import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

/**
 * Created by Manas Dash on 29/11/17 7:29 AM.
 * 100DaysOFCode
 * Reading integer from a file
 */
class ReadIntegerFromAFile {

    private File GetFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource("SampleFile.txt").getFile());
    }

    private int ReadIntegerAndSum() {
        int sum = 0;
        try {

            Scanner input;
            input = new Scanner(
                    new BufferedReader(
                            new FileReader(this.GetFile())));
            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    sum += input.nextInt();
                } else {
                    input.next();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public static void main(String[] args) {
        ReadIntegerFromAFile rif = new ReadIntegerFromAFile();
        System.out.println(rif.ReadIntegerAndSum());
    }
}

import java.io.IOException;
import java.nio.file.*;


/**
 * Created by Manas Dash on 01/12/17 7:16 AM.
 * 100DaysOFCode
 * to know the properties of a file
 */

public class FileInformation {

    private java.nio.file.Path GetFilePath() throws NullPointerException{
        ClassLoader classLoader = getClass().getClassLoader();
        return Paths.get( classLoader.getResource("SampleFile.txt").getPath());
    }

    public static void main(String[] args) throws IOException {

        FileInformation fileInfo = new FileInformation();

        FileStore fileStore = Files.getFileStore(fileInfo.GetFilePath());

        long total = fileStore.getTotalSpace();
        long used =  fileStore.getTotalSpace() -  fileStore.getUnallocatedSpace();
        long available = fileStore.getUsableSpace();

        System.out.println(total);
        System.out.println(used);
        System.out.println(available);

    }
}

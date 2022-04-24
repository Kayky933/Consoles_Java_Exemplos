import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Floder Patch");
        String strPath = scan.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders:");        
        for (File floder : folders) {
            System.out.println(floder);
        }

        File[] files =path.listFiles(File::isFile);
        System.out.println("Files:");  
        for (File file : files) {
            System.out.println(file);
        }
        scan.close();

    }
}

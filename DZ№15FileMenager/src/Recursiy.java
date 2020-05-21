import java.io.File;
import java.io.IOException;

public class Recursiy {


    public static void main(String[] args) throws IOException {

        File file = new File("WORK");
        int probel = 0;

        System.out.println(file.getCanonicalPath());

        round(file, probel);

    }

    private static void round(File myfile, int space) {

        if (myfile.isDirectory()) {
            space++;
            File[] files = myfile.listFiles();
            for (int i = 0; i < files.length; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                System.out.println(files[i].getName());

                round(files[i], space);

            }
        }
    }
}

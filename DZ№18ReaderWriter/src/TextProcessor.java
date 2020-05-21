import java.io.*;

public class TextProcessor {

    public static void main(String[] args) {

        System.setErr(System.out);

        int a;
        long proverka;

        try (FileReader fr = new FileReader("text.txt");
             BufferedReader br = new BufferedReader(fr);
             FileOutputStream fos = new FileOutputStream("text1.txt");
             Writer wr = new OutputStreamWriter(fos)
        ) {

            while (br.ready()) {
                String line = br.readLine();
                String masLine[] = line.split(" ");

                for (String strok : masLine) {
                    /*strok.replaceAll("[0-9]{10}", " ");
                    wr.write(strok + " " );*/
                   a = strok.length();
                    if (a == 11) {

                        try {
                            proverka = Long.parseLong(strok);
                            strok = String.valueOf(proverka);

                            strok.replaceAll("[0-9]{11}", "");

                        } catch (NumberFormatException ex) {
                            wr.write(strok + " ");
                        }
                    } else {
                        wr.write(strok + " ");
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

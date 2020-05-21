import java.io.*;


public class Convektor {

    public static void main(String[] args) {
        String s = null;

        try (InputStream is = new FileInputStream("test.txt")) {

            int size = is.available();
            int b;

            byte[] buf = new byte[size];
            if ((b = is.read(buf)) != -1) {    //???????????????
                s = new String(buf, "utf-8"); //???????????????
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (
                FileOutputStream fos = new FileOutputStream("test1.txt");
                Writer wr = new OutputStreamWriter(fos, "KOI8-R")
        ){
            wr.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

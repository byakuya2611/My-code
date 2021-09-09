import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class Main {
    public static void main(String [] args) {
//        zipFile();
        unZipFile();
    }

    static void unZipFile() {
        FileInputStream fis = null;
        InflaterInputStream iis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("vidu.data");
            iis = new InflaterInputStream(fis);

            fos = new FileOutputStream("vidu2.txt");

            int code;
            while ((code = iis.read()) != -1) {
                fos.write(code);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(iis != null) {
                try {
                    iis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void zipFile() {
        FileInputStream fis = null;
        DeflaterInputStream dis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("vidu.txt");
            dis = new DeflaterInputStream(fis);

            fos = new FileOutputStream("vidu.data");

            int code;
            while ((code = dis.read()) != -1) {
                fos.write(code);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

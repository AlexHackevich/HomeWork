package Ex2;

import java.io.FileReader;
import java.io.IOException;

public class Ex2_2 extends Ex2_1 {
    @Override
    public void readfile(String fileName) throws FileNotRead, ExceptionIOErr {
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);

            }
        } catch (IOException ex) {
            throw new ExceptionIOErr("Нет такого файла или каталога");
        }
    }
}

package Ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_1 {

    public void readfile(String fileName) throws FileNotRead, ExceptionIOErr {
        try {
            BufferedReader fin = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = fin.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            throw new FileNotRead("Путь указан неверно");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

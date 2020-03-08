import java.io.*;
import java.util.Scanner;

public class EncryptedEngine {






    public EncryptedEngine() throws FileNotFoundException {


    }

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/jchuru/labs/SimpleCrypt/Crypto/src/resources/sonnet18.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/jchuru/labs/SimpleCrypt/Crypto/src/resources/sonnet18.enc"));

        ROT13 rotty = new ROT13();

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){

            String crypted = scanner.nextLine();
            String cryp = rotty.crypt(crypted);
            System.out.println(cryp);
            writer.write(cryp + "\n");
        }
        writer.close();
    }
}

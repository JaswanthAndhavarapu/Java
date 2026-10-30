import java.io.*;

public class FileHandling {

    public static int count(String text, String pattern) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        // Writing text into the file
        FileWriter fw = new FileWriter("sample.txt");

        fw.write("Peter Piper picked a peck of pickled peppers\n");
        fw.write("A peck of pickled peppers Peter Piper picked\n");
        fw.write("If Peter Piper picked a peck of pickled peppers\n");
        fw.write("Where's the peck of pickled peppers Peter Piper picked?");

        fw.close();

        // Reading text from the file
        FileReader fr = new FileReader("sample.txt");

        StringBuilder data = new StringBuilder();
        int ch;

        while ((ch = fr.read()) != -1) {
            data.append((char) ch);
        }

        fr.close();

        // Converting text into lowercase
        String text = data.toString().toLowerCase();

        // Counting patterns
        int pe = count(text, "pe");
        int pi = count(text, "pi");

        // Displaying the result
        System.out.println("'pe' - no of occurrences - " + pe);
        System.out.println("'pi' - no of occurrences - " + pi);
    }
}

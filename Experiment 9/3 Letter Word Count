import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        // The input file
        File file = new File("D:\\playground\\java programs\\write.txt");
        // Initialize the array of words
        String[] words = null;
        // Initializes the counter of word to zero
        int count = 0;
        int c = 0;
        // Create the File Reader object
        FileReader fr = new FileReader(file);
        // Create the BufferedReader object
        BufferedReader br = new BufferedReader(fr);
        String str;
        // Read the contents of the file
        while ((str = br.readLine()) != null) {
            // Split the word using space
            words = str.split(" ");
            // Increment the number of words
            count = words.length;
            
           
            for (int i = 0; i < count; i++) {
                if (words[i].length() == 3) {
                    
                    c = c + 1;

                }
            }
        }

     
      
        fr.close();
        System.out.println("Number of three letter words in the file is:" + c);
    }
}

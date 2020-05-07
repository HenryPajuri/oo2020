import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
//import java.util.stream.Stream;

/* Ülesande püstitus:
Sõnapikkuste uuring

Salvesta uurimiseks vähemalt paarileheküljeline tekst.
* Koosta programm, mis loeks kokku, mitu kolmetähelist sõna on tekstis. DONE
* Koosta graafik, kus ühel teljel on teksti algusest sinnamaani esinenud kolmetäheliste sõnade arv ning teisel teljel selleks ajaks leitud kolmetäheliste erinevate sõnade arv.
* Võta uuringuks tunduvalt pikem tekst. Kuva joonisele sarnased graafikud 1-10 tähe pikkuste sõnade kohta. Mummukestega tähista joonistele kohad, kus on läbitud veerand, pool ja kolmveerand tekstist.
*/

public class SmallDatabase {

    public static void main(String[] args) throws IOException {

        ArrayList<String> wordsArray = new ArrayList<String>();
        ArrayList<String> uniqueWordsArray = new ArrayList<String>();
        var howManyWords = 0;

        // oolean lowerCaseFlag = false;
        try {

            File f = new File("/Users/henry/OneDrive/Desktop/Java kt2/data.txt");

            Scanner sc = new Scanner(new FileInputStream(f));
            {

                while (sc.hasNext()) {
                    sc.next();
                    howManyWords++;

                }
            }
            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
                // System.out.println(readLine);
                String[] words = readLine.split("\\s+");

                for (int i = 0; i < words.length; i++) {
                    if (words[i].length() == 3 && words[i].chars().allMatch(Character::isLetter)) {
                        // System.out.println(words[i]);
                        wordsArray.add(words[i]);
                        // lowerCaseFlag = true;
                    } else {

                    }

                }
                for (int u = 0; u < words.length; u++) {
                    if (!uniqueWordsArray.contains(words[u])) {
                        if (words[u].length() == 3 && words[u].chars().allMatch(Character::isLetter)) {
                            uniqueWordsArray.add(words[u].toLowerCase());
                        }
                    }
                }
                // Stream.generate(() -> "-").limit(allCount).forEach(System.out::print);

            }
      

            System.out.println("There are " + wordsArray.size() + " three letter words in this file");
            System.out.println("There are " + uniqueWordsArray.size() + " also unique three letter words in this file");
            System.out.println(wordsArray);
            System.out.println(uniqueWordsArray);
            System.out.println("Number of words in file: " + howManyWords);
            System.out.println(uniqueWordsArray.size() + " Unique three letter words");
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int u = 0; u < uniqueWordsArray.size(); u++) {
            System.out.println("|");
        }

        for (int u = 0; u < wordsArray.size(); u++) {
            {
                System.out.print("-");
            }

        }
        System.out.println(wordsArray.size() + " three letter words");

    }

}

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

public class BigDatabase {

    public static void main(String[] args) throws IOException {

        ArrayList<String> wordsArray = new ArrayList<String>();
        ArrayList<String> uniqueWordsArray = new ArrayList<String>();
        var howManyWords = 0;

        // oolean lowerCaseFlag = false;
        try {

            File f = new File("/Users/henry/OneDrive/Desktop/Java kt2/data2.txt");

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
                    if (words[i].length() <= 10 && words[i].chars().allMatch(Character::isLetter)) {
                        // System.out.println(words[i]);
                        wordsArray.add(words[i]);
                        // lowerCaseFlag = true;
                    } else {

                    }

                }
                for (int u = 0; u < words.length; u++) {
                    if (!uniqueWordsArray.contains(words[u])) {
                        if (words[u].length() <= 10 && words[u].chars().allMatch(Character::isLetter)) {
                            uniqueWordsArray.add(words[u].toLowerCase());
                        }
                    }
                }
                // Stream.generate(() -> "-").limit(allCount).forEach(System.out::print);

            }

            
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         * for (int u = 0; u < uniqueWordsArray.size(); u++) { System.out.println("|");
         * }
         */
        int quarter = (int) Math.round(wordsArray.size() * 0.25);// wordsArray.size() * 0.25;
        int half = (int) Math.round(wordsArray.size() * 0.5);// wordsArray.size() * 0.5;
        int quarterTo = (int) Math.round(wordsArray.size() * 0.75);// wordsArray.size() * 0.75;

        for (int e = 0; e < wordsArray.size(); e++) {

            if (e == quarter) {
                System.out.println("* QUARTER *");

            } else if (e == half) {
                System.out.println("*  HALF   *");

            } else if (e == quarterTo) {
                System.out.println("*QUARTERTO*");
            } else {
                System.out.println("|         |");
            }

        }

        for (int u = 0; u < wordsArray.size(); u++) {
            {
                System.out.print("-");
            }

        }
        System.out.println(wordsArray.size() + " non unique one to ten letter words");

        System.out.println("There are " + wordsArray.size() + " one to ten letter words in this file");
            System.out.println("There are " + uniqueWordsArray.size() + " also unique one to ten letter words in this file");
            System.out.println(wordsArray);
            System.out.println(uniqueWordsArray);
            System.out.println("Number of words in file: " + howManyWords);
            System.out.println(uniqueWordsArray.size() + " Unique one to ten letter words");

    }

}

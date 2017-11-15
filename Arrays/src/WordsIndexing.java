import java.util.Arrays;
import java.util.Scanner;

class WordCountTupple{
    String word;
    int count;
}

public class WordsIndexing {

    private static int findIndex(WordCountTupple[] array, int count, String element){
        for(int i=0;i<count;i++){
            if(array[i].equals(element))return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println(text);

        String[] words = text.split("[\\s,\\.!\\?\\-\\(\\);:]+");
        System.out.println(Arrays.toString(words));

        WordCountTupple[] tupples = new WordCountTupple[words.length];
        int counter = 0;

        for(String word: words) {
            int index = findIndex(tupples,counter,word);
            if(index < 0) {
                tupples[counter] = new WordCountTupple();
                tupples[counter].word = word;
                tupples[counter].count = 1;
                counter++;
            }else {
                tupples[index].count++;
            }
            }

        for(int i=0;i<counter;i++){
            System.out.println(String.format("%s -> %d",tupples[i].word,tupples[i].count));
        }
        }
    }


package fuelsum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

  private static int Choice;

  public static int main(String[] args) {


    System.out.println("welcome to Data ENCRYPTION and DECRYPTION/n/n/n");
    System.out.println("MAIN MENU");

    System.out.println("1).CÆSAR");
    System.out.println("\n 2. VINGENERE");
    System.out.println("\n 3. NUMBER");
    int userchoice = 0;
    int userchoice1 = userchoice;
    return userchoice1;


// array of alphabet
    class Main {

      // array of alphabet
      static  char[] Alphabet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
      // using dictionary to map alphabet to int value
      static HashMap<Character, Integer> DataTable = new HashMap<Character, Integer>();
      static int counter;

      public static void main(String[] args) {

        // Populate dataTable
        for(int i = 0 ; i <= Alphabet.length - 1; i++){
          counter++;
          char tempChar = Alphabet[i];
          DataTable.put(tempChar, counter);
    // using dictionary to map alphabet to int value
    HashMap<Character, Integer> DataTable = new HashMap<Character, Integer>();
    int counter;
    {

      }
      System.out.println(Arrays.asList(DataTable) + "\n");
      System.out.println(DataTable.get('b'));

    }
    class CaesarCipherJava {
      public void main(String... s) {
        String message, encryptedMessage = "";
        int key;
        char ch;
        Scanner[] sc = new Scanner[0];
        sc[0] = new Scanner(System.in);
        System.out.println("Enter a message: ");
        message = sc[0].nextLine();
        System.out.println("Enter key: ");
        key = sc[0].nextInt();

        for (int i = 0; i < message.length(); ++i) {
          ch = message.charAt(i);
          if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch + key);

            if (ch > 'z') {
              ch = (char) (ch - 'z' + 'a' - 1);
            }

            encryptedMessage += ch;
          } else if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + key);

            if (ch > 'Z') {
              ch = (char) (ch - 'Z' + 'A' - 1);
            }

            encryptedMessage += ch;
          } else {
            encryptedMessage += ch;
          }
        }
        System.out.println("Encrypted Message = " + encryptedMessage);
      }

      public static int MapCharToInt(char w) {
        return 0;
      }

      public static int nextInt() {
        return 0;
      }
    }
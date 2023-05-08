import java.util.Scanner;
import java.util.StringTokenizer;

class EncryptInput{
    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        Rotation rotate = new Rotation();
        String[][] encryptCube = new String[3][18];
        char[] messageArray = new char[54];
        String message;
        String keyStr;
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        
        // Message to Encrypt
        do{
            valid = true;
            System.out.println("Enter a text of up to 54 characters to encrypt");
            message = input.nextLine();
            if (message.length() > 54){
                System.out.println("The text you wish to encrypt it too long. The max length is 54 characters. You have entered \"" + message.length() + "\" characters");
                valid = false;
            }
        } while (!valid);
        
        StringTokenizer token;
        valid = false;
        // Key to Encrypt
        int[] key = new int[54];
        do{
            valid = true;
            System.out.println("Enter up to 54 integers with ranges 0 - 26 inclusively. If less then 54 integers were entered, the default will be 0's. Enter the integers seperated with a space. \nEx: 25 0 12 15 9 etc.");
            keyStr = input.nextLine();
            token = new StringTokenizer(keyStr);
            if (token.countTokens() > 54){
                System.out.println("You have too many integers. The limit is 54 and you have " + token.countTokens());
                valid = false;
            } else {
                try {
                    while (token.hasMoreTokens()){
                        String currentToken = token.nextToken();
                        if (Integer.parseInt(currentToken) > 26 || Integer.parseInt(currentToken) < 0){
                            System.out.println("You may only type integers ranging from 0-26 inclusively");
                            valid = false;
                        }
                    }
                } catch (Exception e){
                    System.out.println("\nYou may only type integers ranging from 0-26 inclusively");
                    valid = false;
                }
            }
        } while (!valid);

        if (message.length() < 54){
            message += " ".repeat(54 - message.length());
        }

        token = new StringTokenizer(keyStr);
        int pointer = 0;
        while (token.hasMoreTokens()){
            key[pointer] = Integer.parseInt(token.nextToken());
            pointer++;
        }

        // cypher encryption 2.0
        String str = "";
        for (int i = 0; i < message.length(); i++){
            messageArray[i] = (char)(message.charAt(i) + key[i]);
        }

        for (int i = 0; i < message.length(); i++){
            str += messageArray[i];
        }

        System.out.println("Key Encrypted message: " + str);

        encryptCube = assignment.setEncryptCube(encryptCube, str);

        encryptCube = rotate.f(rotate.f(rotate.f(encryptCube)));
        encryptCube = rotate.r(rotate.r(rotate.r(encryptCube)));
        encryptCube = rotate.f(rotate.f(rotate.f(encryptCube)));
        encryptCube = rotate.l(encryptCube);
        encryptCube = rotate.l(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.f(encryptCube);
        encryptCube = rotate.f(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.d(rotate.d(rotate.d(encryptCube)));
        encryptCube = rotate.b(encryptCube);
        encryptCube = rotate.b(encryptCube);
        encryptCube = rotate.l(encryptCube);
        encryptCube = rotate.l(encryptCube);
        encryptCube = rotate.d(rotate.d(rotate.d(encryptCube)));
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.d(encryptCube);
        encryptCube = rotate.f(rotate.f(rotate.f(encryptCube)));
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.d(rotate.d(rotate.d(encryptCube)));
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.b(rotate.b(rotate.b(encryptCube)));

        String testMatrix = "";
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 18; j++){
                if (j ==17){
                    testMatrix += "[" + encryptCube[i][j] + "]\n";
                } else {
                    testMatrix += "[" + encryptCube[i][j] + "] ";
                }
            }
        }
        System.out.println(testMatrix);

        String encryptedMessage = "";

        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 18; j++){
                encryptedMessage += encryptCube[i][j];
            }
        }
        System.out.println("Encrypted message: " + encryptedMessage);






        //decryption
        System.out.println("\nDecrypting the message");

        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.b(rotate.b(rotate.b(encryptCube)));
        encryptCube = rotate.l(rotate.l(rotate.l(encryptCube)));
        encryptCube = rotate.d(rotate.d(rotate.d(encryptCube)));

        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));
        encryptCube = rotate.r(rotate.r(rotate.r(encryptCube)));
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));
        encryptCube = rotate.r(rotate.r(rotate.r(encryptCube)));

        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.d(encryptCube);
        encryptCube = rotate.d(encryptCube);
        encryptCube = rotate.l(rotate.l(rotate.l(encryptCube)));
        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));
        encryptCube = rotate.l(encryptCube);
        encryptCube = rotate.d(encryptCube);
        encryptCube = rotate.d(encryptCube);

        encryptCube = rotate.l(encryptCube);
        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));
        encryptCube = rotate.l(rotate.l(rotate.l(encryptCube)));
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.l(rotate.l(rotate.l(encryptCube)));
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.l(encryptCube);

        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.b(rotate.b(rotate.b(encryptCube)));
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.b(encryptCube);
        encryptCube = rotate.b(encryptCube);
        encryptCube = rotate.l(rotate.l(rotate.l(encryptCube)));
        encryptCube = rotate.b(rotate.b(rotate.b(encryptCube)));
        encryptCube = rotate.l(encryptCube);

        encryptCube = rotate.f(encryptCube);
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));
        encryptCube = rotate.r(rotate.r(rotate.r(encryptCube)));
        encryptCube = rotate.f(rotate.f(rotate.f(encryptCube)));

        encryptCube = rotate.r(rotate.r(rotate.r(encryptCube)));
        encryptCube = rotate.f(rotate.f(rotate.f(encryptCube)));
        encryptCube = rotate.l(encryptCube);
        encryptCube = rotate.f(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.f(rotate.f(rotate.f(encryptCube)));
        encryptCube = rotate.l(rotate.l(rotate.l(encryptCube)));
        encryptCube = rotate.f(encryptCube);

        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));

        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.r(rotate.r(rotate.r(encryptCube)));
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.r(rotate.r(rotate.r(encryptCube)));
        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));
        encryptCube = rotate.d(encryptCube);
        encryptCube = rotate.r(rotate.r(rotate.r(encryptCube)));
        encryptCube = rotate.u(encryptCube);
        encryptCube = rotate.r(encryptCube);
        encryptCube = rotate.d(rotate.d(rotate.d(encryptCube)));

        encryptCube = rotate.u(rotate.u(rotate.u(encryptCube)));

        testMatrix = "";
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 18; j++){
                if (j ==17){
                    testMatrix += "[" + encryptCube[i][j] + "]\n";
                } else {
                    testMatrix += "[" + encryptCube[i][j] + "] ";
                }
            }
        }
        System.out.println(testMatrix);



        // using key to decrypt
        encryptedMessage = "";
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 18; j++){
                encryptedMessage += encryptCube[i][j];
            }
        }

        String decryptedMessage = "";
        messageArray = new char[54];
        for (int i = 0; i < encryptedMessage.length(); i++){
            messageArray[i] = (char)(encryptedMessage.charAt(i) - key[i]);
        }

        for (int i = 0; i < encryptedMessage.length(); i++){
            decryptedMessage += messageArray[i];
        }

        System.out.println("Decrypted message: " + decryptedMessage);

    }// main(String[]) Method
}// EncryptInput Class
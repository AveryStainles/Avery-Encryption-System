
class Move{
    public static void main(String[] args) {
        int[] key = new int[]{10, 6, 13, 2, 12, 9, 12, 24, 15, 24, 12, 7, 16, 10, 15, 2, 20, 18, 0, 11, 8, 8, 23, 17, 23, 23, 11, 14, 11, 24, 13, 14, 2, 21, 6, 24, 18, 2, 11, 9, 13, 23, 13, 24, 16, 2, 13, 19, 19, 25, 4, 21, 8, 4, 20};
        String str = "";
        String message = "You must not fool yourself despite being easy to fool.";
        char[] messageArray = new char[54];

        for (int i = 0; i < message.length(); i++){
            messageArray[i] = (char)(message.charAt(i) + key[i]);
        }

        for (int i = 0; i < message.length(); i++){
            str += messageArray[i];
        }

        System.out.println(str);
    }
}
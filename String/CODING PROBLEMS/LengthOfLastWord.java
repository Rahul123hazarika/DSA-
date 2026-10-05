// count the length of the lastword,
class Main {

    public static int lengthOfTheLastWord(String s) {

        // Start from the last character
        int i = s.length() - 1;

        // Skip spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        int length = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String args[]) {

        String s = "hello rahul";

        int result = lengthOfTheLastWord(s);

        System.out.println("Length of last word: " + result);
    }
}

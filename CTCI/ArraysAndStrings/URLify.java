//replace all spaces in the string with '%20'

public class URLify {
    public static void main(String[] args) {

        String str = "Mr John Smith    ";
        System.out.println(str.length());
        // System.out.println(replace(str, 13));
        // replaceSpaces(str.toCharArray(), 13);
    }

    public static String replace(String str, int length) {
        return str.replace(" ", "%20");
    }

    public static void replaceSpaces(char[] str, int length) {
        int spaceCount = 0, index, i = 0;

        // Count spaces in the original string
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        // Calculate new index based on added space for '%20'
        index = length + spaceCount * 2;

        // If extra space is not provided, return
        if (index > str.length)
            return;

        // Start filling the array from the end
        // If extra space is not provided, return
        if (index > str.length)
            return;

        // Start filling the array from the end
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

}

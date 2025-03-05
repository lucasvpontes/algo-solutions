package binarytree;

public class PadString {
    public static void main(String[] args) {
        System.out.println(subString("string", 4));
        System.out.println(leftPad("hello", 6, '0'));
        System.out.println(leftPadDefined("hello", 6, '0'));
        System.out.println(rightPadDefined("hello", 6, '0'));
    }

    public static String subString(String inputString, int leftPad) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(inputString.length() + leftPad));
        return sb.substring(inputString.length()) + inputString;
    }

    public static String leftPad(String input, int length, char pad) {
        StringBuilder sb = new StringBuilder();

        while (sb.length() + input.length() < length) {
            sb.append(pad);
        }

        sb.append(input);
        return sb.toString();
    }

    public static String leftPadDefined(String input, int length, char pad) {
        StringBuilder sb = new StringBuilder();

        while (length > 0) {
            length--;
            sb.append(pad);
        }

        sb.append(input);
        return sb.toString();
    }

    public static String rightPadDefined(String input, int length, char pad) {
        StringBuilder sb = new StringBuilder();

        sb.append(input);

        while (length > 0) {
            length--;
            sb.append(pad);
        }

        return sb.toString();
    }
}

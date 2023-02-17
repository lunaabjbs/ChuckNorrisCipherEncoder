package chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            String command = getCommandFromUser(scanner);
            switch (command) {
                case "encode":
                    String messageToEncode = getMessageToEncodeOnFromUser(scanner);
                    encode(messageToEncode);
                    break;
                case "decode":
                    String messageToDecode = getMessageToDecodeOnFromUser(scanner);
                    decode(messageToDecode);
                    break;
                case "exit":
                    isExit = true;
                    break;
                default:
                    System.out.println("There is no '" + command + "' operation");
            }
        }
        System.out.println("Bye!");
    }

    private static String getCommandFromUser(Scanner scanner) {
        System.out.println("Please input operation (encode/decode/exit):");
        return scanner.nextLine();
    }

    private static String getMessageToEncodeOnFromUser(Scanner scanner) {
        System.out.println("Input string:");
        return scanner.nextLine();
    }

    private static String getMessageToDecodeOnFromUser(Scanner scanner) {
        System.out.println("Input encoded string:");
        return scanner.nextLine();
    }

    private static void decode(String line) {
        try {
            String binaryString = getBinaryStringFromEncoded(line);
            String message = getCharsFromBinaryString(binaryString);
            System.out.println("Decoded string:");
            System.out.println(message);
        } catch (IllegalArgumentException e) {
            System.out.println("Encoded string is not valid.");
        }
    }

    private static String getBinaryStringFromEncoded(String line) {
        String[] groups = line.split(" ");
        StringBuilder outputBinary = new StringBuilder();
        if (groups.length % 2 != 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < groups.length; i += 2) {
            String val;
            if (groups[i].equals("0")) {
                val = "1";
            } else if (groups[i].equals("00")){
                val = "0";
            } else {
                throw new IllegalArgumentException();
            }
            for (int j = 0; j < groups[i + 1].length(); j++) {
                if (groups[i+1].charAt(j) != '0') {
                    throw new IllegalArgumentException();
                }
            }
            outputBinary.append(val.repeat(groups[i + 1].length()));
        }
        if (outputBinary.length() % 7 != 0) {
            throw new IllegalArgumentException();
        }
        return outputBinary.toString();
    }

    private static String getCharsFromBinaryString(String bits) {
        StringBuilder chars = new StringBuilder();
        for (int i = 0; i < bits.length(); i += 7) {
            chars.append(Character.toString(Integer.parseUnsignedInt(bits.substring(i, i + 7), 2)));
        }
        return chars.toString();
    }

    private static void encode(String line) {
        System.out.println("Encoded string:");
        StringBuilder wholeBinaryString = new StringBuilder();
        if (!line.isEmpty()) {
            for (int i = 0; i < line.length(); i++) {
                char currChar = line.charAt(i);
                wholeBinaryString.append(getBinaryString(currChar, 7));
            }
            String chuckNorrisEncoding = getChuckNorrisEncoding(wholeBinaryString.toString());
            System.out.println(chuckNorrisEncoding);
        }
    }

    private static String getBinaryString(char character, int padding) {
        StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(character));
        while (binaryString.length() < padding) {
            binaryString.insert(0, "0");
        }
        return binaryString.toString();
    }

    private static String getChuckNorrisEncoding(String binaryString) {
        StringBuilder chuckNorrisEncoding = new StringBuilder();
        int pointer = 0;
        while (pointer < binaryString.length()) {
            char currBit = binaryString.charAt(pointer);
            int numBits;
            if (currBit == '0') {
                chuckNorrisEncoding.append("00 ");
                numBits = getNumBits(binaryString, '1', pointer);
            } else {
                chuckNorrisEncoding.append("0 ");
                numBits = getNumBits(binaryString, '0', pointer);
            }
            chuckNorrisEncoding.append("0".repeat(numBits));
            chuckNorrisEncoding.append(" ");
            pointer = pointer + numBits;
        }
        return chuckNorrisEncoding.toString();
    }

    private static int getNumBits(String s, char bit, int start) {
        int indexOfBit = s.substring(start).indexOf(bit);
        if (indexOfBit != -1) {
            return indexOfBit;
        } else {
            return s.length() - start;
        }
    }
}
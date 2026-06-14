class InvalidBinaryException extends Exception {
    public InvalidBinaryException(String message) {
        super(message);
    }
}

public class binaryStringtoDecimal {

    public static void main(String[] args) {
        
        String input = "110101110101111001101";

        try
        {
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch != '0' && ch != '1') {
                    throw new InvalidBinaryException("Invalid character: " + ch);
                }
            }
            for (int i = 0; i < input.length(); i += 4) {

                int end = i + 4;
                if (end > input.length()) {
                    end = input.length();
                }
                String group = input.substring(i, end);
                int decimal = Integer.parseInt(group,2);

                System.out.println(group + " -> " + decimal);
            }

        } catch (InvalidBinaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class coursework2 {public class CardCompare {
    // Define the suit priority
    char[] suitPriority = {'H', 'C', 'D', 'S'};

    // Define the card value priority, Ace as 1, 2 through 10, Jack as 11, Queen as 12, King as 13
    int[] cardValuePriority = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    // Function to compare two cards
    int cardCompare(String card1, String card2) {
        // Extract the suit and value from the card strings
        char suit1 = card1.charAt(1);
        char suit2 = card2.charAt(1);
        int value1 = getValue(card1.charAt(0));
        int value2 = getValue(card2.charAt(0));

        // Compare suits first
        int suitComparison = Integer.compare(java.util.Arrays.binarySearch(suitPriority, suit1), java.util.Arrays.binarySearch(suitPriority, suit2));
        if (suitComparison != 0) {
            return suitComparison;
        }

        // If suits are equal, compare values
        return Integer.compare(value1, value2);
    }

    // Function to get the value of the card
    int getValue(char cardChar) {
        switch (cardChar) {
            case 'A':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'T':
                return 10;
            case 'J':
                return 11;
            case 'Q':
                return 12;
            case 'K':
                return 13;
            default:
                throw new IllegalArgumentException("Invalid card value: " + cardChar);
        }
    }

// Test cases
System.out.println(cardCompare("4H", "4H")); // 0
System.out.println(cardCompare("4H", "3S")); // -1
System.out.println(cardCompare("4H", "7S")); // -1
System.out.println(cardCompare("4H", "8C")); // -1
System.out.println(cardCompare("4H", "2D")); // -1
System.out.println(cardCompare("4H", "3H")); // 1
}
}

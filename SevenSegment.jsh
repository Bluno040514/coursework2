public class SevenSegment {
    public static void display(int n) {
        while (n > 0) {
            int digit = n % 10; 
            displayDigit(digit); 
            n /= 10; 
            if (n > 0) {
                System.out.println(); 
            }
        }
    }
    
    private static void displayDigit(int d) {
        System.out.println(" --  --  --");
        System.out.println(" |  |  |  | ");
        System.out.println(ssd(d, 1));
        System.out.println(ssd(d, 2));
        System.out.println(ssd(d, 3));
        System.out.println(ssd(d, 4));
        System.out.println(ssd(d, 5));
    }
    
    private static String ssd(int d, int n) {
        switch ((d * 10) + n) {
            case 1: case 5: case 21: case 23: case 25: case 31: case 33: case 35:
            case 43: case 51: case 53: case 55: case 61: case 63: case 65: case 71:
            case 81: case 83: case 85: case 91: case 93: case 95:
                return " --  ";
            case 24: case 52: case 62:
                return "|    ";
            case 12: case 14: case 22: case 32: case 34: case 44: case 54: case 72:
            case 74: case 94:
                return "   | ";
            case 2: case 4: case 42: case 64: case 82: case 84: case 92:
                return "|  | ";
            default:
                return "     ";
        }
    }

    
    public static void main(String[] args) {
        display(28);
    }
}

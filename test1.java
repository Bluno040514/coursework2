public class test1 {
        public static int factorial(int n) {
            int result=1;
            for(int i=2;i<=n;i++){
                result*=i;
            }
            return result;
        }
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(isPrime(3));
        int number = 29; // 测试数字
        boolean result = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + result);


        String sentence = "hello,world and you.";
        String[] word = sentence.split("[,\\s]+");
        String upperCaseWord = word[0].toUpperCase();
        word[0] = upperCaseWord;
        String result1 = String.join(" ", word);
        System.out.println(result1);

            System.out.println(numberToWords(0));      // "zero"
            System.out.println(numberToWords(5));      // "five"
            System.out.println(numberToWords(13));     // "thirteen"
            System.out.println(numberToWords(85));     // "eighty-five"
            System.out.println(numberToWords(523));    // "five hundred twenty-three"
            System.out.println(numberToWords(1000000)); // "one million"
        System.out.print(factorial1(3));
    }

        public static String numberToWords(int number) {
            String[] LESS_THAN_20 = {
                    "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
            };
            String[] TENS = {
                    "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
            };
            String[] THOUSANDS = {
                    "", "thousand", "million", "billion"
            };

            if (number == 0) {
                return "zero";
            }
            if (number < 0) {
                return "Number must be non-negative";
            }
            if (number < 20) {
                return LESS_THAN_20[number];
            }
            if (number < 100) {
                return TENS[number / 10] + (number % 10 != 0 ? "-" + numberToWords(number % 10) : "");
            }                                             //condition?if_true:if_false
            if (number < 1000) {
                return LESS_THAN_20[number / 100] + " hundred" + (number % 100 != 0 ? " " + numberToWords(number % 100) : "");
            }
            if (number < 1000000) {
                return numberToWords(number / 1000) + " thousand" + (number % 1000 != 0 ? " " + numberToWords(number % 1000) : "");
            }
            if (number < 1000000000) {
                return numberToWords(number / 1000000) + " million" + (number % 1000000 != 0 ? " " + numberToWords(number % 1000000) : "");
            }
            return numberToWords(number / 1000000000) + " billion" + (number % 1000000000 != 0 ? " " + numberToWords(number % 1000000000) : "");
        }

//iteration迭代：这一次结果作为下一次的初始值
    //recursion递归：引用自身
    public static int factorial1(int n) {
          if (n==0){
            return 1;

          }
          else
              return n*factorial1(n-1);}


    public static int fibonacci(int n) {
            if(n==0){
                return 0;
            }
            else if(n==1){
                return 1;
            }
            else{
                return fibonacci(n-1)+fibonacci(n-2);
        }
    }


    }

import java.util.Scanner;

public class Calc {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        Scanner scanner = new Scanner(name);
        scanner.useDelimiter(" ");

        if (scanner.hasNextInt())
        {

            int a = scanner.nextInt();
            String b = scanner.next();
            int c = scanner.nextInt();

            if (b.equals("+")) {System.out.println(a+c);} else {
                if (b.equals("-")) {System.out.println(a-c);}
                else { if  (b.equals("*")) {System.out.println(a*c);}
                else { if  (b.equals("/")) {System.out.println(a/c);}
                }
                }
            }
        } //normal numbers done here
        else {
            String first = scanner.next();
            String op = scanner.next();
            String sec = scanner.next();
            int decimal = 0;

            for(int x = 0;x<first.length();x++)
            {
                char convertToDecimal = first.charAt(x);

                switch (convertToDecimal)
                {


                    case 'X':
                        decimal += 10;
                        break;

                    case 'V':
                        decimal += 5;
                        break;

                    case 'I':
                        decimal += 1;
                        break;
                }
            }
            if (first.contains("IV"))
            {
                decimal-=2;
            }
            if (first.contains("IX"))
            {
                decimal-=2;
            }


            int a = decimal;
            decimal = 0;

            for(int x = 0;x<sec.length();x++)
            {
                char convertToDecimal = sec.charAt(x);

                switch (convertToDecimal)
                {


                    case 'X':
                        decimal += 10;
                        break;

                    case 'V':
                        decimal += 5;
                        break;

                    case 'I':
                        decimal += 1;
                        break;
                }
            }
            if (sec.contains("IV"))
            {
                decimal-=2;
            }
            if (sec.contains("IX"))
            {
                decimal-=2;
            }

            int c = decimal;
            int res = 0;
            if (op.equals("+")) {res = a+c;} else {
                if (op.equals("-")) {res = a-c;}
                else { if  (op.equals("*")) {res = a*c;}
                else { if  (op.equals("/")) {res = a/c;}
                }
                }
            }

            String Roman = "";
            String onesArray[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            String tensArray[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String hundredsArray[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

            int ones = res % 10;
            res = (res - ones) / 10;
            int tens = res % 10;
            res = (res - tens) / 10;
            int hundreds = res % 10;
            if (hundreds >= 1) {
                Roman += hundredsArray[hundreds - 1];
            }

            if (tens >= 1) {
                Roman += tensArray[tens - 1];
            }

            if (ones >= 1) {
                Roman += onesArray[ones - 1];

            }

            System.out.println(Roman);
        }



    }
}


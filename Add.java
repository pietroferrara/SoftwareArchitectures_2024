public class Add {

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE/2);
        try {
            if (args.length < 2) {
                System.out.println("Usage: java Add <a> <b>");
                return;
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println(add(n1, n2));
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid number");
        }
        catch(ArithmeticException e2) {
            //DECIDE WHAT I WANT TO DO
        }
    }
}

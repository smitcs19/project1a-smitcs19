public class Lab1 {

    public static void main(String[] args) {
        //System.out.println("Hello World");

        int n;

        try{
            n = Integer.parseInt(args[0]);
            if(n==args.length-1) {
                for (int i = 1; i <= n; i++) {
                    System.out.println(args[i]);
                }
            } else {
                System.out.println("There int value does not match the number of names given.");
            }
        }
        catch (NumberFormatException e1) {
            System.out.println("Int is not first");
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("The int is too large");
        }

    }
}
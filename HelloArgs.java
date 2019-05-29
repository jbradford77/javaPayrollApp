public class HelloArgs {
    public static void main(String[] args) {
 
        // using indexed loop
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
 
        // using foreach loop
        for (String a : args)
            System.out.println(a);
    }
}
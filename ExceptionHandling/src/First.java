public class First {
    public static void main(String []args){
        try {
            int a = 3, b = 7;
            int c = a / b;
            System.out.println(c);
            System.out.println("tata buy buy");

        }
        catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }
        System.out.println("hello errors");
    }
}

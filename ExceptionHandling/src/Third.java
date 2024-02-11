public class Third {
    public static void main(String[] args) {
        //nested try and catch block
        int a = 10, b = 0;
        try {

            int arr[] = {1, 2, 3, 4, 5};
            try {
                System.out.println(a / b);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("program ends");

    }
}

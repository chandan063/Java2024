public class Second {
    public static void main(String []args){
        //for multiple error in single program
        try {
            int a[] = {1, 0, 5, 7, 9};//if zero at 2nd index first catch will appear
            int b[]={1, 9, 5, 7, 9};
            int r;
//            r = a[0] / a[1];
            r = b[0] / b[1];
            System.out.println(r);
            System.out.println(b[10]);//in second catch its shows wrong index
        }
        catch (ArithmeticException e){
            System.out.println("can't divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("hello");
    }
}

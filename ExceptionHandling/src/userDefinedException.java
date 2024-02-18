//user defined exception must extends parent class exception
    class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "balance should not be less tham 5000";
    }
}
public class userDefinedException {
   static void fun1(){
        try{
            throw new LowBalanceException();
        }
        catch (Exception e){
            System.out.println(e);
        }
   }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }

}

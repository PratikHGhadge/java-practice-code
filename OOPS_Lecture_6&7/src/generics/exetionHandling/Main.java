package generics.exetionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a,b);
//            throw new Exception("Just for fun");
            String name = "Pratik";
            if (name.equals("Pratik")){
                throw new MyException("name is pratik");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Normal Exception");
        }
        finally {
            System.out.println("finally means this will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}

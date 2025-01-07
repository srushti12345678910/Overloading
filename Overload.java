public class Overload {
    public void print(int a) {
        System.out.println("int-" + a);
    }

    public void print(double a) {
        System.out.println("Double -" + a);
    }


    public void print(String a) {
        System.out.println("String -" + a);
    }
}

class Overloading {
    //    declare a class with name OverloadingEx
    public static void main(String[] args) {

        Overload obj= new  Overload();
//       As we give argument it will automatically print according to the datatype
        obj.print(10);
        obj.print(10.2);
        obj.print("ABC");
    }
}


package Generic.ex1;

public class Main {

    public static void main(String[] args) {
        IntegerBox integerBox1 = new IntegerBox();
        integerBox1.setA(10); // 오토 박싱
        Integer integer = integerBox1.getA();
        System.out.println("integer = " + integer);

        System.out.println("---------------------------------");

        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer1 = (Integer) integerBox.getValue(); //Object - > Integer 캐스팅
        System.out.println("integer = " + integer1);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("Hello");
        String string = (String) stringBox.getValue(); // Object - > String 캐스팅
        System.out.println("string = " + string);


    }
}

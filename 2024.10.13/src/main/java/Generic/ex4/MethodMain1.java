package Generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;

        GenericMehod.objMethod(i);
        System.out.println();


        //  타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMehod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        System.out.println();
        Integer result2 = GenericMehod.<Integer>numberMethod(20);
        System.out.println("result2 = " + result2);
    }


}

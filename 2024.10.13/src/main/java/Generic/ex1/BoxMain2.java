package Generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>();
        // 생성 시점의 T의 타입을 결정한다.

        integerGenericBox.set(10);

        //타입이 다르면 컴파일 오류로 확인 가능
        //integerGenericBox.set("200");

        // Integer 타입 반환 (캐스팅X)
        Integer integer = integerGenericBox.get();
        System.out.println("integer = " + integer);

        System.out.println("----------------------------------");

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");


        String string = stringBox.get();
        System.out.println("string = " + string);




    }
}

package Generic.ex1;

public class GenericBox <T> {
    /*<T> 라는 임시 타입을 설정 한 후 사용자가 타입을 정의해서 쓸 수 있도록 한다.*/
    /*이 T를 타입 매개 변수라고 한다*/

    private T value;


    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}

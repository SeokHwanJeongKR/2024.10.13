package Generic.ex3;

import Generic.Animal.Animal;
import Generic.Animal.Cat;
import Generic.Animal.Dog;

public class AnimalHospitalMAinV2 {

    public static void main(String[] args) {
        AnimalHospitalV1<Dog> dogHospital= new AnimalHospitalV1<>();
        AnimalHospitalV1<Cat> catHospital = new AnimalHospitalV1<>();
        //AnimalHospitalV1<Integer> dogAnimalHospitalV1 = new AnimalHospitalV1<>();

        Dog dog = new Dog("멍멍이1" , 100);
        Cat cat  = new Cat("냐옹이1" , 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //dogHospital.set(cat);
        //다른 타입 입력 : 컴파일 오류

        //문제 2 고양이를 넣으면 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("biggerDog = " + biggerDog);


    }
}

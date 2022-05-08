class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    Dog(){ //Constructor
        sleep();
    }
    void sleep(){
        System.out.println(this.name+" zzz");
    }
}

class HouseDog extends Dog{
    void sleep(){
        System.out.println(this.name+" zzz in house");
    }
}

/*
The Dog Class inherited Animal Class
Dog IS-A Animal
 */
public class Inher {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();


        // Dog is-a Animal
        // So you can write like this :
        Animal dog2 = new Dog();
        // it means "Data type of Dog is Animal"
        // 개로 만든 객체는 동물 자료형이다.

        // but you can't use sleep() method.
        // dog2.sleep(); : ERROR

        // But Animal isn't Dog
        // Dog dog3 = new Animal(); : ERROR

        // it means "Data type of Animal is Dog"
        // 동물로 만든 객체는 개 자료형이다.


        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();

        // JAVA 는 다중상속을 지원하지 않는다.



    }
}

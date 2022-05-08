/*
동물이 계속 추가될때마다 feed 메소드를 추가하는건 너무 귀찮음
interface 사용
보통은 Predator.java 처럼 별도 java파일로 저장함.
 */

interface Predator{
    String getFood(); //인터페이스를 implements한 클래스들이 구현해야 하는 메소드임

}

interface Barkable{
    void bark();
}

class Animal2{
    String name;

    void SetName(String name){
        this.name = name;
    }
}

class Tiger extends Animal2 implements Predator, Barkable{
    public String getFood(){
        return "apple";
    }

    public void bark(){
        System.out.println("어흥");
    }
}

class Lion extends Animal2 implements Predator, Barkable{
    public String getFood(){
        return "banana";
    }

    public void bark(){
        System.out.println("으르렁");
    }
}

class ZooKeeper {
//    void feed(Tiger tiger){
//        System.out.println("feed apple");
//    }
//
//    void feed(Lion lion){
//        System.out.println("feed banana");
//    }
    void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer{
//    void barkAnimal(Animal2 animal){
//        if(animal instanceof Tiger){
//            System.out.println("어흥");
//        } else if(animal instanceof Lion){
//            System.out.println("으르렁");
//        }
//    }
    void barkAnimal(Barkable animal){
        animal.bark();
    }
}

public class Zoo{
    public static void main(String[] args){
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }

}

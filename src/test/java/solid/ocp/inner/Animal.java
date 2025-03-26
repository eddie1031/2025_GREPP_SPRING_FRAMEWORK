package solid.ocp.inner;

public class Animal {

    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("먹을것을 먹었습니다!");
    }
    public void sleep() {}
    public void drink() {}

    public void run(int speed) {

    }

    public void hide(String place) {
        System.out.println(place);
    }

}

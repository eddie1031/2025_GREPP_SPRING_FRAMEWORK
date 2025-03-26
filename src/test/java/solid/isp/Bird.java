package solid.isp;

public class Bird implements Flyable, Eatable {
    @Override
    public void eat() {
        System.out.println("새가 모이를 먹습니다!");
    }

    @Override
    public void fly() {
        System.out.println("새가 하늘을 날아다닙니다!");
    }
}

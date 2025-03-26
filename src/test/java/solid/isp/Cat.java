package solid.isp;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("고양이가 먹습니다.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("고양이는 날 수 없습니다.");
    }

    @Override
    public void swim() {
        System.out.println("고양이가 수영합니다.");
    }

}

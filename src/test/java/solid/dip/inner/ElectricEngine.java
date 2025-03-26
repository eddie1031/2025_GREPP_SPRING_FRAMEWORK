package solid.dip.inner;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("전기 엔진입니다!");
    }
}

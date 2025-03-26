package solid.ocp.inner;

public class Tower {

    private final String place = "안전한 공간";

    public void serve(Animal animal) {
        animal.hide(place);
    }

}

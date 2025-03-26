package solid.srp.s1;

public class MacGyverKnife {

    private Knife knife;
    private ScrewDriver screwDriver;
    private BottleOpener bottleOpener;
    private Lighter lighter;

    public MacGyverKnife() {
        this.knife = new Knife();
        this.screwDriver = new ScrewDriver();
        this.bottleOpener = new BottleOpener();
        this.lighter = new Lighter();
    }

    public void cut() {
        knife.cut();
    }

    public void screw() {
        screwDriver.screw();
    }

    public void bottleOpen() {
        bottleOpener.bottleOpen();
    }

    public void lightFire() {
        lighter.lightFire();
    }


}

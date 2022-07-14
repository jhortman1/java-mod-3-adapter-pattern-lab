public class Photographer {

    private Camera traditionalCamera;
    private DigitalCamera digitalCamera;

    public Photographer(Camera camera) {
        this.traditionalCamera = camera;
    }
    public Photographer(DigitalCamera camera) {
        this.digitalCamera = camera;
    }

    public void takeTraditionalPhotograph()
    {
        traditionalCamera.takePhotograph(1/60);
    }
    public void takeDigitalPhotograph()
    {
        digitalCamera.takePhotograph(1/60);
    }

}

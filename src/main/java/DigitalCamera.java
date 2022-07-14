public class DigitalCamera implements CameraAdapter {
    private Camera traditionalCamera;

    public DigitalCamera(Camera traditionalCamera) {
        this.traditionalCamera = traditionalCamera;

    }

    @Override
    public void takePhotograph(double shutterSpeed) {
        Logger.getInstance().log(getName() + " is taking a photograph");

        traditionalCamera.getMirrorOps().openMirror();;

        traditionalCamera.getShutterOps().setShutterSpeedSetting(shutterSpeed);
        traditionalCamera.getShutterOps().initializeShutter();
        traditionalCamera.getShutterOps().activateShutter();
        traditionalCamera.getShutterOps().releaseShutter();

        Logger.getInstance().log(getName() + " is done taking this photograph");
    }
    public String getName()
    {
        return traditionalCamera.getName();
    }
}

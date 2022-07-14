public class PhotoStudio {
    public static void main(String[] args) {
        CameraFactory cameraFactory = new CameraFactory();

        Camera myTraditionalCamera = cameraFactory.makeCamera(CameraFactory.CameraManufacturer.NIKON_FILM);

        DigitalCamera myDigitalCamera = new DigitalCamera(myTraditionalCamera);

        Photographer james = new Photographer(myDigitalCamera);
        james.takeDigitalPhotograph();


    }
}

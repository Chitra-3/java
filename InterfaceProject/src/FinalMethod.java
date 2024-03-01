public class FinalMethod {
    public static void main(String[] args) {
        // Camera cam=new Camera();
        // cam.click();


        // VideoCamera videoCamera=new VideoCamera();
        // videoCamera.record();
        Camera cam=new VideoCamera();
        try{
             cam.click();
        }
       catch(PhotoBlurredException e){
        System.out.println("Photo creation problem"+e);
       }
        // cam.record(); //because camera has no record fun
    }
} 
class CameraException extends Exception{
    CameraException(String str){
        super(str);
    }
}
class PhotoBlurredException extends Exception{
    PhotoBlurredException(String str){
        super(str);
    }
}
class RecordingException extends CameraException{
     RecordingException(String str){
        super(str);
     }
}
class Camera{
    void click() throws CameraException{
        
        double val=Math.random()%10;
        // if(val>0.75){
        //      throw new PhotoBlurredException("Photo is blurred");
                
        // }
        // else{
           System.out.println("Camera is clicking a photo");
        // }
    }
}
class VideoCamera extends Camera{
    void click() throws PhotoBlurredException,RecordingException{  //photoblurredexception is parent's exception but recordingexception is child's exception
        // super.click();
        System.out.println("Video Camera is clicking a photo during the shoot");
    }
    void record(){
            System.out.println("Video Camera is recording the shoot");
       
    }
}
/**
 * Created by co17 on 15/06/2017.
 */

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.imgcodecs.Imgcodecs;


public class ocv {
    
    public ocv ()
    {

    }

    public void run()
    {
        String filename = "";

        CascadeClassifier faceDetector = new CascadeClassifier((getClass().getResource("C:\\Users\\co17\\LocalStuff\\MyStuff\\Projects\\hypatia\\opencv\\opencv\\sources\\data\\lbpcascades\\lbpcascade_frontalface.xml").getPath()));
        Mat image = Imgcodecs.imread(getClass().getResource("/lena.png").getPath());



    }


}

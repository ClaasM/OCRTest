import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class Test {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        File imageFile = new File("res/images/eurotext.bmp");
        //Using Tesseract
        Tesseract tesseract = new Tesseract();
        try {
            String result = tesseract.doOCR(imageFile);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}

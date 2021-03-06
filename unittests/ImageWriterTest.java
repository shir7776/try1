package unittests;


import org.junit.Test;
import renderer.ImageWriter;

import java.awt.*;



class ImageWriterTest {
//test to check that image writer works correctly
    @Test
    void writeToImage() {
        String imagename = "img";
        int width = 1600;
        int height = 1000;
        int nx =500;
        int ny =800;
        ImageWriter imageWriter = new ImageWriter(imagename, width, height, nx, ny);
        for (int col = 0; col < ny; col++) {
            for (int row = 0; row < nx; row++) {
                if (col % 10 == 0 || row % 10 == 0) {
                    imageWriter.writePixel(row, col, Color.blue);
                }
            }
        }
        imageWriter.writeToImage();
    }
}
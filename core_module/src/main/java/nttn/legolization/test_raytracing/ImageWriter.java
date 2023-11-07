package nttn.legolization.test_raytracing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWriter {
    public static void toPNG(int[][] pixels, String filename) {
        int height = pixels.length;
        int width = pixels[0].length;

        // Create a BufferedImage to hold the pixel data
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Populate the BufferedImage with pixel data
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixelValue = pixels[y][x];
                image.setRGB(x, y, pixelValue);
            }
        }

        try {
            // Write the BufferedImage to a PNG file
            ImageIO.write(image, "png", new File(filename));
            System.out.println("PNG image saved successfully to: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while saving the image: " + e.getMessage());
        }
    }
}

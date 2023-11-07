package nttn.legolization.test_raytracing;

public class ImageWriter {
    public static void toPPM(int[][] pixels, String filename) {
        int height = pixels.length;
        int width =  pixels[0].length;
        String first = "P6\n" +width+ " " + height + "\n255\n";
        // TODO: write to the ppm file;
        for (int j = 0; j < height; ++j) {
            for (int i = 0; i < width; ++i) {
                int color = pixels[j][i];
                System.out.println(color);
//                byte r = ;
//                byte g = ;
//                byte b = ;
            }
        }
    }

}

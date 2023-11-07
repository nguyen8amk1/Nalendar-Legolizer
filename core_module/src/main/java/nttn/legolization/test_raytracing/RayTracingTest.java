package nttn.legolization.test_raytracing;

import org.joml.Vector3d;

public class RayTracingTest {
    /*
    TODO: write a ray tracing to 3d triangle mesh
            output ppm image
    * */

    private Vector3d castRay(Ray ray) {
        Sphere sphere = new Sphere(new Vector3d(0.0f, 0.0f, -1.0f), 0.5);
        double hit = RayIntersectionChecker.raySphere(ray, sphere);
        if (hit > 0.0f) {
            Vector3d normal = new Vector3d();
            Vector3d mul = new Vector3d();
            ray.direction().mul(hit, mul);
            Vector3d add = new Vector3d();
            ray.origin().add(mul, add);
            Vector3d sub = new Vector3d();
            add.sub(sphere.center(), sub);
            sub.normalize(normal);
            return normal;
        }
        return new Vector3d(.18);
    }

    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int[][] pixels = new int[HEIGHT][WIDTH];

    public void raytrace() {
        // TODO: modify the pixels 2d array
        final float FOV = 90;
        float scale = (float) Math.tan(Math.toRadians(FOV * 0.5f));
        float image_aspect_ratio = (float)WIDTH / HEIGHT;

        for (int j = 0; j < HEIGHT; ++j) {
            for (int i = 0; i < WIDTH; ++i) {
                float u = (2.0f * (i + 0.5f) / (float)WIDTH- 1.0f) * scale;
                float v = (1.0f - 2.0f * (j + 0.5f) / (float)HEIGHT) * scale * 1.0f / image_aspect_ratio;
                Ray ray = new Ray(new Vector3d(0.0f), new Vector3d(u, v, -1.0f));
                Vector3d colour = castRay(ray);

                byte r = (byte)(255 * colour.x);
                byte g = (byte)(255 * colour.y);
                byte b = (byte)(255 * colour.z);
                byte a = (byte)255;
                System.out.println(colour);

                int color = (a << 24) | (r << 16) | (g << 8) | b;
                pixels[j][i] = color;
            }
        }

        ImageWriter.toPNG(pixels, "output.png");
    }


    public static void main(String[] args) {
        new RayTracingTest().raytrace();
    }
}

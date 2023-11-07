package nttn.legolization.test_raytracing;

import org.joml.Vector3d;

public class RayTracingTest {
    /*
    TODO: write a ray tracing to 3d triangle mesh
            output ppm image
    * */

    private Vector3d castRay(Ray ray) {
//        Sphere sphere = new Sphere(Vector3d(0.0f, 0.0f, -1.0f), 0.5);
//        double hit = RayIntersectionChecker.raySphere(ray, sphere);
//        if (hit > 0.0f) {
//            Vector3d normal;
//            = glm::normalize((r.o + hit * r.d) - Vector3d(0.0f, 0.0f, -1.0f));
//            return normal;
//        }
//        return new Vector3d(.18);
        return null;
    }

    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int[][] pixels = new int[HEIGHT][WIDTH];

    public void raytrace() {
        // TODO: modify the pixels 2d array
//        float scale = tan(deg2rad(options.fov * 0.5f));
//        float image_aspect_ratio = options.width / (float)options.height;

        for (int j = 0; j < HEIGHT; ++j) {
            for (int i = 0; i < WIDTH; ++i) {
//                float u = (2.0f * (i + 0.5f) / (float)WIDTH- 1.0f) * scale;
//                float v = (1.0f - 2.0f * (j + 0.5f) / (float)HEIGHT) * scale * 1.0f / image_aspect_ratio;
//                Ray ray = Ray(Vector3d(0.0f), Vector3d(u, v, -1.0f));
//                Vector3d colour = cast_ray(ray);
//
//                char r = (char)(255.99f * colour.x);
//                char g = (char)(255.99f * colour.y);
//                char b = (char)(255.99f * colour.z);
                pixels[j][i] = 0xFFFFFF00;
            }
        }
        ImageWriter.toPNG(pixels, "output.png");
    }


    public static void main(String[] args) {
        new RayTracingTest().raytrace();
    }
}

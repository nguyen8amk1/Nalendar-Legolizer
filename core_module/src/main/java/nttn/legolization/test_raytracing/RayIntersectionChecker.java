package nttn.legolization.test_raytracing;
import org.joml.Vector3d;


public class RayIntersectionChecker {
    public static double raySphere(Ray ray, Sphere sphere) {
        Vector3d oc = new Vector3d();
        ray.origin().sub(sphere.center(), oc);

        double a = ray.direction().dot(ray.direction());
        double b = 2.0f * oc.dot(ray.direction());
        double c = oc.dot(oc) - sphere.radius() * sphere.radius();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0.0f) {
            return -1.0f;
        } else {
            return (double) (-b - Math.sqrt(discriminant)) / (2.0f * a);
        }
    }
}

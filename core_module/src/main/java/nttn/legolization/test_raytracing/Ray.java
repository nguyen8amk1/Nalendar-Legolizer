package nttn.legolization.test_raytracing;
import glm.vec._3.d.Vec3d;

public class Ray {
    public Vec3d origin, direction;
    public Ray(Vec3d origin, Vec3d direction) {
        this.origin = origin;
        this.direction = direction;
    }
}
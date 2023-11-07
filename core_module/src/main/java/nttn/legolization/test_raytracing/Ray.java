package nttn.legolization.test_raytracing;

import org.joml.Vector3d;

public class Ray {
    public Vector3d origin, direction;
    public Ray(Vector3d origin, Vector3d direction) {
        this.origin = origin;
        this.direction = direction;
    }
    public Vector3d origin() { return origin; }
    public Vector3d direction() { return direction; }
}
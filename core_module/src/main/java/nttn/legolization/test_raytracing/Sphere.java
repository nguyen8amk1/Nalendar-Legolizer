package nttn.legolization.test_raytracing;


import org.joml.Vector3d;

public class Sphere {
    private final Vector3d center;
    private final double radius;
    public Sphere(Vector3d center, double radius ) {
        this.center = center;
        this.radius = radius;
    }

    public Vector3d center() { return center; }
    public double radius() { return radius; }
}

package nttn.legolization.core;

public class Core {
    public static void main(String[] args) {
        hello();
    }

    public static void hello() {
        System.out.println("DITMESAIGON");
        Voxelizer.voxelize("testfile.f3d");
    }
}

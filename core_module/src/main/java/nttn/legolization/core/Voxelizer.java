package nttn.legolization.core;


public class Voxelizer {
    /*
    TODO:
        input:  3d filename
        output: 3d voxelize information
        // for now we just use void as return type
    * */

    public static void voxelize(String filename) {
        if(!FileFormatChecker.fileFormatIsSupported(filename)) {
            System.out.println("File format not supported");
            return;
        }
        System.out.println("About to voxelize the 3d file " + filename);
    }
}

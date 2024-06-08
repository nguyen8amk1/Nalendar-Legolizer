package nttn.legolization.core;


public class Voxelizer {
    /*
    NOTE:
        input:  3d filename
        output: 3d voxelize information
    */

    public static VoxelData voxelize(String filename) {
        VoxelData voxelData = new VoxelData();
        if(!FileFormatChecker.fileFormatIsSupported(filename)) {
            System.out.println("File format not supported");
            return;
        }
        System.out.println("About to voxelize the 3d file " + filename);

        // TODO: do the voxel processing 

        
        return voxelData;
    }
}

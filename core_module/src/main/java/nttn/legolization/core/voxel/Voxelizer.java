package nttn.legolization.core.voxel;

import java.lang.Exception;

public class Voxelizer {
    /*
    NOTE:
        input:  3d filename
        output: 3d voxelize information
    */

    public static VoxelData voxelize(String filename) throws Exception {
        VoxelData voxelData = new VoxelData();
        if(!FileFormatChecker.fileFormatIsSupported(filename)) {
            throw new Exception("File format not supported");
            // System.out.println("File format not supported");
            // return null;
        }
        System.out.println("About to voxelize the 3d file " + filename);

        // TODO: do the voxel processing 

        
        return voxelData;
    }
}

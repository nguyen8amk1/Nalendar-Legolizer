package nttn.legolization.core;


public class Voxelizer {
    /*
    TODO:
        input:  3d filename
        output: 3d voxelize information (a voxel format that can be rendered using our 3d engine)
            -> a list of voxel position ?? -> this seems BETTER
            -> or just a class that comes with a render method ? (this will be hard to batch)
         -> We gonna do "Voxel ray casting"
        // for now we just use void as return type
    * */

    public static VoxelFormat voxelize(String filename) {
        if(!FileFormatChecker.fileFormatIsSupported(filename)) {
            System.out.println("File format not supported");
            return null;
        }
        VoxelFormat voxel = new VoxelFormat();
        System.out.println("About to voxelize the 3d file " + filename);
        return voxel;
    }
}

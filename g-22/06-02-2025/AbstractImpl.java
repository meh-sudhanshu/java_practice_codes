interface CloudStorage{
    public String uploadFile(String path);
    public String downloadFil(String path);
    public String deleteFil(String path);
    public String moveToTrahs(String path);
}
abstract class CloudStorageWithAbstract{
    abstract public String uploadFile(String path);
    abstract public String downloadFil(String path);
    abstract public String deleteFile(String path);
    public String moveToTrash(String path){
        return "";
    }
}
class Mega extends CloudStorageWithAbstract{

    @Override
    public String uploadFile(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uploadFile'");
    }

    @Override
    public String downloadFil(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'downloadFil'");
    }

    @Override
    public String deleteFile(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFil'");
    }

}


class GoolgleDrive implements CloudStorage{

    @Override
    public String uploadFile(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uploadFile'");
    }

    @Override
    public String downloadFil(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'downloadFil'");
    }

    @Override
    public String deleteFil(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFil'");
    }

    @Override
    public String moveToTrahs(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToTrahs'");
    }


}
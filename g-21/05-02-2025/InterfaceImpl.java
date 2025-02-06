interface CloudStorage{
    public void uploadFile(String path);
    public String downloadFile(String path);
    public void moveToTrash(String filePath);
}
abstract class CloudStorageWithAbstract {
    abstract public void uploadFile(String path);
    abstract public String downloadFile(String path);
    public void moveToTrash(String filePath){}
}
class Mega extends CloudStorageWithAbstract{

    @Override
    public void uploadFile(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uploadFile'");
    }

    @Override
    public String downloadFile(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'downloadFile'");
    }

    

}





class GoogleDrive implements CloudStorage{


    @Override
    public String downloadFile(String path) {
        return "";
    }

    @Override
    public void uploadFile(String path) {
    }

    @Override
    public void moveToTrash(String filePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToTrash'");
    }
}


class InterfaceImpl{
    public static void main(String[] args) {
        
    }
}
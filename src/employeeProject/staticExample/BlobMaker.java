package employeeProject.staticExample;

public class BlobMaker {

    public static void main(String[] args) {
        Blob a, b, c;
        System.out.println("I start with " + Blob.getBlobCount() + "blobs.");
        a = new Blob("Joey");
        b = new Blob("Frankie");
        c = new Blob("Moe");
        System.out.println("I have " + Blob.getBlobCount() + " blobs.");
        System.out.println("My blobs are called: ");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());

    }

}

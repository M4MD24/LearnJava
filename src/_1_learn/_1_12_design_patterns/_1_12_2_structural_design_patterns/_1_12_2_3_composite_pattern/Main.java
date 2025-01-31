package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_3_composite_pattern;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        FileSystemComponents[] documents = new FileSystemComponents[]{
                new File("Document1.txt"),
                new File("Document2.txt"),
                new File("Document3.txt")
        };
        FileSystemComponents[] images = new FileSystemComponents[]{
                new File("Image1.mp3"),
                new File("Image2.mp3"),
                new File("Image3.mp3")
        };
        FileSystemComponents[] videos = new FileSystemComponents[]{
                new File("Video1.mp4"),
                new File("Video2.mp4"),
                new File("Video3.mp4")
        };

        Folder folderOfDocuments = new Folder("My Documents");
        folderOfDocuments.addComponent(documents);

        Folder folderOfImages = new Folder("My Images");
        folderOfImages.addComponent(images);

        Folder folderOfVidoes = new Folder("My Videos");
        folderOfVidoes.addComponent(videos);

        Folder mainFolder = new Folder("Main Folder");
        mainFolder.addComponent(
                folderOfDocuments,
                folderOfImages,
                folderOfVidoes
        );

        mainFolder.showDetails();
    }
}
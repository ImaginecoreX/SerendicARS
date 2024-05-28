package icx.model;

import java.io.File;

/**
 *
 * @author sandaruwan
 */
public class UploadFileDTO {

    private File fileToOpen;
    private String path;
    private String fileName;
    private String fileExtension;

    /**
     * @return the fileToOpen
     */
    public File getFileToOpen() {
        return fileToOpen;
    }

    /**
     * @param fileToOpen the fileToOpen to set
     */
    public void setFileToOpen(File fileToOpen) {
        this.fileToOpen = fileToOpen;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the fileExtension
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * @param fileExtension the fileExtension to set
     */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

}

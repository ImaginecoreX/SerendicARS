package icx.util;

import icx.model.UploadFileDTO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sandaruwan
 */
public class FileSelector {

    private static final Logger logger = Logger.getLogger(FileSelector.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("fileSelector.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.warning("Failed to initialize logger handler: " + e.getMessage());
        }
    }

    /**
     * CHOSE IMAGE
     *
     */
    private UploadFileDTO handleImage(String path, String fileName, String fileNameTitle, String fileExtension, String fileChooserDialogTitle, String extensionsTitle, String extensions) {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle(fileChooserDialogTitle);

        // Set the file filter for SVG Files
        FileNameExtensionFilter filter = new FileNameExtensionFilter(extensionsTitle, extensions);
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();

            UploadFileDTO dto = new UploadFileDTO();
            dto.setFileToOpen(fileToOpen);
            dto.setPath(path);
            dto.setFileName(fileName);
            dto.setFileExtension(fileExtension);
            
            return dto;
            
        } else {
            logger.info("File selection cancelled by user.");
            return null;
        }

    }

    /**
     ** UPLOAD FILE
     *
     */
    public String upload(UploadFileDTO dto) {

        //Define the Destination path
        String destinationPath = dto.getPath() + dto.getFileName() + "." + dto.getFileExtension();
        File deFile = new File(destinationPath);

        try {

            //Copy and rename the file to the destination path
            Files.copy(dto.getFileToOpen().toPath(), deFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("File uploaded to: " + deFile.getAbsolutePath());
            return deFile.getAbsolutePath();

        } catch (IOException e) {
            logger.severe("File upload failed: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "File upload failed: " + e.getMessage());
            return null;
        }

    }

    /**
     ** TRIGGER FILE CHOOSER
     *
     */
    public UploadFileDTO chooseImage(JFrame frame, String path, String fileName, String fileNameTitle, String fileExtension, String fileChooserDialogTitle, String extensionsTitle, String extensions) {

        if (fileName == null || fileName.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter the " + fileNameTitle + " before selecting the " + fileExtension + " file.");
            return null;
        }

        UploadFileDTO dto = this.handleImage(path, fileName, fileNameTitle, fileExtension, fileChooserDialogTitle, extensionsTitle, extensions);
        if (dto != null) {
            return dto;
        }

        return null;
    }

}

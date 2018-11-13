import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class CourseFile {
    private String fileName;
    private Date dateOfLoading;
    private File file;

    public CourseFile(String fileName, File file){
        this.fileName = fileName;
        dateOfLoading = new Date();
        this.file = file;
    }

    public Date getDateOfLoading() { return dateOfLoading; }

    public File getFile() { return file; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            CourseFile cf = (CourseFile) obj;
            return file.equals(cf.file) && fileName.equals(cf.fileName);
        }
        return false;
    }

    @Override
    public String toString() {
        return fileName + " " + dateOfLoading;
    }
}

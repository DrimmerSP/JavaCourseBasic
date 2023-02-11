package webinares.week9.part2.logger;

public abstract class FileOutputter {
    protected String fileName = "defaultFileName";

    public String getDefaultFileName() {
        return fileName;
    }

    protected FileOutputter(String fileName) {
        this.fileName = fileName;
    }

    protected FileOutputter() {
    }

    abstract String getFileExtension();
}

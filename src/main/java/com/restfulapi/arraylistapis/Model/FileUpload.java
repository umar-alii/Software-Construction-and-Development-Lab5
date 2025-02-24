package com.restfulapi.arraylistapis.Model;

public class FileUpload
{
    private String fileName;

    private String fileType;

    private String uploadDate;

    private double filesize;

    public FileUpload(){

    }

    FileUpload(String fileName, String fileType, String uploadDate, double filesize){
        this.fileName = fileName;
        this.fileType = fileType;
        this.uploadDate = uploadDate;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public double getFilesize() {
        return filesize;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }
}

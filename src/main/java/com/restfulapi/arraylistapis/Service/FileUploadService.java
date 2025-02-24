package com.restfulapi.arraylistapis.Service;


import com.restfulapi.arraylistapis.Model.FileUpload;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FileUploadService {
    private final List<FileUpload> userfiles = new ArrayList<>();
    private static final String PATH_TO_DIR="D:\\6th\\Construction and Development\\Lab Work\\Upload";

    public String uploadFile(MultipartFile file) {
        try {
            File dir = new File(PATH_TO_DIR);

            if (!dir.exists() && !dir.mkdirs()) {
                return "Directory could not be created";
            }

            String filetype= file.getContentType();
            if(filetype==null || (!filetype.equals("text/csv") && !filetype.equals("application/pdf") && !filetype.equals("application/msword"))){
                return "Invalid File TYpe";
            }

            String uniquename = UUID.randomUUID().toString()+" "+file.getOriginalFilename();
            File storageFile = new File(PATH_TO_DIR, uniquename);
            file.transferTo(storageFile);

            FileUpload userfile= new FileUpload();
            userfile.setFileName(uniquename);
            userfile.setFileType(filetype);
            userfile.setUploadDate(LocalDate.now().toString());

            userfiles.add(userfile);



        } catch (Exception e) {
            return "File Couldnot be created "+e.getMessage();
        }

        return "File Upload Successful";

    }

    public List<FileUpload> getallfiles()
    {
        return userfiles;
    }

    public String deletefilebyname(String name){
        Path filepath = Paths.get(PATH_TO_DIR, name);
        File file = filepath.toFile();
        if(file.exists() && file.delete()){
            userfiles.removeIf(f -> f.getFileName().equals(name));
            return "File is been deleted Successfully";
        }

        return "File Can't be Deleted";
    }
}

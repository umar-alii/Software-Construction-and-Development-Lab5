package com.restfulapi.arraylistapis.Controller;

import com.restfulapi.arraylistapis.Model.FileUpload;
import com.restfulapi.arraylistapis.Service.FileUploadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@RequestMapping("/file")
@RestController
public class FileController {

    private final FileUploadService fileuploadservice;

    public FileController(FileUploadService fileuploadservice) {
        this.fileuploadservice = fileuploadservice;
    }

    @GetMapping("/listallfiles")
    public ArrayList<FileUpload> allfiles(){
        return (ArrayList<FileUpload>) fileuploadservice.getallfiles();
    }
    @PostMapping("/upload/{file}")
    public ResponseEntity<String> uploadfile(@RequestParam ("file") MultipartFile file){
        String response=fileuploadservice.uploadFile(file);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{file}")
    public ResponseEntity<String> deletefile(@PathVariable String file){
        String response = fileuploadservice.deletefilebyname(file);
        return ResponseEntity.ok(response);
    }


}

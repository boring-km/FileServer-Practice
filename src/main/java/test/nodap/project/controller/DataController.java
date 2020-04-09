package test.nodap.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import test.nodap.project.service.FileLoadService;
import test.nodap.project.service.FileSaveService;

import java.util.*;

@RestController
public class DataController {
    
    @Autowired
    FileSaveService save_file_service;

    @Autowired
    FileLoadService load_file_service;

    @GetMapping("/data")
    public String what(){
        return "test Data";
    }
    
    // 폴더 내부 조회
    // 폴더 생성
    // 폴더로 이동
    // 파일 삭제
    // 파일 다운로드
    // 파일 업로드

    @PostMapping("/upload/dragupload")
    public Map<String,Object> dragupload(MultipartFile[] files) {
        return save_file_service.saveFiles(files);
    }
}

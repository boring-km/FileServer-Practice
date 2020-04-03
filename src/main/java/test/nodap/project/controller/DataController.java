package test.nodap.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

import project.service.SaveFilesService;


@RestController
public class DataController {
    
    @Autowired
    SaveFilesService save_file_service;
    
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
    @PostMapping("/upload")
    public String upload(MultipartFile[] files) {
        // 출처: https://preamtree.tistory.com/58 [Preamtree의 행복로그]
        String test = files[0].getContentType();
        return test;
    }
    
    @PostMapping("/dragupload")
    public Map<String,Object> dragupload(MultipartFile[] files) {
        return save_file_service.saveFiles(files);
    }
}

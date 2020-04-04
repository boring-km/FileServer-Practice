package test.nodap.project.service;

import java.util.*;
import java.io.File;

import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import test.nodap.project.entity.FileVO;
import test.nodap.project.repository.FileRepository;

@Service
public class FileSaveService {
    // Dependency Injection

    @Autowired
    FileRepository fileRepository;

    // final String PATH = "/workspace/FileBackUp/test";
    final String PATH = "d:/test";

    List<Map> fileList = new ArrayList<>();

    Map<String, String> map;


    public Map<String, Object> saveFiles(MultipartFile[] files) {
	    
        dirCheck(PATH); // 디렉토리가 없으면 추가
        saveFileToServer(files);        
	    return getResult();
    }
    
    
    private void dirCheck(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
    
    private void saveFileToServer(MultipartFile[] files) {
        for(int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
            map = new HashMap<>();
            
            String org_fileName = file.getOriginalFilename();
            String fileFullPath = PATH + "/" + org_fileName;
            
            try {
                file.transferTo(new File(fileFullPath)); // 파일 생성됨

                FileVO fileVO = new FileVO( "encrypted", org_fileName, fileFullPath);
                fileRepository.save(fileVO);

                map.put("originalFilename", org_fileName);
                map.put("fileFullPath", fileFullPath);
                fileList.add(map);
            } catch (Exception e) {
                System.out.println("file_error: " + fileFullPath);
                e.printStackTrace();
            }
        }
    }
    private Map<String, Object> getResult() {
        Map<String, Object> retVal = new HashMap<String, Object>(); //응답값 셋팅
        
	    try{
    		retVal.put("fileInfoList", fileList);	
    		retVal.put("code", "OK");
    	} catch (Exception e) { 
    		retVal.put("code", "FAIL");
        }
        return retVal;
    }
    
}

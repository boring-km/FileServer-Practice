package test.nodap.project.service;

import org.springframework.web.multipart.MultipartFile;
import java.util.*;

public interface SaveFilesService {
    public Map<String, Object> saveFiles(MultipartFile[] files);
}

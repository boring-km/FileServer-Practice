package test.nodap.project.service;

import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.nodap.project.entity.FileVO;
import test.nodap.project.repository.FileRepository;

import java.util.List;

@Service
public class FileLoadService {
    @Autowired
    FileRepository fileRepository;

    public List<FileVO> getFiles() {
        return ImmutableList.copyOf(fileRepository.findAll());
    }
}

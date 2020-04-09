package test.nodap.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FileLoadServiceTest {

    @Autowired
    FileLoadService fileLoadService;

    @Test
    void getFileOriginalNames() {
        assertEquals("name", fileLoadService.getFiles().get(0).fileOriginName);
    }
}
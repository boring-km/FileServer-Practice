package test.nodap.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    
    // 타임리프에서 업로드하기
    // https://preamtree.tistory.com/58
    
    // 파일 저장 및 다운로드
    // https://backback.tistory.com/226
    @GetMapping("/")
    public String mainPage() {
        
        return "base";
    }
    @GetMapping("/test")
    public String testPage() {
        return "dragdrop";
    }
}

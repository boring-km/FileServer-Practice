package test.nodap.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    
    // 타임리프에서 업로드하기
    // https://preamtree.tistory.com/58
    
    // 파일 저장 및 다운로드
    // https://backback.tistory.com/226
    @GetMapping("/")
    public String mainPage() {
        
        return "main";
    }
    @GetMapping("/upload")
    public String uploadPage() {
        return "upload";
    }
    @GetMapping("/download")
    public String downloadPage(Model model) {
        // 이동준 미션 1
        // 리스트를 model에 추가하기
        model.addAttribute("test", "테스트");
        model.addAttribute("test1", "테스트");
        model.addAttribute("test2", "테스트");
        model.addAttribute("test3", "테스트");
        return "download";
    }
}

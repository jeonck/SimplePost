package org.metacog.simplepost;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/main")
    @ResponseBody
    public String index() {
        return "Simple Post Board에 오신 것을 환영합니다";
    }
}

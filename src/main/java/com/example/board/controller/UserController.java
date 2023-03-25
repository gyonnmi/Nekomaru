package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    // http://localhost:8090/joinForm ----> "joinForm"이라는 이름의 템플릿을 사용(forward)하여 화면에 출력.
    // joinForm을 리턴한다는 것은
    // classpath:/templates/joinForm.html
    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    @PostMapping("joinOk")
    public String joinOk(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        return "redirect:/welcome";
    }

    @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }
}

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

    @PostMapping("/joinOk")
    public String joinOk(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/loginForm")
    public  String loginForm() {
        return "loginForm";
    }

    @PostMapping("/loginOk")
    public String loginOk(
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        // email과 password가 일치한다면(로그인 성공) 세션에 회원 정보 저장.
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout() {
        // 세션에서 회원 정보를 삭제한다.
        return "redirect:/";
    }

}

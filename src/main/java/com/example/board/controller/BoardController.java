package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// HTTP 요청을 받아서 응답을 하는 컴포넌트. 스프링부트가 자동으로 Bean으로 생성한다.
@Controller
public class BoardController {
    // 게시글 목록이 보이는 인덱스 페이지
    // 컨트롤러의 메소드가 리턴하는 문자열은 템플릿 이름이다.
    // http://localhost:8090/ ----> "index"라는 이름의 템플릿을 사용(forward)하여 화면에 출력.
    // index를 리턴한다는 것은
    // classpath:/templates/index.html
    @GetMapping("/")
    public String index() {
        return "index";
    }
}

package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        // 게시물 목록 출력.
        // 페이징 처리
        return "index";
    }

    @GetMapping("/detail")
    public String board(
            @RequestParam("id") int id
    ) {
        // id에 해당하는 게시물을 읽어온다.
        // id에 해당하는 게시물의 조회수도 1 증가한다.
        return "detail";
    }

    // 게시글 삭제 기능 추가. 관리자는 모든 글 삭제 가능
    // 게시글 수정 기능 추가.
}

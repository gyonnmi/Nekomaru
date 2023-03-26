package com.example.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// lombok을 사용하면 보이진 않지만 자동으로 getter, setter 메소드를 만들어준다.
@Setter
@Getter
@NoArgsConstructor // 기본 생성자가 자동으로 만들어진다.
public class User {
    private int userId;
    private String email;
    private String name;
    private String password;
    private String regdate; // date 타입으로 읽어온 후 문자열로 변환하는걸 권장.
}

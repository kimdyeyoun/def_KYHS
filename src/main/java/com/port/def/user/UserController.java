package com.port.def.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
    //테스트입ㄴ비다~~~~~
    ///xpxpxpxp
    //테스트야아아아ㅏasdsadasdadsdas
    //Gyungi로 올리기
    @Autowired //필요한 메소드 자동찾기
    private UserService service;

    @GetMapping("/login")
    public void login(Model model){
        model.addAttribute("title", "로그인");
    }

    //TODO - TEST!!
}
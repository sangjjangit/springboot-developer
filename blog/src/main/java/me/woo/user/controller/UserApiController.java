package me.woo.user.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import me.woo.user.dto.AddUserRequest;
import me.woo.user.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiController {
    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request){
        userService.save(request); // 회원가입 메서드 호출
        return "redirect:/login"; // 회원 가입이 완료된 이우에 로그인 페이지로 이동
    }

    public String logout(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler()
                .logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }
}

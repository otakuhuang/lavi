package top.otakuhuang.laviserver.controller;

import cn.dev33.satoken.stp.StpUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.otakuhuang.laviserver.dto.req.LoginReq;
import top.otakuhuang.laviserver.service.UserService;

/**
 * @author otakuhuang
 * @date 2023/11/27 下午11:17
 */
@RequestMapping
@RestController
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @PostMapping("/login")
    public String login(@Validated @RequestBody LoginReq req) {
        if (userService.verifyAccount(req.getUsername(), req.getPassword())) {
            StpUtil.login(10001);
            return "登录成功";
        }
        return "登录失败";
    }

    @GetMapping("logout")
    public String logout() {
        StpUtil.logout();
        return "退出成功";
    }
}

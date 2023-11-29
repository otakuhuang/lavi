package top.otakuhuang.laviserver.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * @author otakuhuang
 * @date 2023/11/27 下午11:21
 */
@Getter
@Setter
public class LoginReq {
    /**
     * 用户名
     */
    @NotBlank
    private String username;

    /**
     * 密码
     */
    @NotBlank
    private String password;
}

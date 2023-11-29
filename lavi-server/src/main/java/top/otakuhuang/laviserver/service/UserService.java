package top.otakuhuang.laviserver.service;

/**
 * @author otakuhuang
 * @date 2023/11/27 下午11:29
 */
public interface UserService {

    /**
     * 校验用户名和密码
     *
     * @param username 用户名
     * @param password 密码
     * @return 成功与否
     */
    Boolean verifyAccount(String username, String password);
}

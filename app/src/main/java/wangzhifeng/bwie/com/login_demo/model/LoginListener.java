package wangzhifeng.bwie.com.login_demo.model;

/**
 * Created by mechrevo on 2018/5/8.
 */

public interface LoginListener {
    void loginSuccess(String json);

    void loginError(String error);
}

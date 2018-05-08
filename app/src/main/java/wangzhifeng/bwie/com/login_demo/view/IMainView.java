package wangzhifeng.bwie.com.login_demo.view;

/**
 * Created by mechrevo on 2018/5/8.
 */

public interface IMainView {
    String getMobile();

    String getPassword();

    void loginSuccess();

    void loginError();
}

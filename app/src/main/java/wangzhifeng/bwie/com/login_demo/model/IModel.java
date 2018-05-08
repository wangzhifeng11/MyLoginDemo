package wangzhifeng.bwie.com.login_demo.model;

        import java.util.Map;

/**
 * Created by mechrevo on 2018/5/8.
 */

public interface IModel {
    //    登录
    void login(String url, Map<String, String> params, LoginListener loginListener);
    //    注册
    void reg(String url, Map<String, String> params, RegListener regListener);
}

package wangzhifeng.bwie.com.login_demo.presenter;

import java.util.HashMap;
import java.util.Map;

import wangzhifeng.bwie.com.login_demo.http.HttpConfig;
import wangzhifeng.bwie.com.login_demo.model.IModel;
import wangzhifeng.bwie.com.login_demo.model.LoginListener;
import wangzhifeng.bwie.com.login_demo.model.RegListener;
import wangzhifeng.bwie.com.login_demo.view.IMainView;
import wangzhifeng.bwie.com.login_demo.view.IRegView;

/**
 * Created by mechrevo on 2018/5/8.
 */

public class PersenterImpl implements IPresenter {
    private static final String TAG = "Presenter-----";
    //登录
    @Override
    public void loginPresenter(IModel iModel, final IMainView iMainView) {
        //调用m请求数据
        Map<String, String> map = new HashMap<>();
        map.put("mobile",iMainView.getMobile());
        map.put("password",iMainView.getPassword());
        iModel.login(HttpConfig.login_url, map, new LoginListener() {
            //根据回调结果，决定view的显示效果
            public void loginSuccess(String json) {
                iMainView.loginSuccess();
            }

            public void loginError(String error) {
                iMainView.loginError();
            }
        });

    }


    //注册
    @Override
    public void regPresenter(IModel iModel, final IRegView iRegView) {
        //调用m请求数据
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iRegView.getMobile());
        map.put("password", iRegView.getPassword());
        iModel.reg(HttpConfig.reg_url, map, new RegListener() {
            public void regSuccess(String json) {
                iRegView.regSuccess();
            }

            public void regError(String error) {
                iRegView.regError();
            }
        });
    }
}

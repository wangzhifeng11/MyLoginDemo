package wangzhifeng.bwie.com.login_demo.presenter;

import wangzhifeng.bwie.com.login_demo.model.IModel;
import wangzhifeng.bwie.com.login_demo.view.IMainView;
import wangzhifeng.bwie.com.login_demo.view.IRegView;

/**
 * Created by mechrevo on 2018/5/8.
 */

public interface IPresenter {
    //    登录
    void loginPresenter(IModel iModel, IMainView iMainView);

    //    注册
    void regPresenter(IModel iModel, IRegView iRegView);
}

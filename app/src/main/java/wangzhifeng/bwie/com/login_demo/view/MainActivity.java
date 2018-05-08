package wangzhifeng.bwie.com.login_demo.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import wangzhifeng.bwie.com.login_demo.R;
import wangzhifeng.bwie.com.login_demo.model.ModelImpl;
import wangzhifeng.bwie.com.login_demo.presenter.PersenterImpl;

public class MainActivity extends AppCompatActivity implements IMainView,View.OnClickListener{

    private EditText mobile;
    private EditText pwd;
    private Button login;
    private Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mobile = findViewById(R.id.mobile);
        pwd = findViewById(R.id.pwd);
        login = findViewById(R.id.login);
        reg = findViewById(R.id.reg);

        login.setOnClickListener(this);
        reg.setOnClickListener(this);
    }

    @Override
    public String getMobile() {
        return mobile.getText().toString();
    }

    @Override
    public String getPassword() {
        return pwd.getText().toString();
    }

    public void loginSuccess() {
        Toast.makeText(MainActivity.this, "成功---", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,RegActivity.class);
        startActivity(intent);
    }

    @Override
    public void loginError() {
        Toast.makeText(MainActivity.this, "失败---请注册", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                PersenterImpl presenter = new PersenterImpl();
                presenter.loginPresenter(new ModelImpl(),this);
                break;
            case R.id.reg:
                Intent intent = new Intent(MainActivity.this,RegActivity.class);
                startActivity(intent);
                break;
        }
    }
}

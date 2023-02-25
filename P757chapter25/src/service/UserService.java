package service;

public class UserService {
    public boolean login(String name,String password){
        /*
        * name 用户名
        * password 密码
        * return  true ，登录成功 false登录失败
        *
        * */
        if("admin".equals(name)&& "123".equals(password)){
            return true;

        }
        return false;
    }
    public void logout(){
        System.out.println("系统已经安全退出！");
    }
}

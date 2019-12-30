package miaoshaproject.service;

import miaoshaproject.error.BusinessException;
import miaoshaproject.service.model.UserModel;

public interface UserService {
    UserModel getUserById(Integer id);
    //通过缓存获取用户对象
    UserModel getUserByIdInCache(Integer id);
    void register(UserModel userModel) throws BusinessException;

    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}

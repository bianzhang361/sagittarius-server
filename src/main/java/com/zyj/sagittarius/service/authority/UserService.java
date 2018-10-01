package com.zyj.sagittarius.service.authority;

import com.zyj.sagittarius.dao.authority.UserDao;
import com.zyj.sagittarius.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    private void getErrors(Map<String, String> map, BindingResult result) {
        List<FieldError> list = result.getFieldErrors();
        for (FieldError error : list) {
            map.put(error.getField(), error.getDefaultMessage());
        }
    }

    public void validateForm(User user, BindingResult result, Map<String, String> errorsMap, boolean isUpdate) {
        if(result.hasErrors()) {
            getErrors(errorsMap, result);
        } else {
            if(isUpdate) {
                User oldUser = this.getUserById(user.getId());
                if(!user.getUserName().equals(oldUser.getUserName()) && this.getUserByUserName(user.getUserName())!=null)
                    errorsMap.put("username", "用户名重复，请重新输入。");
            } else {
                if(this.getUserByUserName(user.getUserName())!=null)
                    errorsMap.put("username", "用户名重复，请重新输入。");
            }
        }
    }

    //条件查询分页列表
    public List<User> listPagerByCondition(
            User etyCondition, Map<String, Object> params) {
        return userDao.listPagerByCondition(etyCondition, params);
    }

    //查询所有记录数
    public int countAll(User etyCondition) {
        return userDao.countAll(etyCondition);
    }

    //新增记录
    public boolean insertUser(User etyCondition) {
        return userDao.insertUser(etyCondition) > 0;
    }

    //更新记录
    public boolean updateUser(User etyCondition) {
        return userDao.updateUser(etyCondition) > 0;
    }

    //删除记录
    public boolean deleteUser(int id) {
        return userDao.deleteUser(id) > 0;
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

}

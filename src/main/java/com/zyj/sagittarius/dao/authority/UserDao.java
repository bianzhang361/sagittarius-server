package com.zyj.sagittarius.dao.authority;

import com.zyj.sagittarius.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDao {

    List<User> listPagerByCondition(@Param("ety") User etyCondition,
        @Param("pager") Map<String, Object> params);

    int countAll(@Param("ety") User etyCondition);

    int insertUser(User etyCondition);

    int updateUser(User etyCondition);

    int deleteUser(Integer id);

    User getUserById(Integer id);

    User getUserByUserName(String userName);

}

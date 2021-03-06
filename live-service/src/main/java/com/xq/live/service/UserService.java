package com.xq.live.service;

import com.xq.live.common.Pager;
import com.xq.live.model.User;
import com.xq.live.vo.in.UserInVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhangpeng32 on 2017/12/14.
 */
public interface UserService {
    public User getUserById(@Param("id") Long id);

    public Long add(User user);

    public User findByUsername(@Param("userName") String userName);

    public Pager<User> list(UserInVo inVo);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public Integer update(User user);

    public List<User> top(UserInVo inVo);

    /**
     * 根据入参查询用户信息
     * @param inVo
     * @return
     */
    public User findByUserNameAndPwd(UserInVo inVo);

    /**
     * 更新用户登录信息
     * @param user
     * @return
     */
    public Integer updateLoginInfo(User user);
}

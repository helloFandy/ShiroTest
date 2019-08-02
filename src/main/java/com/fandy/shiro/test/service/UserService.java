/**
 * 
 */
package com.fandy.shiro.test.service;

import java.util.List;
import java.util.Set;

import com.fandy.shiro.test.entity.User;
/**
 * @author Fandy	mz619308407@163.com:
 * @version 创建时间	2019年6月27日 下午7:21:46
 * 
 *
/**
 * @author meng.zhao1
 *
 */
public interface UserService {

	 /**
     * 创建用户
     * @param user
     */
    public User createUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long userId);

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    public void changePassword(Long userId, String newPassword);


    User findOne(Long userId);

    List<User> findAll();

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    public Set<String> findRoles(String username);

    /**
     * 根据用户名查找其权限
     * @param username
     * @return
     */
    public Set<String> findPermissions(String username);
}

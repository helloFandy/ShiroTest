/**
 * 
 */
package com.fandy.shiro.test.dao;

import java.util.List;

import com.fandy.shiro.test.entity.User;

/**
 * @author Fandy	mz619308407@163.com:
 * @version 创建时间	2019年6月27日 下午7:08:11
 * 
 *
/**
 * @author meng.zhao1
 *
 */
public interface UserDao {

	public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);
}

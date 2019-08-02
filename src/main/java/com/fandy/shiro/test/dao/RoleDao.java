/**
 * 
 */
package com.fandy.shiro.test.dao;

import java.util.List;

import com.fandy.shiro.test.entity.Role;

/**
 * @author Fandy	mz619308407@163.com:
 * @version 创建时间	2019年6月27日 下午7:07:07
 * 
 *
/**
 * @author meng.zhao1
 *
 */
public interface RoleDao {

	public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();
}

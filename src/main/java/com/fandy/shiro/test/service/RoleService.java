/**
 * 
 */
package com.fandy.shiro.test.service;

import java.util.List;
import java.util.Set;

import com.fandy.shiro.test.entity.Role;
/**
 * @author Fandy	mz619308407@163.com:
 * @version 创建时间	2019年6月27日 下午7:20:07
 * 
 *
/**
 * @author meng.zhao1
 *
 */
public interface RoleService {
	public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();

    /**
     * 根据角色编号得到角色标识符列表
     * @param roleIds
     * @return
     */
    Set<String> findRoles(Long... roleIds);

    /**
     * 根据角色编号得到权限字符串列表
     * @param roleIds
     * @return
     */
    Set<String> findPermissions(Long[] roleIds);
}

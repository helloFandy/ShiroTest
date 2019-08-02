/**
 * 
 */
package com.fandy.shiro.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fandy.shiro.test.dao.RoleDao;
import com.fandy.shiro.test.entity.Role;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Fandy	mz619308407@163.com:
 * @version 创建时间	2019年6月27日 下午7:20:57
 * 
 *
/**
 * @author meng.zhao1
 *
 */
@Service
public class RoleServiceImpl implements RoleService {

	 @Autowired
	    private RoleDao roleDao;
	    @Autowired
	    private ResourceService resourceService;

	    public Role createRole(Role role) {
	        return roleDao.createRole(role);
	    }

	    public Role updateRole(Role role) {
	        return roleDao.updateRole(role);
	    }

	    public void deleteRole(Long roleId) {
	        roleDao.deleteRole(roleId);
	    }

	    @Override
	    public Role findOne(Long roleId) {
	        return roleDao.findOne(roleId);
	    }

	    @Override
	    public List<Role> findAll() {
	        return roleDao.findAll();
	    }

	    @Override
	    public Set<String> findRoles(Long... roleIds) {
	        Set<String> roles = new HashSet<String>();
	        for(Long roleId : roleIds) {
	            Role role = findOne(roleId);
	            if(role != null) {
	                roles.add(role.getRole());
	            }
	        }
	        return roles;
	    }

	    @Override
	    public Set<String> findPermissions(Long[] roleIds) {
	        Set<Long> resourceIds = new HashSet<Long>();
	        for(Long roleId : roleIds) {
	            Role role = findOne(roleId);
	            if(role != null) {
	                resourceIds.addAll(role.getResourceIds());
	            }
	        }
	        return resourceService.findPermissions(resourceIds);
	    }

}

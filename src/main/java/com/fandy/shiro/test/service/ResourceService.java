/**
 * 
 */
package com.fandy.shiro.test.service;

import java.util.List;
import java.util.Set;

import com.fandy.shiro.test.entity.Resource;
/**
 * @author Fandy	mz619308407@163.com:
 * @version 创建时间	2019年6月27日 下午7:18:18
 * 
 *
/**
 * @author meng.zhao1
 *
 */
public interface ResourceService {

	public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();

    /**
     * 得到资源对应的权限字符串
     * @param resourceIds
     * @return
     */
    Set<String> findPermissions(Set<Long> resourceIds);

    /**
     * 根据用户权限得到菜单
     * @param permissions
     * @return
     */
    List<Resource> findMenus(Set<String> permissions);
}

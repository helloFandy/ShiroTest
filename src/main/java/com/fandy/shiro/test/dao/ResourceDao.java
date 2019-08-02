/**
 * 
 */
package com.fandy.shiro.test.dao;

import java.util.List;

import com.fandy.shiro.test.entity.Resource;

/**
 * @author Fandy	mz619308407@163.com:
 * @version 创建时间	2019年6月27日 下午7:05:49
 * 
 *
/**
 * @author meng.zhao1
 *
 */
public interface ResourceDao {

	public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();
}

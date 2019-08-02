/**
 * 
 */
package com.fandy.shiro.test.dao;

import java.util.List;

import com.fandy.shiro.test.entity.Organization;

/**
 * @author Fandy	mz619308407@163.com:
 * @version 创建时间	2019年6月27日 下午7:04:31
 * 
 *
/**
 * @author meng.zhao1
 *
 */
public interface OrganizationDao {

	public Organization createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}

package com.orange.dao.product;

import com.orange.bean.product.Brand;

import java.util.List;


/**
 * 品牌
 *
 */
public interface BrandDao {
	
	//List集合 Limit 0,5
	public List<Brand> getBrandListWithPage(Brand brand);
	
	
	//查询集合
	public List<Brand> getBrandList(Brand brandQuery);
	
	//查询总记录数
	public int getBrandCount(Brand brand);
	//添加品牌
	public void addBrand(Brand brand);
	
	//删除
	public void deleteBrandByKey(Integer id);
	//删除 批量
	public void deleteBrandByKeys(Integer[] ids);//List<Integer>  ids
	//修改
	public void updateBrandByKey(Brand brand);
	
	//
	public Brand getBrandByKey(Integer id);
}

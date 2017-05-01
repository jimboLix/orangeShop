package com.orange.dao;

import com.orange.bean.user.Buyer;

import java.util.List;


public interface BuyerDao {

	/**
	 * 添加
	 * @param buyer
	 */
	public Integer addBuyer(Buyer buyer);

	/**
	 * 根据主键查找
	 * @param
	 */
	public Buyer getBuyerByKey(String id);

	/**
	 * 根据主键批量查找
	 * @param
	 */
	public List<Buyer> getBuyersByKeys(List<String> idList);

	/**
	 * 根据主键删除
	 * @param
	 */
	public Integer deleteByKey(String id);

	/**
	 * 根据主键批量删除
	 * @param
	 */
	public Integer deleteByKeys(List<String> idList);

	/**
	 * 根据主键更新
	 * @param
	 */
	public Integer updateBuyerByKey(Buyer buyer);

	/**
	 * 分页查询
	 * @param buyerQuery
	 */
	public List<Buyer> getBuyerListWithPage(Buyer buyerQuery);

	/**
	 * 集合查询
	 * @param buyerQuery
	 */
	public List<Buyer> getBuyerList(Buyer buyerQuery);
	
	/**
	 * 总条数
	 * @param buyerQuery
	 */
	public int getBuyerListCount(Buyer buyerQuery);
}

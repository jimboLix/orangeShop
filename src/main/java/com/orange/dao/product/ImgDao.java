package com.orange.dao.product;

import com.orange.bean.product.Img;

import java.util.List;


public interface ImgDao {

	/**
	 * 添加
	 * @param img
	 */
	public Integer addImg(Img img);

	/**
	 * 根据主键查找
	 * @param imgQuery
	 */
	public Img getImgByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param imgQuery
	 */
	public List<Img> getImgsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param imgQuery
	 */
	public Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param imgQuery
	 */
	public Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param imgQuery
	 */
	public Integer updateImgByKey(Img img);

	/**
	 * 分页查询
	 * @param imgQuery
	 */
	public List<Img> getImgListWithPage(Img imgQuery);

	/**
	 * 集合查询
	 * @param imgQuery
	 */
	public List<Img> getImgList(Img imgQuery);
	
	/**
	 * 总条数
	 * @param imgQuery
	 */
	public int getImgListCount(Img imgQuery);
}

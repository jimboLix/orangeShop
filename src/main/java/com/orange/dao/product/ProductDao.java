package com.orange.dao.product;

import com.orange.bean.product.Product;
import com.orange.bean.vo.ProductVo;

import java.util.List;


public interface ProductDao {

	/**
	 * 添加
	 * @param product
	 */
	public Integer addProduct(Product product);

	/**
	 * 根据主键查找
	 * @param productQuery
	 */
	public Product getProductByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param productQuery
	 */
	public List<Product> getProductsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param productQuery
	 */
	public Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param productQuery
	 */
	public Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param productQuery
	 */
	public Integer updateProductByKey(Product product);

	/**
	 * 分页查询
	 * @param productVo 查询条件封装类
	 */
	public List<Product> getProductListWithPage(ProductVo productVo);

	/**
	 * 总条数
	 * @param productQuery
	 */
	public int getProductListCount(ProductVo productQuery);
}

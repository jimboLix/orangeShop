package com.orange.dao.product;

import com.orange.bean.product.Product;
import com.orange.bean.vo.ProductVo;

import java.util.List;


public interface ProductDao {

	/**
	 * 添加
	 * @param product
	 */
	Integer addProduct(Product product);

	/**
	 * 根据主键查找
	 * @param productQuery
	 */
	 Product getProductByKey(Integer id);

	/**
	 * 根据主键批量查找
	 * @param productQuery
	 */
	 List<Product> getProductsByKeys(List<Integer> idList);

	/**
	 * 根据主键删除
	 * @param productQuery
	 */
	 Integer deleteByKey(Integer id);

	/**
	 * 根据主键批量删除
	 * @param productQuery
	 */
	Integer deleteByKeys(List<Integer> idList);

	/**
	 * 根据主键更新
	 * @param productQuery
	 */
	 Integer updateProductByKey(Product product);

	/**
	 * 分页查询
	 * @param productVo 查询条件封装类
	 */
	List<Product> getProductListWithPage(ProductVo productVo);

	/**
	 * 总条数
	 * @param productQuery
	 */
	 int getProductListCount(ProductVo productQuery);

	/**
	 * 更新
	 * @param product
	 */
	void update(Product product);
}

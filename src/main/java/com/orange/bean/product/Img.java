package com.orange.bean.product;

import com.orange.util.Constants;

import java.io.Serializable;


/**
 * 图片
 * @author fengyan.li
 * @Date [2017-5-1 下午04:38:53]
 */
public class Img implements Serializable {
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer productId;
	private String url;
	private Integer isDef;
	
	//获取全Url
	public String getAllUrl(){
		return Constants.IMAGE_URL+url;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getIsDef() {
		return isDef;
	}
	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}
	public String toString() {
		return "Img [id=" + id + ",productId=" + productId + ",url=" + url + ",isDef=" + isDef + "]";
	}
}

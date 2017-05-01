package com.orange.bean.vo;

import com.orange.bean.product.Img;
import com.orange.bean.product.Product;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 商品扩展实体类，用于封装查询条件如：分页
 * @date 2017/4/30
 */
public class ProductVo extends Product {
    private static final long serialVersionUID = 1198954162697097196L;
    //页号
    private Integer pageNo = 1;
    //开始行
    private Integer startRow;
    //每页数
    private Integer pageSize = 5;

    private boolean nameLike;

    public boolean isNameLike() {
        return nameLike;
    }

    public void setNameLike(boolean nameLike) {
        this.nameLike = nameLike;
    }

    public Integer getPageNo() {
        return pageNo;
    }


    public void setPageSize(Integer pageSize) {
        //计算一次开始行
        this.startRow = (pageNo - 1) * pageSize;
        this.pageSize = pageSize;
    }

    public void setPageNo(Integer pageNo) {
        //计算一次开始行
        this.startRow = (pageNo - 1) * pageSize;
        this.pageNo = pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

}

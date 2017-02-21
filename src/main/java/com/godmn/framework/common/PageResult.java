package com.godmn.framework.common;


import java.io.Serializable;
import java.util.List;

/**
 * 使用方式：如PageResult<Coupon> pageResult=new PageResult<Coupon>(new ArrayList<Coupon>(), new PageBean(1));
 * 或：
 * PageResult<Coupon> pageResult=new PageResult<Coupon>();
     pageResult.setBeanList(new ArrayList<Coupon>());
     pageResult.setPageBean(new PageBean(1));
 *
 * Created by yejianzhong on 2016/5/9.
 */
public class PageResult<T> implements Serializable {

    public PageResult(){

    }

    public PageResult(List<T> beanList, PageBean pageBean) {
        this.beanList = beanList;
        this.pageBean = pageBean;
    }

    List<T> beanList;
    PageBean pageBean;

    public List<T> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<T> beanList) {
        this.beanList = beanList;
    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }

}

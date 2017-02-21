package com.godmn.framework.common;

import java.io.Serializable;

public class PageBean implements Serializable {

    private static final long serialVersionUID = 3911399534500835310L;

    public static final int FIRST_PAGE = 1;

    /**
     * 页面翻页样式：
     * PAGE_MODE_NORMAL：会显示多页导航，样式如：上一页 1，2，3，4，5 下一页，需要设置totalSize
     * PAGE_MODE_ONLY_NEXT_PREV：只显示“上一页，下一页”，不需要设置totalSzie，因此用这种翻页方式，不需要查询结果记录总数
     */
    public static final int PAGE_MODE_NORMAL = 0;

    public static final int PAGE_MODE_ONLY_NEXT_PREV = 1;

    //每页显示多少行
    int pageSize = 50;

    //当前页页码
    int pageNum = 1;

    //总记录数
    int totalSize;

    //总页数
    int totalPageCount;

    //是否最后一页
    boolean isLast;

    /**
     * 0: 普通翻页，有总数，有页数
     * 1: 只有上下面，没有总数和页数
     */
    int pageMode = 0;

    public PageBean(int pageNum) {

        super();
        setPageNum(pageNum);
    }

    public PageBean(int pageSize, int pageNum) {

        super();
        setPageNum(pageNum);
        setPageSize(pageSize);
    }

    public PageBean(int pageSize, int pageNum, int pageMode) {

        super();
        setPageNum(pageNum);
        setPageSize(pageSize);
        this.pageMode = pageMode;
    }

    public int getPageSize() {

        return pageSize;
    }

    private void setPageSize(int pageSize) {

        this.pageSize = pageSize;
    }

    public int getPageNum() {

        return pageNum;
    }

    public void setPageNum(int pageNum) {

        this.pageNum = pageNum;
        if (this.pageNum < FIRST_PAGE) {
            this.pageNum = FIRST_PAGE;
        }
    }

    public int getTotalSize() {

        return totalSize;
    }

    public void setTotalSize(int totalSize) {

        if (pageMode == PAGE_MODE_ONLY_NEXT_PREV) {
            throw new IllegalArgumentException("page mode is PAGE_MODE_ONLY_NEXT_PREV doesn't support setTotalSize!");
        }
        this.totalSize = totalSize;
        totalPageCount = this.totalSize / pageSize;
        if (totalPageCount < FIRST_PAGE) {
            totalPageCount = FIRST_PAGE;
        }

        if (this.totalSize % pageSize > 0 && this.totalSize > pageSize) {
            totalPageCount++;
        }
        if (1 == totalPageCount) {
            isLast = true;
        } else if (pageNum >= totalPageCount) {
            isLast = true;
        }
    }

    public int getTotalPageCount() {

        return totalPageCount;
    }

    public boolean isFirst() {

        return pageNum <= FIRST_PAGE;
    }

    public boolean isLast() {

        return isLast;
    }

    public int getPrevPage() {

        if (pageNum <= FIRST_PAGE) {
            return FIRST_PAGE;
        } else {
            return pageNum - 1;
        }
    }

    public int getNextPage() {

        if (pageMode == PAGE_MODE_NORMAL && pageNum >= totalPageCount) {
            return totalPageCount;
        } else {
            return pageNum + 1;
        }
    }

    public int getFirstPage() {

        return FIRST_PAGE;
    }

    public int getLastPage() {

        return totalPageCount;
    }

    public int getStart() {

        return (getPageNum() - 1) * getPageSize();
    }

    public int getPageMode() {

        return pageMode;
    }
}
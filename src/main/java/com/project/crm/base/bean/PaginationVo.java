package com.project.crm.base.bean;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.base.bean
 * @Description: 专门用于分页的bean对象
 * @Author chg
 * @CreateDate: 2020/11/18 9:09
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
public class PaginationVo<T> {

    private int page;//当前页码
    private long pageSize;//每页记录数
    private long total;//总记录数
    private long pages;//总页数

    private List<T> dataList;//每页的实际的数据
    private PageInfo<T> pageInfo;

    public PaginationVo(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
        page = pageInfo.getPageNum();
        pageSize = pageInfo.getPageSize();
        total = pageInfo.getTotal();
        pages = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
        dataList = pageInfo.getList();
    }


    @Override
    public String toString() {
        return "PaginationVo{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", pages=" + pages +
                ", dataList=" + dataList +
                ", pageInfo=" + pageInfo +
                '}';
    }

    public int getPage() {

        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public PageInfo<T> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }
}

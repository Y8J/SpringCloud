package com.cloud.kj.master.api.pojo;

import java.util.List;

/**
 * 通用分页泛型继承类
 * @author yangjing
 *
 * @param <T>
 */
public class PojoPages<T> {
	private int page; // 当前页数
	private int limit; // 每页显示的记录数
    private int totalCount; // 总记录数
    private int totalPage; // 总页数
    private List<T> list; // 每页显示数据记录的集合；
    private T bean; //但实体bean
    
    public PojoPages(int page, int totalCount, int totalPage, int limit, List<T> list) {
        super();
        this.page = page;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.limit = limit;
        this.list = list;
    }

    public PojoPages() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

	public T getBean() {
		return bean;
	}

	public void setBean(T bean) {
		this.bean = bean;
	}
    
    
}

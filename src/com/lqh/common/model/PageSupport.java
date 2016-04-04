package com.lqh.common.model;


public class PageSupport {

	private int currentPage = 1;
	
	private int pageSize = 10;
	
	private int totalCounts = 0;
	
	private int totalPages = 1;
	
	public PageSupport(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public PageSupport(int currentPage, int pageSize) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}	
	
	public PageSupport() {
		super();
	}

	public int getCurrentPage() {
		return currentPage;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public int getAllPages() {
		if(totalCounts == 0) return 1;
		if ((totalCounts % pageSize) == 0) {
			return totalCounts / pageSize;
		} else {
			return totalCounts / pageSize + 1;
		}
	}

	public int getStartPosition() {
		return (currentPage - 1) * pageSize;
	}

	public int getTotalCounts() {
		return totalCounts;
	}

	public void setTotalCounts(int totalCounts) {
		this.totalCounts = totalCounts;
		
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}

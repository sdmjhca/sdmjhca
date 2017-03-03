package com.minxinloan.common.bean;

import javax.servlet.http.HttpServletResponse;

public class BaseQueryBean implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 526380172517410678L;
	private String act;
	private String busiId;
	private Integer currentPageNo;
	private Integer pageSize;
	private String reportTemplateName;
	private String reportFileName;

	}

	public void setAct(String act) {
		this.act = act;
	}

	/**
	 * @return the q_order
	 */
	public String getQ_order() {
		return q_order;
	}

	/**
	 * @param q_order the q_order to set
	 */
	public void setQ_order(String q_order) {
		this.q_order = q_order;
	}


	public String getBusiId() {
		return busiId;
	}

	public void setBusiId(String busiId) {
		this.busiId = busiId;
	}

	public Integer getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(Integer currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getQ_modOperateId() {
		return q_modOperateId;
	}

	public void setQ_modOperateId(String q_modOperateId) {
		this.q_modOperateId = q_modOperateId;
asdjioasdjiol ajsdiasdoipjkpasd
	}

	public String getReportTemplateName() {
		return reportTemplateName;
	}

	public void setReportTemplateName(String reportTemplateName) {
		this.reportTemplateName = reportTemplateName;
	}

	public String getReportFileName() {
		return reportFileName;
	}

	public void setReportFileName(String reportFileName) {
		this.reportFileName = reportFileName;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	

}

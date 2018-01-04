package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:00
 */
public class Contract  {
	
	//合同表
	private Integer id;
	//甲公司ID
	private Integer Company_JId;
	//乙公司ID
	private Integer Company_YId;
	//合同图片
	private String img;
	//起始时间
	private Date startDate;
	//结束时间
	private Date endDate;
	//是否到期0未到期，1已到期
	private Integer deadlLine;
	//合同类型0厂商与楼盘 1安装与楼盘 2楼盘与物业 3物业与维保
	private Integer contractType;
	//创建人
	private String creater;
	//创建时间
	private Date createDate;
	//修改人
	private String updater;
	//修改时间
	private Date updatDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompany_JId() {
		return Company_JId;
	}
	public void setCompany_JId(Integer company_JId) {
		Company_JId = company_JId;
	}
	public Integer getCompany_YId() {
		return Company_YId;
	}
	public void setCompany_YId(Integer company_YId) {
		Company_YId = company_YId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getDeadlLine() {
		return deadlLine;
	}
	public void setDeadlLine(Integer deadlLine) {
		this.deadlLine = deadlLine;
	}
	public Integer getContractType() {
		return contractType;
	}
	public void setContractType(Integer contractType) {
		this.contractType = contractType;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public Date getUpdatDate() {
		return updatDate;
	}
	public void setUpdatDate(Date updatDate) {
		this.updatDate = updatDate;
	}

	
}

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
	private Integer companyJid;
	//乙公司ID
	private Integer companyYid;
	//合同图片
	private String img;
	//起始时间
	private Date startdate;
	//结束时间
	private Date enddate;
	//是否到期0未到期，1已到期
	private Integer deadline;
	//合同类型0厂商与楼盘 1安装与楼盘 2楼盘与物业 3物业与维保
	private Integer contracttype;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;

	/**
	 * 设置：合同表
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：合同表
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：甲公司ID
	 */
	public void setCompanyJid(Integer companyJid) {
		this.companyJid = companyJid;
	}
	/**
	 * 获取：甲公司ID
	 */
	public Integer getCompanyJid() {
		return companyJid;
	}
	/**
	 * 设置：乙公司ID
	 */
	public void setCompanyYid(Integer companyYid) {
		this.companyYid = companyYid;
	}
	/**
	 * 获取：乙公司ID
	 */
	public Integer getCompanyYid() {
		return companyYid;
	}
	/**
	 * 设置：合同图片
	 */
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * 获取：合同图片
	 */
	public String getImg() {
		return img;
	}
	/**
	 * 设置：起始时间
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	/**
	 * 获取：起始时间
	 */
	public Date getStartdate() {
		return startdate;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getEnddate() {
		return enddate;
	}
	/**
	 * 设置：是否到期0未到期，1已到期
	 */
	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}
	/**
	 * 获取：是否到期0未到期，1已到期
	 */
	public Integer getDeadline() {
		return deadline;
	}
	/**
	 * 设置：合同类型0厂商与楼盘 1安装与楼盘 2楼盘与物业 3物业与维保
	 */
	public void setContracttype(Integer contracttype) {
		this.contracttype = contracttype;
	}
	/**
	 * 获取：合同类型0厂商与楼盘 1安装与楼盘 2楼盘与物业 3物业与维保
	 */
	public Integer getContracttype() {
		return contracttype;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreater(String creater) {
		this.creater = creater;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreater() {
		return creater;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatedate() {
		return createdate;
	}
	/**
	 * 设置：修改人
	 */
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	/**
	 * 获取：修改人
	 */
	public String getUpdater() {
		return updater;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdatdate(Date updatdate) {
		this.updatdate = updatdate;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdatdate() {
		return updatdate;
	}
}

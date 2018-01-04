package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:00
 */
public class Approval {
	
	//审批表
	private Integer id;
	//公司id
	private Integer companyid;
	//被审批公司角色
	private Integer role;
	//审批状态
	private Integer approvalstuts;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;

	/**
	 * 设置：审批表
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：审批表
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：公司id
	 */
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	/**
	 * 获取：公司id
	 */
	public Integer getCompanyid() {
		return companyid;
	}
	/**
	 * 设置：被审批公司角色
	 */
	public void setRole(Integer role) {
		this.role = role;
	}
	/**
	 * 获取：被审批公司角色
	 */
	public Integer getRole() {
		return role;
	}
	/**
	 * 设置：审批状态
	 */
	public void setApprovalstuts(Integer approvalstuts) {
		this.approvalstuts = approvalstuts;
	}
	/**
	 * 获取：审批状态
	 */
	public Integer getApprovalstuts() {
		return approvalstuts;
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

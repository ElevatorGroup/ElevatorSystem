package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:00
 */
public class Maintenanceproject {
	
	//电梯维保项目表
	private Integer id;
	//维保项目
	private String maintenanceproject;
	//维保基本要求
	private String maintenancerequirements;
	//维保类型0半月维保1季度维保2半年维保3年维保
	private Integer maintenancetypes;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;

	/**
	 * 设置：电梯维保项目表
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：电梯维保项目表
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：维保项目
	 */
	public void setMaintenanceproject(String maintenanceproject) {
		this.maintenanceproject = maintenanceproject;
	}
	/**
	 * 获取：维保项目
	 */
	public String getMaintenanceproject() {
		return maintenanceproject;
	}
	/**
	 * 设置：维保基本要求
	 */
	public void setMaintenancerequirements(String maintenancerequirements) {
		this.maintenancerequirements = maintenancerequirements;
	}
	/**
	 * 获取：维保基本要求
	 */
	public String getMaintenancerequirements() {
		return maintenancerequirements;
	}
	/**
	 * 设置：维保类型0半月维保1季度维保2半年维保3年维保
	 */
	public void setMaintenancetypes(Integer maintenancetypes) {
		this.maintenancetypes = maintenancetypes;
	}
	/**
	 * 获取：维保类型0半月维保1季度维保2半年维保3年维保
	 */
	public Integer getMaintenancetypes() {
		return maintenancetypes;
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

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
	private String maintenanceProject;
	//维保基本要求
	private String maintenanceRequirements;
	//维保类型0半月维保1季度维保2半年维保3年维保
	private Integer maintenanceTypes;
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
	public String getMaintenanceProject() {
		return maintenanceProject;
	}
	public void setMaintenanceProject(String maintenanceProject) {
		this.maintenanceProject = maintenanceProject;
	}
	public String getMaintenanceRequirements() {
		return maintenanceRequirements;
	}
	public void setMaintenanceRequirements(String maintenanceRequirements) {
		this.maintenanceRequirements = maintenanceRequirements;
	}
	public Integer getMaintenanceTypes() {
		return maintenanceTypes;
	}
	public void setMaintenanceTypes(Integer maintenanceTypes) {
		this.maintenanceTypes = maintenanceTypes;
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

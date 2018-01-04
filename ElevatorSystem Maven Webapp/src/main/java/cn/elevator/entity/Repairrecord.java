package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:00
 */
public class Repairrecord {
	
	//电梯维修记录表电梯急救情况
	private Integer id;
	//电梯ID
	private Integer elevatorID;
	//电梯发生急救信号时间
	private Date problemTime;
	//维修时间
	private Date maintenanceDate;
	//关联到维修人员ID
	private Integer userId;
	//故障原因
	private String problem;
	//维修时长
	private Integer maintenanceTime;
	//完成时间NFC打卡
	private Date maintenanceClockinNFC;
	//维修类型0.困人 1非困人
	private Integer maintenanceType;
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
	public Integer getElevatorID() {
		return elevatorID;
	}
	public void setElevatorID(Integer elevatorID) {
		this.elevatorID = elevatorID;
	}
	public Date getProblemTime() {
		return problemTime;
	}
	public void setProblemTime(Date problemTime) {
		this.problemTime = problemTime;
	}
	public Date getMaintenanceDate() {
		return maintenanceDate;
	}
	public void setMaintenanceDate(Date maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public Integer getMaintenanceTime() {
		return maintenanceTime;
	}
	public void setMaintenanceTime(Integer maintenanceTime) {
		this.maintenanceTime = maintenanceTime;
	}
	public Date getMaintenanceClockinNFC() {
		return maintenanceClockinNFC;
	}
	public void setMaintenanceClockinNFC(Date maintenanceClockinNFC) {
		this.maintenanceClockinNFC = maintenanceClockinNFC;
	}
	public Integer getMaintenanceType() {
		return maintenanceType;
	}
	public void setMaintenanceType(Integer maintenanceType) {
		this.maintenanceType = maintenanceType;
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

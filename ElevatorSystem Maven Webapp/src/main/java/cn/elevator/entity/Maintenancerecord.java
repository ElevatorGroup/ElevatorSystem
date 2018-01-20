package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:00
 */
public class Maintenancerecord {
	
	//保养记录表普通维保情况
	private Integer id;
	//电梯编码
	private String elevatorNumber;
	//保养时间
	private Date maintenanceTime;
	//保养状态0.待保养，1已保养，2.保养过期
	private Integer state;
	//维保材料
	private String maintenanceMaterial;
	//备注
	private String reason;
	//物业签字照片
	private String imgrealty;
	//NFC开始时间
	private Date startNFC;
	//NFC结束时间
	private String endNFC;
	//保养人员ID(可以有多个人)
	private String userId;
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
	public String getElevatorNumber() {
		return elevatorNumber;
	}
	public void setElevatorNumber(String elevatorNumber) {
		this.elevatorNumber = elevatorNumber;
	}
	public Date getMaintenanceTime() {
		return maintenanceTime;
	}
	public void setMaintenanceTime(Date maintenanceTime) {
		this.maintenanceTime = maintenanceTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMaintenanceMaterial() {
		return maintenanceMaterial;
	}
	public void setMaintenanceMaterial(String maintenanceMaterial) {
		this.maintenanceMaterial = maintenanceMaterial;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getImgrealty() {
		return imgrealty;
	}
	public void setImgrealty(String imgrealty) {
		this.imgrealty = imgrealty;
	}
	public Date getStartNFC() {
		return startNFC;
	}
	public void setStartNFC(Date startNFC) {
		this.startNFC = startNFC;
	}
	public String getEndNFC() {
		return endNFC;
	}
	public void setEndNFC(String endNFC) {
		this.endNFC = endNFC;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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

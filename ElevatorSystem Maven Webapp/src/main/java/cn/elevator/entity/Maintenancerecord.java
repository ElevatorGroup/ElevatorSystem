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
	
	//电梯维修记录表电梯急救情况
	private Integer id;
	//电梯ID
	private Integer elevatorid;
	//电梯发生急救信号时间
	private Date problemtime;
	//维修时间
	private Date maintenancedate1;
	//关联到维修人员ID
	private Integer userid;
	//故障原因
	private String problem;
	//维修时长
	private Integer maintenancetime;
	//完成时间NFC打卡
	private Date maintenancedate2;
	//维修类型0.困人 1非困人
	private Integer maintenancetype;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;

	/**
	 * 设置：电梯维修记录表电梯急救情况
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：电梯维修记录表电梯急救情况
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：电梯ID
	 */
	public void setElevatorid(Integer elevatorid) {
		this.elevatorid = elevatorid;
	}
	/**
	 * 获取：电梯ID
	 */
	public Integer getElevatorid() {
		return elevatorid;
	}
	/**
	 * 设置：电梯发生急救信号时间
	 */
	public void setProblemtime(Date problemtime) {
		this.problemtime = problemtime;
	}
	/**
	 * 获取：电梯发生急救信号时间
	 */
	public Date getProblemtime() {
		return problemtime;
	}
	/**
	 * 设置：维修时间
	 */
	public void setMaintenancedate1(Date maintenancedate1) {
		this.maintenancedate1 = maintenancedate1;
	}
	/**
	 * 获取：维修时间
	 */
	public Date getMaintenancedate1() {
		return maintenancedate1;
	}
	/**
	 * 设置：关联到维修人员ID
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	/**
	 * 获取：关联到维修人员ID
	 */
	public Integer getUserid() {
		return userid;
	}
	/**
	 * 设置：故障原因
	 */
	public void setProblem(String problem) {
		this.problem = problem;
	}
	/**
	 * 获取：故障原因
	 */
	public String getProblem() {
		return problem;
	}
	/**
	 * 设置：维修时长
	 */
	public void setMaintenancetime(Integer maintenancetime) {
		this.maintenancetime = maintenancetime;
	}
	/**
	 * 获取：维修时长
	 */
	public Integer getMaintenancetime() {
		return maintenancetime;
	}
	/**
	 * 设置：完成时间NFC打卡
	 */
	public void setMaintenancedate2(Date maintenancedate2) {
		this.maintenancedate2 = maintenancedate2;
	}
	/**
	 * 获取：完成时间NFC打卡
	 */
	public Date getMaintenancedate2() {
		return maintenancedate2;
	}
	/**
	 * 设置：维修类型0.困人 1非困人
	 */
	public void setMaintenancetype(Integer maintenancetype) {
		this.maintenancetype = maintenancetype;
	}
	/**
	 * 获取：维修类型0.困人 1非困人
	 */
	public Integer getMaintenancetype() {
		return maintenancetype;
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

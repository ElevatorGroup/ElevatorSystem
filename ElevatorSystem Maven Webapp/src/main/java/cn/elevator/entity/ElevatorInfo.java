package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author zhaojing
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:00 测试
 */
public class ElevatorInfo  {
	//电梯信息表
	private Integer id;
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	//关联到楼盘
	private Integer buildingId;
	
	
	
	//连表查询，新添字段楼盘名称
	private String buildingName;
	//电梯型号
	private String elevatorModel;
	//电梯唯一编号
	private String elevatorNumber;
	//内部编码
	private String internalNumber;
	//电梯类型
	private Integer elevatorType;
	//使用状态
	private Integer usingState;
	//首次维保日期
	private Date firstMaintenance;
	//关联到维保公司ID
	private Integer maintenanceId;
	//关联到维保人员ID如果新楼盘没有维保人员，那么值为空。
	private String maintenancePersonId;
	//设备识别码
	private String elevatorCode;
	//注册代码
	private String registrationCode;
	//出厂编号
	private String factoryNumber;
	//使用证号
	private String usingNumber;
	//注册状态0已注册1未注册
	private Integer registrationStatus;
	//投用日期
	private Date proactivelyDate;
	//创建人
	private String creater;
	//创建时间
	private Date createDate;
	//修改人
	private String updater;
	//修改时间
	private Date updatDate;
	//维保项目id
	private String projectId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
	public String getElevatorModel() {
		return elevatorModel;
	}
	public void setElevatorModel(String elevatorModel) {
		this.elevatorModel = elevatorModel;
	}
	public String getElevatorNumber() {
		return elevatorNumber;
	}
	public void setElevatorNumber(String elevatorNumber) {
		this.elevatorNumber = elevatorNumber;
	}
	public String getInternalNumber() {
		return internalNumber;
	}
	public void setInternalNumber(String internalNumber) {
		this.internalNumber = internalNumber;
	}
	public Integer getElevatorType() {
		return elevatorType;
	}
	public void setElevatorType(Integer elevatorType) {
		this.elevatorType = elevatorType;
	}
	public Integer getUsingState() {
		return usingState;
	}
	public void setUsingState(Integer usingState) {
		this.usingState = usingState;
	}
	public Date getFirstMaintenance() {
		return firstMaintenance;
	}
	public void setFirstMaintenance(Date firstMaintenance) {
		this.firstMaintenance = firstMaintenance;
	}
	public Integer getMaintenanceId() {
		return maintenanceId;
	}
	public void setMaintenanceId(Integer maintenanceId) {
		this.maintenanceId = maintenanceId;
	}
	public String getMaintenancePersonId() {
		return maintenancePersonId;
	}
	public void setMaintenancePersonId(String maintenancePersonId) {
		this.maintenancePersonId = maintenancePersonId;
	}
	public String getElevatorCode() {
		return elevatorCode;
	}
	public void setElevatorCode(String elevatorCode) {
		this.elevatorCode = elevatorCode;
	}
	public String getRegistrationCode() {
		return registrationCode;
	}
	public void setRegistrationCode(String registrationCode) {
		this.registrationCode = registrationCode;
	}
	public String getFactoryNumber() {
		return factoryNumber;
	}
	public void setFactoryNumber(String factoryNumber) {
		this.factoryNumber = factoryNumber;
	}
	public String getUsingNumber() {
		return usingNumber;
	}
	public void setUsingNumber(String usingNumber) {
		this.usingNumber = usingNumber;
	}
	public Integer getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(Integer registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
	public Date getProactivelyDate() {
		return proactivelyDate;
	}
	public void setProactivelyDate(Date proactivelyDate) {
		this.proactivelyDate = proactivelyDate;
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
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	
}

package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:00
 */
public class Elevatorinfo  {
	
	//电梯信息表
	private Integer id;
	//关联到楼盘
	private Integer buildingid;
	//电梯型号
	private String elevatormodel;
	//电梯唯一编号
	private String elevatornumber;
	//内部编码
	private String internalnumber;
	//电梯类型
	private Integer elevatortype;
	//使用状态
	private Integer usingstate;
	//首次维保日期
	private Date firstmaintenance;
	//关联到维保公司ID
	private Integer maintenanceid;
	//关联到维保人员ID如果新楼盘没有维保人员，那么值为空。
	private String maintenancepersonid;
	//设备识别码
	private String elevatorcode;
	//注册代码
	private String registrationcode;
	//出厂编号
	private String factorynumber;
	//使用证号
	private String usingnumber;
	//注册状态0已注册1未注册
	private Integer registrationstatus;
	//投用日期
	private Date proactivelydate;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;
	//维保项目id
	private String projectid;

	/**
	 * 设置：电梯信息表
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：电梯信息表
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：关联到楼盘
	 */
	public void setBuildingid(Integer buildingid) {
		this.buildingid = buildingid;
	}
	/**
	 * 获取：关联到楼盘
	 */
	public Integer getBuildingid() {
		return buildingid;
	}
	/**
	 * 设置：电梯型号
	 */
	public void setElevatormodel(String elevatormodel) {
		this.elevatormodel = elevatormodel;
	}
	/**
	 * 获取：电梯型号
	 */
	public String getElevatormodel() {
		return elevatormodel;
	}
	/**
	 * 设置：电梯唯一编号
	 */
	public void setElevatornumber(String elevatornumber) {
		this.elevatornumber = elevatornumber;
	}
	/**
	 * 获取：电梯唯一编号
	 */
	public String getElevatornumber() {
		return elevatornumber;
	}
	/**
	 * 设置：内部编码
	 */
	public void setInternalnumber(String internalnumber) {
		this.internalnumber = internalnumber;
	}
	/**
	 * 获取：内部编码
	 */
	public String getInternalnumber() {
		return internalnumber;
	}
	/**
	 * 设置：电梯类型
	 */
	public void setElevatortype(Integer elevatortype) {
		this.elevatortype = elevatortype;
	}
	/**
	 * 获取：电梯类型
	 */
	public Integer getElevatortype() {
		return elevatortype;
	}
	/**
	 * 设置：使用状态
	 */
	public void setUsingstate(Integer usingstate) {
		this.usingstate = usingstate;
	}
	/**
	 * 获取：使用状态
	 */
	public Integer getUsingstate() {
		return usingstate;
	}
	/**
	 * 设置：首次维保日期
	 */
	public void setFirstmaintenance(Date firstmaintenance) {
		this.firstmaintenance = firstmaintenance;
	}
	/**
	 * 获取：首次维保日期
	 */
	public Date getFirstmaintenance() {
		return firstmaintenance;
	}
	/**
	 * 设置：关联到维保公司ID
	 */
	public void setMaintenanceid(Integer maintenanceid) {
		this.maintenanceid = maintenanceid;
	}
	/**
	 * 获取：关联到维保公司ID
	 */
	public Integer getMaintenanceid() {
		return maintenanceid;
	}
	/**
	 * 设置：关联到维保人员ID如果新楼盘没有维保人员，那么值为空。
	 */
	public void setMaintenancepersonid(String maintenancepersonid) {
		this.maintenancepersonid = maintenancepersonid;
	}
	/**
	 * 获取：关联到维保人员ID如果新楼盘没有维保人员，那么值为空。
	 */
	public String getMaintenancepersonid() {
		return maintenancepersonid;
	}
	/**
	 * 设置：设备识别码
	 */
	public void setElevatorcode(String elevatorcode) {
		this.elevatorcode = elevatorcode;
	}
	/**
	 * 获取：设备识别码
	 */
	public String getElevatorcode() {
		return elevatorcode;
	}
	/**
	 * 设置：注册代码
	 */
	public void setRegistrationcode(String registrationcode) {
		this.registrationcode = registrationcode;
	}
	/**
	 * 获取：注册代码
	 */
	public String getRegistrationcode() {
		return registrationcode;
	}
	/**
	 * 设置：出厂编号
	 */
	public void setFactorynumber(String factorynumber) {
		this.factorynumber = factorynumber;
	}
	/**
	 * 获取：出厂编号
	 */
	public String getFactorynumber() {
		return factorynumber;
	}
	/**
	 * 设置：使用证号
	 */
	public void setUsingnumber(String usingnumber) {
		this.usingnumber = usingnumber;
	}
	/**
	 * 获取：使用证号
	 */
	public String getUsingnumber() {
		return usingnumber;
	}
	/**
	 * 设置：注册状态0已注册1未注册
	 */
	public void setRegistrationstatus(Integer registrationstatus) {
		this.registrationstatus = registrationstatus;
	}
	/**
	 * 获取：注册状态0已注册1未注册
	 */
	public Integer getRegistrationstatus() {
		return registrationstatus;
	}
	/**
	 * 设置：投用日期
	 */
	public void setProactivelydate(Date proactivelydate) {
		this.proactivelydate = proactivelydate;
	}
	/**
	 * 获取：投用日期
	 */
	public Date getProactivelydate() {
		return proactivelydate;
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
	/**
	 * 设置：维保项目id
	 */
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	/**
	 * 获取：维保项目id
	 */
	public String getProjectid() {
		return projectid;
	}
}

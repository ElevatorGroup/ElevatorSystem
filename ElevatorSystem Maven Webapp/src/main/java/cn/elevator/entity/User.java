package cn.elevator.entity;

import java.util.Date;
import java.util.List;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:31:49
 */
public class User  {
	
	//用户表
	private Integer id;
	//用户角色0.质检公司1.楼盘2.物业管理员3.物业人员4.维保公司5维保人员
	private Integer userRole;
	//公司id关联公司id(如果为空就为质检局)
	private Integer companyId;
	//销户1.代表销户，但数据还在，只是不能登录
	private Integer deleted;
	//真实姓名
	private String realName;
	//手机号（也作为用户账号）
	private String tel;
	//用户名
	private String userName;
	//微信号
	private String wenXin;
	//加密盐值
	private String salt;
	//用户密码
	private String password;
	//楼盘id只有楼盘id不为空时为物业普通员工
	private Integer buildingId;
	//维保人员工号只有维保人员工号不为空时为维保普通员工
	private Integer realtyId;
	//创建人
	private String creater;
	//创建时间
	private Date createDate;
	//修改人
	private String updater;
	//修改时间
	private Date updatDate;
	private String userRoleName;
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	private List<ElevatorInfo> elevatorList;
	
	public List<ElevatorInfo> getElevatorList() {
		return elevatorList;
	}
	public void setElevatorList(List<ElevatorInfo> elevatorList) {
		this.elevatorList = elevatorList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserRole() {
		return userRole;
	}
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getWenXin() {
		return wenXin;
	}
	public void setWenXin(String wenXin) {
		this.wenXin = wenXin;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
	public Integer getRealtyId() {
		return realtyId;
	}
	public void setRealtyId(Integer realtyId) {
		this.realtyId = realtyId;
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

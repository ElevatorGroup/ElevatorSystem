package cn.elevator.entity;

import java.util.ArrayList;
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
	//用户密码
	private String password;
	//物业普通员工对应楼盘id,其他用户都为空
	private Integer buildingID;
	//维保普通员工对应修理的电梯id,其他用户都为空
	private String elevatorID;
	//创建人
	private String creater;
	//创建时间
	private Date createDate;
	//修改人
	private String updater;
	//修改时间
	private Date updatDate;
	
	
	
	   
	//新添加的字段，外表链接
	//用户角色名称
	private String userRoleName;
	//电梯集合
	private List<ElevatorInfo> elevatorList=new ArrayList<ElevatorInfo>();
	public List<ElevatorInfo> getElevatorList() {
		return elevatorList;
	}
	public void setElevatorList(List<ElevatorInfo> elevatorList) {
		this.elevatorList = elevatorList;
	}
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getBuildingID() {
		return buildingID;
	}
	public void setBuildingID(Integer buildingID) {
		this.buildingID = buildingID;
	}
	public String getElevatorID() {
		return elevatorID;
	}
	public void setElevatorID(String elevatorID) {
		this.elevatorID = elevatorID;
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

package cn.elevator.entity;

import java.util.Date;



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
	//用户角色0.质检公司1.楼盘2.物业管理员3.维保4维保人员
	private Integer role;
	//公司id关联公司id(如果为空就为质检局)
	private Integer companyid;
	//销户1.代表销户，但数据还在，只是不能登录
	private Integer deleted;
	//真实姓名
	private String name;
	//手机号（也作为用户账号）
	private String tel;
	//用户名
	private String userName;
	//微信号
	private String wenxin;
	//用户密码
	private String password;
	//楼盘id只有楼盘id不为空时为物业普通员工
	private Integer buildingid;
	//维保人员工号只有维保人员工号不为空时为维保普通员工
	private Integer guarantor;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;

	/**
	 * 设置：用户表
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：用户表
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：用户角色0.质检公司1.楼盘2.物业管理员3.维保4维保人员
	 */
	public void setRole(Integer role) {
		this.role = role;
	}
	/**
	 * 获取：用户角色0.质检公司1.楼盘2.物业管理员3.维保4维保人员
	 */
	public Integer getRole() {
		return role;
	}
	/**
	 * 设置：公司id关联公司id(如果为空就为质检局)
	 */
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	/**
	 * 获取：公司id关联公司id(如果为空就为质检局)
	 */
	public Integer getCompanyid() {
		return companyid;
	}
	/**
	 * 设置：销户1.代表销户，但数据还在，只是不能登录
	 */
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	/**
	 * 获取：销户1.代表销户，但数据还在，只是不能登录
	 */
	public Integer getDeleted() {
		return deleted;
	}
	/**
	 * 设置：真实姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：真实姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：手机号（也作为用户账号）
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * 获取：手机号（也作为用户账号）
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 设置：用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：微信号
	 */
	public void setWenxin(String wenxin) {
		this.wenxin = wenxin;
	}
	/**
	 * 获取：微信号
	 */
	public String getWenxin() {
		return wenxin;
	}
	/**
	 * 设置：用户密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：用户密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：楼盘id只有楼盘id不为空时为物业普通员工
	 */
	public void setBuildingid(Integer buildingid) {
		this.buildingid = buildingid;
	}
	/**
	 * 获取：楼盘id只有楼盘id不为空时为物业普通员工
	 */
	public Integer getBuildingid() {
		return buildingid;
	}
	/**
	 * 设置：维保人员工号只有维保人员工号不为空时为维保普通员工
	 */
	public void setGuarantor(Integer guarantor) {
		this.guarantor = guarantor;
	}
	/**
	 * 获取：维保人员工号只有维保人员工号不为空时为维保普通员工
	 */
	public Integer getGuarantor() {
		return guarantor;
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

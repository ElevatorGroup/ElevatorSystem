package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:12
 */
public class Newsrecord  {
	
	//消息记录表
	private Integer id;
	//消息id
	private Integer newsid;
	//用户id
	private Integer userid;
	//消息状态0已读1未读
	private Integer newsstate;
	//是否删除0删除1显示
	private Integer del;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;

	/**
	 * 设置：消息记录表
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：消息记录表
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：消息id
	 */
	public void setNewsid(Integer newsid) {
		this.newsid = newsid;
	}
	/**
	 * 获取：消息id
	 */
	public Integer getNewsid() {
		return newsid;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Integer getUserid() {
		return userid;
	}
	/**
	 * 设置：消息状态0已读1未读
	 */
	public void setNewsstate(Integer newsstate) {
		this.newsstate = newsstate;
	}
	/**
	 * 获取：消息状态0已读1未读
	 */
	public Integer getNewsstate() {
		return newsstate;
	}
	/**
	 * 设置：是否删除0删除1显示
	 */
	public void setDel(Integer del) {
		this.del = del;
	}
	/**
	 * 获取：是否删除0删除1显示
	 */
	public Integer getDel() {
		return del;
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

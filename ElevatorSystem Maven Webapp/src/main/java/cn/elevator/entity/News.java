package cn.elevator.entity;

import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-22 16:33:00
 */
public class News  {
	
	//消息表
	private Integer id;
	//消息类型0维保提醒 1合同快到期提醒 2注册审核提醒
	private Integer newstype;
	//消息内容
	private String newscontent;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;

	/**
	 * 设置：消息表
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：消息表
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：消息类型0维保提醒 1合同快到期提醒 2注册审核提醒
	 */
	public void setNewstype(Integer newstype) {
		this.newstype = newstype;
	}
	/**
	 * 获取：消息类型0维保提醒 1合同快到期提醒 2注册审核提醒
	 */
	public Integer getNewstype() {
		return newstype;
	}
	/**
	 * 设置：消息内容
	 */
	public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	}
	/**
	 * 获取：消息内容
	 */
	public String getNewscontent() {
		return newscontent;
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

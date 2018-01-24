package cn.elevator.entity;

import java.util.Date;

public class MessageRecord {
	
	// 主键id，自增
	private Integer id;
	// 手机号码
	private String phoneNumber;
	// 短信内容
	private String content;
	// 发送时间
	private Date sendTime;
	// 验证码过期时间
	private Date endTime;
	// 验证码
	private String smsCode;
	// 状态码
	private String statusCode;
	// 结果提示信息
	private String message;
	// 本次任务的序列号
	private String taskId;
	// 发送失败条数
	private Integer remainPoint;
	// 发送成功条数
	private Integer successCounts;

	public MessageRecord(){}
	
	public MessageRecord(String phoneNumber, String content, Date sendTime,
			Date endTime, String smsCode, String statusCode, String message,
			String taskId, Integer remainPoint, Integer successCounts) {
		super();
		this.phoneNumber = phoneNumber;
		this.content = content;
		this.sendTime = sendTime;
		this.endTime = endTime;
		this.smsCode = smsCode;
		this.statusCode = statusCode;
		this.message = message;
		this.taskId = taskId;
		this.remainPoint = remainPoint;
		this.successCounts = successCounts;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Integer getRemainPoint() {
		return remainPoint;
	}

	public void setRemainPoint(Integer remainPoint) {
		this.remainPoint = remainPoint;
	}

	public Integer getSuccessCounts() {
		return successCounts;
	}

	public void setSuccessCounts(Integer successCounts) {
		this.successCounts = successCounts;
	}
}

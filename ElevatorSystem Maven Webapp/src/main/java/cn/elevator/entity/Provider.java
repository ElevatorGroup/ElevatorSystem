package cn.elevator.entity;
import java.util.Date;




public class Provider {
	
	//厂商id
	private Integer id;
	//公司名称
	private String companyname;
	//公司地址
	private String companyaddress;
	//统一社会信用代码
	private String creditcode;
	//厂商营业执照
	private String businesslicense;
	//法定代表人
	private String representative;
	//公司电话
	private String companytel;
	//公司销售电话
	private String contactnumber;
	//公司销售人
	private String contactperson;
	//单位传真
	private String fax;
	//审批状态
	private Integer vendortype;
	//创建人
	private String creater;
	//创建时间
	private Date createdate;
	//修改人
	private String updater;
	//修改时间
	private Date updatdate;

	/**
	 * 设置：厂商id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：厂商id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：公司名称
	 */
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	/**
	 * 获取：公司名称
	 */
	public String getCompanyname() {
		return companyname;
	}
	/**
	 * 设置：公司地址
	 */
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	/**
	 * 获取：公司地址
	 */
	public String getCompanyaddress() {
		return companyaddress;
	}
	/**
	 * 设置：统一社会信用代码
	 */
	public void setCreditcode(String creditcode) {
		this.creditcode = creditcode;
	}
	/**
	 * 获取：统一社会信用代码
	 */
	public String getCreditcode() {
		return creditcode;
	}
	/**
	 * 设置：厂商营业执照
	 */
	public void setBusinesslicense(String businesslicense) {
		this.businesslicense = businesslicense;
	}
	/**
	 * 获取：厂商营业执照
	 */
	public String getBusinesslicense() {
		return businesslicense;
	}
	/**
	 * 设置：法定代表人
	 */
	public void setRepresentative(String representative) {
		this.representative = representative;
	}
	/**
	 * 获取：法定代表人
	 */
	public String getRepresentative() {
		return representative;
	}
	/**
	 * 设置：公司电话
	 */
	public void setCompanytel(String companytel) {
		this.companytel = companytel;
	}
	/**
	 * 获取：公司电话
	 */
	public String getCompanytel() {
		return companytel;
	}
	/**
	 * 设置：公司销售电话
	 */
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	/**
	 * 获取：公司销售电话
	 */
	public String getContactnumber() {
		return contactnumber;
	}
	/**
	 * 设置：公司销售人
	 */
	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}
	/**
	 * 获取：公司销售人
	 */
	public String getContactperson() {
		return contactperson;
	}
	/**
	 * 设置：单位传真
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * 获取：单位传真
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * 设置：审批状态
	 */
	public void setVendortype(Integer vendortype) {
		this.vendortype = vendortype;
	}
	/**
	 * 获取：审批状态
	 */
	public Integer getVendortype() {
		return vendortype;
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
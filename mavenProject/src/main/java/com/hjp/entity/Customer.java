/*
 * 文件名称: Customer.java
 * 版权信息: Copyright 2001-2017 test technology Co., LTD. All right reserved.
 * ----------------------------------------------------------------------------------------------
 * 修改历史:
 * ----------------------------------------------------------------------------------------------
 * 修改原因: 新增
 * 修改人员: huangjp
 * 修改日期: 2019-6-24
 * 修改内容: 
 */
package com.hjp.entity;

/**
 * 功能描述: 客户信息对象类<p>  
 * 新增原因: TODO<p>  
 * 新增日期: 2019-6-24 <p>  
 * 
 * @author huangjp
 * @version 1.0.0
 */
public class Customer{

	private static final long serialVersionUID = 1L;

		/**主键*/
		private Long id;
		/**客户名称*/
		private String name;
		/**手机号*/
		private String mobile;
		/**地址*/
		private String addr;
		/**状态*/
		private Integer flag;


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}
		public Integer getFlag() {
			return flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}
}

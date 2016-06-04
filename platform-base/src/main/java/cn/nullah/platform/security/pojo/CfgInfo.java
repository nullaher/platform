package cn.nullah.platform.security.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import cn.nullah.platform.dao.PersistModel;

/**
 * CfgInfo entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "cfg_info" , catalog = "test")
public class CfgInfo extends PersistModel implements java.io.Serializable {
	
	private Long cfgId;
	
	private String cfgName;
	
	private String cfgKey;
	
	private String cfgValue;
	
	private Long typeCfgId;
	
	private String remark;
	
	// Constructors
	/** default constructor */
	public CfgInfo(){
	}
	
	/** full constructor */
	public CfgInfo(String cfgName , String cfgKey , String cfgValue , Long typeCfgId , String remark){
		this.cfgName = cfgName;
		this.cfgKey = cfgKey;
		this.cfgValue = cfgValue;
		this.typeCfgId = typeCfgId;
		this.remark = remark;
	}
	
	// Property accessors
	@GenericGenerator(name = "generator" , strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "CFG_ID" , unique = true , nullable = false)
	public Long getCfgId(){
		return this.cfgId;
	}
	
	public void setCfgId(Long cfgId){
		this.cfgId = cfgId;
	}
	
	@Column(name = "CFG_NAME" , length = 50)
	public String getCfgName(){
		return this.cfgName;
	}
	
	public void setCfgName(String cfgName){
		this.cfgName = cfgName;
	}
	
	@Column(name = "CFG_KEY" , length = 50)
	public String getCfgKey(){
		return this.cfgKey;
	}
	
	public void setCfgKey(String cfgKey){
		this.cfgKey = cfgKey;
	}
	
	@Column(name = "CFG_VALUE" , length = 200)
	public String getCfgValue(){
		return this.cfgValue;
	}
	
	public void setCfgValue(String cfgValue){
		this.cfgValue = cfgValue;
	}
	
	@Column(name = "TYPE_CFG_ID")
	public Long getTypeCfgId(){
		return this.typeCfgId;
	}
	
	public void setTypeCfgId(Long typeCfgId){
		this.typeCfgId = typeCfgId;
	}
	
	@Column(name = "REMARK" , length = 200)
	public String getRemark(){
		return this.remark;
	}
	
	public void setRemark(String remark){
		this.remark = remark;
	}
}

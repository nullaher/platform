package cn.nullah.platform.security.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * ResInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "res_info" , catalog = "test")
public class ResInfo implements java.io.Serializable {
	
	// Fields
	private Long resId;
	
	private String resName;
	
	private Short resType;
	
	private String resAction;
	
	private Long upResId;
	
	private Short resStatus;
	
	// Constructors
	/** default constructor */
	public ResInfo(){
	}
	
	/** minimal constructor */
	public ResInfo(String resName , Long upResId){
		this.resName = resName;
		this.upResId = upResId;
	}
	
	/** full constructor */
	public ResInfo(String resName , Short resType , String resAction , Long upResId , Short resStatus){
		this.resName = resName;
		this.resType = resType;
		this.resAction = resAction;
		this.upResId = upResId;
		this.resStatus = resStatus;
	}
	
	// Property accessors
	@GenericGenerator(name = "generator" , strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "RES_ID" , unique = true , nullable = false)
	public Long getResId(){
		return this.resId;
	}
	
	public void setResId(Long resId){
		this.resId = resId;
	}
	
	@Column(name = "RES_NAME" , nullable = false , length = 50)
	public String getResName(){
		return this.resName;
	}
	
	public void setResName(String resName){
		this.resName = resName;
	}
	
	@Column(name = "RES_TYPE")
	public Short getResType(){
		return this.resType;
	}
	
	public void setResType(Short resType){
		this.resType = resType;
	}
	
	@Column(name = "RES_ACTION" , length = 200)
	public String getResAction(){
		return this.resAction;
	}
	
	public void setResAction(String resAction){
		this.resAction = resAction;
	}
	
	@Column(name = "UP_RES_ID" , nullable = false)
	public Long getUpResId(){
		return this.upResId;
	}
	
	public void setUpResId(Long upResId){
		this.upResId = upResId;
	}
	
	@Column(name = "RES_STATUS")
	public Short getResStatus(){
		return this.resStatus;
	}
	
	public void setResStatus(Short resStatus){
		this.resStatus = resStatus;
	}
}

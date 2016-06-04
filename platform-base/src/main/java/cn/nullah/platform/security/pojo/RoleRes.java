package cn.nullah.platform.security.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * RoleRes entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "role_res" , catalog = "test")
public class RoleRes implements java.io.Serializable {
	
	// Fields
	private Long roleResId;
	
	private Long resId;
	
	private Long roleId;
	
	// Constructors
	/** default constructor */
	public RoleRes(){
	}
	
	/** full constructor */
	public RoleRes(Long resId , Long roleId){
		this.resId = resId;
		this.roleId = roleId;
	}
	
	// Property accessors
	@GenericGenerator(name = "generator" , strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ROLE_RES_ID" , unique = true , nullable = false)
	public Long getRoleResId(){
		return this.roleResId;
	}
	
	public void setRoleResId(Long roleResId){
		this.roleResId = roleResId;
	}
	
	@Column(name = "RES_ID")
	public Long getResId(){
		return this.resId;
	}
	
	public void setResId(Long resId){
		this.resId = resId;
	}
	
	@Column(name = "ROLE_ID")
	public Long getRoleId(){
		return this.roleId;
	}
	
	public void setRoleId(Long roleId){
		this.roleId = roleId;
	}
}

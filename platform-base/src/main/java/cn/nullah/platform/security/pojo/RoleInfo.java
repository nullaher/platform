package cn.nullah.platform.security.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * RoleInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "role_info" , catalog = "test")
public class RoleInfo implements java.io.Serializable {
	
	// Fields
	private Long roleId;
	
	private String roleName;
	
	private String remark;
	
	// Constructors
	/** default constructor */
	public RoleInfo(){
	}
	
	/** full constructor */
	public RoleInfo(String roleName , String remark){
		this.roleName = roleName;
		this.remark = remark;
	}
	
	// Property accessors
	@GenericGenerator(name = "generator" , strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ROLE_ID" , unique = true , nullable = false)
	public Long getRoleId(){
		return this.roleId;
	}
	
	public void setRoleId(Long roleId){
		this.roleId = roleId;
	}
	
	@Column(name = "ROLE_NAME" , length = 50)
	public String getRoleName(){
		return this.roleName;
	}
	
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	
	@Column(name = "REMARK" , length = 200)
	public String getRemark(){
		return this.remark;
	}
	
	public void setRemark(String remark){
		this.remark = remark;
	}
}

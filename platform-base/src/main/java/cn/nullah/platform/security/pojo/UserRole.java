package cn.nullah.platform.security.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * UserRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_role" , catalog = "test")
public class UserRole implements java.io.Serializable {
	
	// Fields
	private Long userRoleId;
	
	private Long userId;
	
	private Long roleId;
	
	// Constructors
	/** default constructor */
	public UserRole(){
	}
	
	/** full constructor */
	public UserRole(Long userId , Long roleId){
		this.userId = userId;
		this.roleId = roleId;
	}
	
	// Property accessors
	@GenericGenerator(name = "generator" , strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "USER_ROLE_ID" , unique = true , nullable = false)
	public Long getUserRoleId(){
		return this.userRoleId;
	}
	
	public void setUserRoleId(Long userRoleId){
		this.userRoleId = userRoleId;
	}
	
	@Column(name = "USER_ID")
	public Long getUserId(){
		return this.userId;
	}
	
	public void setUserId(Long userId){
		this.userId = userId;
	}
	
	@Column(name = "ROLE_ID")
	public Long getRoleId(){
		return this.roleId;
	}
	
	public void setRoleId(Long roleId){
		this.roleId = roleId;
	}
}

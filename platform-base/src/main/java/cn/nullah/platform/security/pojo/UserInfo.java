package cn.nullah.platform.security.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user_info" , catalog = "test")
public class UserInfo implements java.io.Serializable {
	
	// Fields
	private Long userId;
	
	private String userName;
	
	private String userPwd;
	
	private Short userStatus;
	
	// Constructors
	/** default constructor */
	public UserInfo(){
	}
	
	/** minimal constructor */
	public UserInfo(String userName){
		this.userName = userName;
	}
	
	/** full constructor */
	public UserInfo(String userName , String userPwd , Short userStatus){
		this.userName = userName;
		this.userPwd = userPwd;
		this.userStatus = userStatus;
	}
	
	// Property accessors
	@GenericGenerator(name = "generator" , strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "USER_ID" , unique = true , nullable = false)
	public Long getUserId(){
		return this.userId;
	}
	
	public void setUserId(Long userId){
		this.userId = userId;
	}
	
	@Column(name = "USER_NAME" , nullable = false , length = 50)
	public String getUserName(){
		return this.userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	@Column(name = "USER_PWD" , length = 100)
	public String getUserPwd(){
		return this.userPwd;
	}
	
	public void setUserPwd(String userPwd){
		this.userPwd = userPwd;
	}
	
	@Column(name = "USER_STATUS")
	public Short getUserStatus(){
		return this.userStatus;
	}
	
	public void setUserStatus(Short userStatus){
		this.userStatus = userStatus;
	}
}

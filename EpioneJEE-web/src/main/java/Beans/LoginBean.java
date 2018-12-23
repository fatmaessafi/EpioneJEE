package Beans;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.User;
import user.UserService;;

@ManagedBean
@SessionScoped
public class LoginBean {
	private String email;
	private String mdp;
	private User user;
	private boolean rememberMe=true;
	private boolean loggedIn;
	@EJB
	UserService userService;
	public String doLogin(){
		String navigateTo = "null";
		user=userService.Login(email, mdp, rememberMe);
		if(user.getUserName()!=null){
			navigateTo="pages/admin/welcome?faces-redirect=true";
			loggedIn = true;
		}
		else{
			FacesContext.getCurrentInstance().addMessage("form:btn",new FacesMessage("bad credentials"));
		}
		return navigateTo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}


}
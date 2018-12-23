package user;

import javax.ejb.Remote;

import Entities.User;

@Remote
public interface UserServiceRemote {
	public User Login(String email,String mdp,Boolean RememberMe);

}

package user;

import javax.ejb.Local;

import Entities.User;

@Local
public interface UserServiceLocal {

	public User Login(String email,String mdp,Boolean RememberMe);

}

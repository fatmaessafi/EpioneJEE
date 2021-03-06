package user;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import Entities.User;


/**
 * Session Bean implementation class UserService
 */
@Stateless
@LocalBean
public class UserService implements UserServiceRemote, UserServiceLocal {

    /**
     * Default constructor. 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User Login(String email, String mdp, Boolean RememberMe) {
		// TODO Auto-generated method stub
		User u=new User();
		  u.setEmail(email);
		  u.setPassword(mdp);
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:21514/api/Login");
		Gson j=new Gson();
		ObjectMapper mapper = new ObjectMapper();
		Response response=target.request().post(Entity.json(u));
		String result=response.readEntity(String.class);
		u = j.fromJson(result, new TypeToken<User>(){}.getType());
		System.out.println(u.getUserName());
		response.close();
		return u;
	}

}

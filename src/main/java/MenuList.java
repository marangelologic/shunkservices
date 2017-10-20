

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/menu")
public class MenuList {

	@GET
	@Produces("text/plain")
	public String getAllMenu() {
		return "menuList";
	}

}

package ro.danisi.app.ws.ui.model.response;

/* class used to convert
 * java objects into
 * json REST response body containing the
 * details of the executed operation */

import java.util.List;

import lombok.Data;

@Data
public class UserRest {
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private List<AddressesRest> addresses;
}
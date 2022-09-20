package ro.danisi.app.ws.ui.model.request;

/* class used to convert
 * received json REST request body (containing the user details)
 * into java objects required for processing the request */

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDetailsRequestModel {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private List<AddressRequestModel> addresses;
}
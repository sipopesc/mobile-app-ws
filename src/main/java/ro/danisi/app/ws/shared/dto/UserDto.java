package ro.danisi.app.ws.shared.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;


@Data
public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5028655688967282180L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerificationToken;
	private Boolean emailVerificationStatus = false;
	private List<AddressDTO> addresses;
}

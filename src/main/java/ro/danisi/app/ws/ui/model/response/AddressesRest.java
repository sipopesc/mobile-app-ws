package ro.danisi.app.ws.ui.model.response;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;


@Data
public class AddressesRest extends RepresentationModel<AddressesRest> {
	private String addressId;
	private String city;
	private String country;
	private String streetName;
	private String postalCode;
	private String type;
}
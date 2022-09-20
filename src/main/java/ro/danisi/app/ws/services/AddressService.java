package ro.danisi.app.ws.services;

import java.util.List;

import ro.danisi.app.ws.shared.dto.AddressDTO;

public interface AddressService {
	List<AddressDTO> getAddresses(String userId);

	AddressDTO getAddress(String addressId);
}
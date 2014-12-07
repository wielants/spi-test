package org.acme.provider;

import com.example.service.SpecialService;

public class NothingSpecial implements SpecialService {

	@Override
	public String getSomethingSpecial() {
		return "really nothing special";
	}

}

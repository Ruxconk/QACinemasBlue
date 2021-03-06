/**
 * Created by Matt Gordon
 */
package qacinema.service.managers.offline;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import qacinema.data.users.Address;
import qacinema.data.users.User;
import qacinema.service.managers.AddressManager;
import qacinema.testdata.TestData;

public class OfflineAddressManager implements AddressManager {

	@Inject
	private TestData testData;

	@Override
	public Address persistAdrress(Address address) {
		return null;
	}

	@Override
	public Address findAddressById(String id) {
		for (Address address : testData.getAddressMap().values()) {
			if (address.getAddressID().equals(id)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Id");
	}

	@Override
	public Address findByLine1(String line1) {
		for (Address address : testData.getAddressMap().values()) {
			if (address.getLine1().equals(line1)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Line1");
	}

	@Override
	public Address findByLine2(String line2) {
		for (Address address : testData.getAddressMap().values()) {
			if (address.getLine2().equals(line2)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Line2");
	}

	@Override
	public Address findByTown(String town) {
		for (Address address : testData.getAddressMap().values()) {
			if (address.getTown().equals(town)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Town");
	}

	@Override
	public Address findByCounty(String county) {
		for (Address address : testData.getAddressMap().values()) {
			if (address.getCounty().equals(county)) {
				return address;
			}
		}
		throw new NoResultException("No Matching County");
	}

	@Override
	public Address findByPostcode(String postcode) {
		for (Address address : testData.getAddressMap().values()) {
			if (address.getPostcode().equals(postcode)) {
				return address;
			}
		}
		throw new NoResultException("No Matching Postcode");
	}

	@Override
	public void createAddress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAddress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAddress(Address address) {
		// TODO Auto-generated method stub

	}

}

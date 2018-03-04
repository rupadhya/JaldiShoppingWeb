package com.sangamone.jaldishopping.domain;



import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "js_beacon_details")
public class BeaconDetails extends BaseDomain{
  
    
	private String beaconId;
	
	private String appId;	

	private String appToken;

	private String locationId;

	public String getBeaconId() {
		return beaconId;
	}

	public void setBeaconId(String beaconId) {
		this.beaconId = beaconId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppToken() {
		return appToken;
	}

	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	
}

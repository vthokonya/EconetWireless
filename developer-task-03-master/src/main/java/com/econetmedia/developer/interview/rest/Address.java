/**
 * 
 */
package com.econetmedia.developer.interview.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Victor Tichayana Hokonya
 * 
 * Person's address presentation class
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Address {
	private Integer id;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String addressLine4;
	private String addressLine5;
	private String addressLine6;
	private String addressLine7;
	private String addressLine8;
	private String addressLine9;
	private String addressLine10;
	
	public Address(Integer id, String addressLine1, String addressLine2, String addressLine3, String... addressLine4) {
		this.id = id;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		for(int i = 0; i < addressLine4.length; i++){
			if(i==0)this.addressLine4 = addressLine4[i];
			if(i==1)this.addressLine5 = addressLine4[i];
			if(i==2)this.addressLine6 = addressLine4[i];
			if(i==3)this.addressLine7 = addressLine4[i];
			if(i==4)this.addressLine8 = addressLine4[i];
			if(i==5)this.addressLine9 = addressLine4[i];
			if(i==6)this.addressLine10 = addressLine4[i];
		}
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	
	public String getAddressLine4() {
		return addressLine4;
	}
	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}
	public String getAddressLine5() {
		return addressLine5;
	}
	public void setAddressLine5(String addressLine5) {
		this.addressLine5 = addressLine5;
	}
	public String getAddressLine6() {
		return addressLine6;
	}
	public void setAddressLine6(String addressLine6) {
		this.addressLine6 = addressLine6;
	}
	@Override
	public String toString(){
		String msg = "{\"id\":"+id+",\"addressLine1\":\""+addressLine1+"\",\"addressLine2\":\""+addressLine2+"\",\"addressLine3\":\""+addressLine3+"\"";
		if(addressLine4!=null && !addressLine4.isEmpty()){
			msg = msg.concat(",\"addressLine4\":\""+addressLine4+"\"");
		}
		if(addressLine5!=null && !addressLine5.isEmpty()){
			msg = msg.concat(",\"addressLine5\":\""+addressLine5+"\"");
		}
		if(addressLine6!=null && !addressLine6.isEmpty()){
			msg = msg.concat(",\"addressLine6\":\""+addressLine6+"\"");
		}
		if(addressLine7!=null && !addressLine7.isEmpty()){
			msg = msg.concat(",\"addressLine7\":\""+addressLine7+"\"");
		}
		if(addressLine8!=null && !addressLine8.isEmpty()){
			msg = msg.concat(",\"addressLine8\":\""+addressLine8+"\"");
		}
		if(addressLine9!=null && !addressLine9.isEmpty()){
			msg = msg.concat(",\"addressLine9\":\""+addressLine9+"\"");
		}
		if(addressLine10!=null && !addressLine10.isEmpty()){
			msg = msg.concat(",\"addressLine10\":\""+addressLine10+"\"");
		}
		return msg.concat("}");
	}
}

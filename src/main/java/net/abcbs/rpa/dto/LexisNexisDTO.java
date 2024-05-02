package net.abcbs.rpa.dto;

import org.apache.commons.lang3.StringUtils;

public class LexisNexisDTO {
	
	private String memberId;
	private String id;
	private	String FirstName;
	private String MidName;
	private String LastName;
	private String AddressLn1;
	private String AddressLn2;
	private String City;
	private String State;
	private String Zip;
	private String Dob;
	private String Gender;
	private String Ssn;
	private String HomePhone;
	private String AltPhone;
	private String ArchiveDate;
	private String AdmitDate;
	private String AdmitDiagnosisCode;
	private String FinancialClass;
	private String PatientType;
	private String Udf1;
	private String Udf2;
	private String Udf3;
	private String Lob;
	private String LnSearchName;
	private String LnSearchNameType;
	private String Lexid;
	private String LexidScore;
	private String Gender1;
	private String Name;
	private String Ssn1;
	private String DateOfBirth;
	private String AddressMatchCodes;
	private String Address;
	private String City1;
	private String State1;
	private String Zip1;
	private String Zip4;
	private String County;
	private String AddressOlderThan90Days;
	private String AddressLastSeenDate;
	private String AddressFirstSeenDate;
	private String AddressLatitude;
	private String AddressLongitude;
	private String AddressDeliverable;
	private String AddressDeliverableCodes;
	private String TypeOfMove;
	private String MoveCodes;
	private String PossibleNewAddressMatchCodes;
	private String PossibleNewAddress;
	private String PossibleNewCity;
	private String PossibleNewState;
	private String PossibleNewZip;
	private String PossibleNewZip4;
	private String PossibleNewCounty;
	private String PossibleNewAddressLastSeenDate;
	private String PossibleNewAddressFirstSeenDate;
	private String PossibleNewLatitude;
	private String PossibleNewLongitude;
	private String NameScore;
	private String SsnScore;
	private String DobScore;
	private String Phone1MatchCodes;
	private String Phone1Number;
	private String Phone1NumberListingName;
	private String Phone1PossibleRelation;
	private String Phone1FirstSeenDate;
	private String Phone1LastSeenDate;
	private String Phone1Type;
	private String Phone1LineType;
	private String Phone1Carrier;
	private String Phone1CarrierCity;
	private String Phone1CarrierState;
	private String Phone1PhoneStatus;
	private String Phone1Score;
	private String Phone2MatchCodes;
	private String Phone2Number;
	private String Phone2NumberListingName;
	private String Phone2PossibleRelation;
	private String Phone2FirstSeenDate;
	private String Phone2LastSeenDate;
	private String Phone2Type;
	private String Phone2LineType;
	private String Phone2Carrier;
	private String Phone2CarrierCity;
	private String Phone2CarrierState;
	private String Phone2Score;
	private String Phone3MatchCodes;
	private String Phone3Number;
	private String Phone3NumberListingName;
	private String Phone3PossibleRelation;
	private String Phone3FirstSeenDate;
	private String Phone3LastSeenDate;
	private String Phone3Type;
	private String Phone3LineType;
	private String Phone3Carrier;
	private String Phone3CarrierCity;
	private String Phone3CarrierState;
	private String Phone3Score;
	private String DateOfDeath;
	private String DeceasedMatchCode;
	private String VerifiedOrProofCode;
	private String DeceasedSource;
	private String CalculatedAge;
	private String Email1;
	private String Email2;
	private String Email3;
	private String Email4;
	private String Email5;
	private String Email6;
	private String Email7;
	private String Email8;
	private String Email9;
	private String Email10;
	private String Email1DateFirstSeen;
	private String Email1DateLastSeen;
	private String Email1Status;
	private String Email1AdditionalStatusInfo;
	private String Email2DateFirstSeen;
	private String Email2DateLastSeen;
	private String Email2Status;
	private String Email2AdditionalStatusInfo;
	private String Email3DateFirstSeen;
	private String Email3DateLastSeen;
	private String Email3Status;
	private String Email3AdditionalStatusInfo;
	private String Email4DateFirstSeen;
	private String Email4DateLastSeen;
	private String Email4Status;
	private String Email4AdditionalStatusInfo;
	private String Email5DateFirstSeen;
	private String Email5DateLastSeen;
	private String Email5Status;
	private String Email5AdditionalStatusInfo;
	private String Email6DateFirstSeen;
	private String Email6DateLastSeen;
	private String Email6Status;
	private String Email6AdditionalStatusInfo;
	private String Email7DateFirstSeen;
	private String Email7DateLastSeen;
	private String Email7Status;
	private String Email7AdditionalStatusInfo;
	private String Email8DateFirstSeen;
	private String Email8DateLastSeen;
	private String Email8Status;
	private String Email8AdditionalStatusInfo;
	private String Email9DateFirstSeen;
	private String Email9DateLastSeen;
	private String Email9Status;
	private String Email9AdditionalStatusInfo;
	private String Email10DateFirstSeen;
	private String Email10DateLastSeen;
	private String Email10Status;
	private String Email10AdditionalStatusInfo;
	private String AddressDescriptionCode1;
	private String AddressDescriptionCode2;
	private String AddressDescriptionCode3;
	private String AddressDescriptionCode4;
	private String AddressDescriptionCode5;
	private String AddressDescriptionCode6;
	private String AddressDescriptionCode7;
	private String AddressDescriptionCode8;
	private String AddressDescriptionCode9;
	private String AddressDescriptionCode10;
	private String InputEmailInvalid;
	private String InputEmailInvalidReason;
	private String AuditKey;
	
	private String error;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		
		if (StringUtils.isBlank(memberId)) {
			this.memberId = "null";
		}
		else {
			this.memberId = memberId.trim();
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if (StringUtils.isBlank(id)) {
			this.id = "null";
		}
		else {
			this.id = id.trim();
		}
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		if (StringUtils.isBlank(firstName)) {
			FirstName = "null";
		}
		else {
			FirstName = firstName.trim();
		}
		
	}
	public String getMidName() {
		return MidName;
	}
	public void setMidName(String midName) {
		if (StringUtils.isBlank(midName)) {
			MidName = "null";
		}
		else {
			MidName = midName.trim();
		}
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		if (StringUtils.isBlank(lastName)) {
			LastName = "null";
		}
		else {
			LastName = lastName.trim();
		}
	}
	public String getAddressLn1() {
		return AddressLn1;
	}
	public void setAddressLn1(String addressLn1) {
		if (StringUtils.isBlank(addressLn1)) {
			AddressLn1 = "null";
		}
		else {
			AddressLn1 = addressLn1.trim();
		}
	}
	public String getAddressLn2() {
		return AddressLn2;
	}
	public void setAddressLn2(String addressLn2) {
		if (StringUtils.isBlank(addressLn2)) {
			AddressLn2 = "null";
		}
		else {
			AddressLn2 = addressLn2.trim();
		}
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		if (StringUtils.isBlank(city)) {
			City = "null";
		}
		else {
			City = city.trim();
		}
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		if (StringUtils.isBlank(state)) {
			State = "null";
		}
		else {
			State = state.trim();
		}
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		if (StringUtils.isBlank(zip)) {
			Zip = "null";
		}
		else {
			Zip = zip.trim();
		}
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		if (StringUtils.isBlank(dob)) {
			Dob = "null";
		}
		else {
			Dob = dob.trim();
		}
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		if (StringUtils.isBlank(gender)) {
			Gender = "null";
		}
		else {
			Gender = gender.trim();
		}
	}
	public String getSsn() {
		return Ssn;
	}
	public void setSsn(String ssn) {
		if (StringUtils.isBlank(ssn)) {
			Ssn = "null";
		}
		else {
			Ssn = ssn.trim();
		}
	}
	public String getHomePhone() {
		return HomePhone;
	}
	public void setHomePhone(String homePhone) {
		if (StringUtils.isBlank(homePhone)) {
			HomePhone = "null";
		}
		else {
			HomePhone = homePhone.trim();
		}
	}
	public String getAltPhone() {
		return AltPhone;
	}
	public void setAltPhone(String altPhone) {
		if (StringUtils.isBlank(altPhone)) {
			AltPhone = "null";
		}
		else {
			AltPhone = altPhone.trim();
		}
	}
	public String getArchiveDate() {
		return ArchiveDate;
	}
	public void setArchiveDate(String archiveDate) {
		if (StringUtils.isBlank(archiveDate)) {
			ArchiveDate = "null";
		}
		else {
			ArchiveDate = archiveDate.trim();
		}
	}
	public String getAdmitDate() {
		return AdmitDate;
	}
	public void setAdmitDate(String admitDate) {
		if (StringUtils.isBlank(admitDate)) {
			AdmitDate = "null";
		}
		else {
			AdmitDate = admitDate.trim();
		}
	}
	public String getAdmitDiagnosisCode() {
		return AdmitDiagnosisCode;
	}
	public void setAdmitDiagnosisCode(String admitDiagnosisCode) {
		if (StringUtils.isBlank(admitDiagnosisCode)) {
			AdmitDiagnosisCode = "null";
		}
		else {
			AdmitDiagnosisCode = admitDiagnosisCode.trim();
		}
	}
	public String getFinancialClass() {
		return FinancialClass;
	}
	public void setFinancialClass(String financialClass) {
		if (StringUtils.isBlank(financialClass)) {
			FinancialClass = "null";
		}
		else {
			FinancialClass = financialClass.trim();
		}
	}
	public String getPatientType() {
		return PatientType;
	}
	public void setPatientType(String patientType) {
		if (StringUtils.isBlank(patientType)) {
			PatientType = "null";
		}
		else {
			PatientType = patientType.trim();
		}
	}
	public String getUdf1() {
		return Udf1;
	}
	public void setUdf1(String udf1) {
		if (StringUtils.isBlank(udf1)) {
			Udf1 = "null";
		}
		else {
			Udf1 = udf1.trim();
		}
	}
	public String getUdf2() {
		return Udf2;
	}
	public void setUdf2(String udf2) {
		if (StringUtils.isBlank(udf2)) {
			Udf2 = "null";
		}
		else {
			Udf2 = udf2.trim();
		}
	}
	public String getUdf3() {
		return Udf3;
	}
	public void setUdf3(String udf3) {
		if (StringUtils.isBlank(udf3)) {
			Udf3 = "null";
		}
		else {
			Udf3 = udf3.trim();
		}
	}
	public String getLob() {
		return Lob;
	}
	public void setLob(String lob) {
		if (StringUtils.isBlank(lob)) {
			Lob = "null";
		}
		else {
			Lob = lob.trim();
		}
	}
	public String getLnSearchName() {
		return LnSearchName;
	}
	public void setLnSearchName(String lnSearchName) {
		if (StringUtils.isBlank(lnSearchName)) {
			LnSearchName = "null";
		}
		else {
			LnSearchName = lnSearchName.trim();
		}
	}
	public String getLnSearchNameType() {
		return LnSearchNameType;
	}
	public void setLnSearchNameType(String lnSearchNameType) {
		if (StringUtils.isBlank(lnSearchNameType)) {
			LnSearchNameType = "null";
		}
		else {
			LnSearchNameType = lnSearchNameType.trim();
		}
	}
	public String getLexid() {
		return Lexid;
	}
	public void setLexid(String lexid) {
		if (StringUtils.isBlank(lexid)) {
			Lexid = "null";
		}
		else {
			Lexid = lexid.trim();
		}
	}
	public String getLexidScore() {
		return LexidScore;
	}
	public void setLexidScore(String lexidScore) {
		if (StringUtils.isBlank(lexidScore)) {
			LexidScore = "null";
		}
		else {
			LexidScore = lexidScore.trim();
		}
	}
	public String getGender1() {
		return Gender1;
	}
	public void setGender1(String gender1) {
		if (StringUtils.isBlank(gender1)) {
			Gender1 = "null";
		}
		else {
			Gender1 = gender1.trim();
		}
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		if (StringUtils.isBlank(name)) {
			Name = "null";
		}
		else {
			Name = name.trim();
		}
	}
	public String getSsn1() {
		return Ssn1;
	}
	public void setSsn1(String ssn1) {
		if (StringUtils.isBlank(ssn1)) {
			Ssn1 = "null";
		}
		else {
			Ssn1 = ssn1.trim();
		}
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		if (StringUtils.isBlank(dateOfBirth)) {
			DateOfBirth = "null";
		}
		else {
			DateOfBirth = dateOfBirth.trim();
		}
	}
	public String getAddressMatchCodes() {
		return AddressMatchCodes;
	}
	public void setAddressMatchCodes(String addressMatchCodes) {
		if (StringUtils.isBlank(addressMatchCodes)) {
			AddressMatchCodes = "null";
		}
		else {
			AddressMatchCodes = addressMatchCodes.trim();
		}
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		if (StringUtils.isBlank(address)) {
			Address = "null";
		}
		else {
			Address = address.trim();
		}
	}
	public String getCity1() {
		return City1;
	}
	public void setCity1(String city1) {
		if (StringUtils.isBlank(city1)) {
			City1 = "null";
		}
		else {
			City1 = city1.trim();
		}
	}
	public String getState1() {
		return State1;
	}
	public void setState1(String state1) {
		if (StringUtils.isBlank(state1)) {
			State1 = "null";
		}
		else {
			State1 = state1.trim();
		}
	}
	public String getZip1() {
		return Zip1;
	}
	public void setZip1(String zip1) {
		if (StringUtils.isBlank(zip1)) {
			Zip1 = "null";
		}
		else {
			Zip1 = zip1.trim();
		}
	}
	public String getZip4() {
		return Zip4;
	}
	public void setZip4(String zip4) {
		if (StringUtils.isBlank(zip4)) {
			Zip4 = "null";
		}
		else {
			Zip4 = zip4.trim();
		}
	}
	public String getCounty() {
		return County;
	}
	public void setCounty(String county) {
		if (StringUtils.isBlank(county)) {
			County = "null";
		}
		else {
			County = county.trim();
		}
	}
	public String getAddressOlderThan90Days() {
		return AddressOlderThan90Days;
	}
	public void setAddressOlderThan90Days(String addressOlderThan90Days) {
		if (StringUtils.isBlank(addressOlderThan90Days)) {
			AddressOlderThan90Days = "null";
		}
		else {
			AddressOlderThan90Days = addressOlderThan90Days.trim();
		}
	}
	public String getAddressLastSeenDate() {
		return AddressLastSeenDate;
	}
	public void setAddressLastSeenDate(String addressLastSeenDate) {
		if (StringUtils.isBlank(addressLastSeenDate)) {
			AddressLastSeenDate = "null";
		}
		else {
			AddressLastSeenDate = addressLastSeenDate.trim();
		}
	}
	public String getAddressFirstSeenDate() {
		return AddressFirstSeenDate;
	}
	public void setAddressFirstSeenDate(String addressFirstSeenDate) {
		if (StringUtils.isBlank(addressFirstSeenDate)) {
			AddressFirstSeenDate = "null";
		}
		else {
			AddressFirstSeenDate = addressFirstSeenDate.trim();
		}
	}
	public String getAddressLatitude() {
		return AddressLatitude;
	}
	public void setAddressLatitude(String addressLatitude) {
		if (StringUtils.isBlank(addressLatitude)) {
			AddressLatitude = "null";
		}
		else {
			AddressLatitude = addressLatitude.trim();
		}
	}
	public String getAddressLongitude() {
		return AddressLongitude;
	}
	public void setAddressLongitude(String addressLongitude) {
		if (StringUtils.isBlank(addressLongitude)) {
			AddressLongitude = "null";
		}
		else {
			AddressLongitude = addressLongitude.trim();
		}
	}
	public String getAddressDeliverable() {
		return AddressDeliverable;
	}
	public void setAddressDeliverable(String addressDeliverable) {
		if (StringUtils.isBlank(addressDeliverable)) {
			AddressDeliverable = "null";
		}
		else {
			AddressDeliverable = addressDeliverable.trim();
		}
	}
	public String getAddressDeliverableCodes() {
		return AddressDeliverableCodes;
	}
	public void setAddressDeliverableCodes(String addressDeliverableCodes) {
		if (StringUtils.isBlank(addressDeliverableCodes)) {
			AddressDeliverableCodes = "null";
		}
		else {
			AddressDeliverableCodes = addressDeliverableCodes.trim();
		}
	}
	public String getTypeOfMove() {
		return TypeOfMove;
	}
	public void setTypeOfMove(String typeOfMove) {
		if (StringUtils.isBlank(typeOfMove)) {
			TypeOfMove = "null";
		}
		else {
			TypeOfMove = typeOfMove.trim();
		}
	}
	public String getMoveCodes() {
		return MoveCodes;
	}
	public void setMoveCodes(String moveCodes) {
		if (StringUtils.isBlank(moveCodes)) {
			MoveCodes = "null";
		}
		else {
			MoveCodes = moveCodes.trim();
		}
	}
	public String getPossibleNewAddressMatchCodes() {
		return PossibleNewAddressMatchCodes;
	}
	public void setPossibleNewAddressMatchCodes(String possibleNewAddressMatchCodes) {
		if (StringUtils.isBlank(possibleNewAddressMatchCodes)) {
			PossibleNewAddressMatchCodes = "null";
		}
		else {
			PossibleNewAddressMatchCodes = possibleNewAddressMatchCodes.trim();
		}
	}
	public String getPossibleNewAddress() {
		return PossibleNewAddress;
	}
	public void setPossibleNewAddress(String possibleNewAddress) {
		if (StringUtils.isBlank(possibleNewAddress)) {
			PossibleNewAddress = "null";
		}
		else {
			PossibleNewAddress = possibleNewAddress.trim();
		}
	}
	public String getPossibleNewCity() {
		return PossibleNewCity;
	}
	public void setPossibleNewCity(String possibleNewCity) {
		if (StringUtils.isBlank(possibleNewCity)) {
			PossibleNewCity = "null";
		}
		else {
			PossibleNewCity = possibleNewCity.trim();
		}
	}
	public String getPossibleNewState() {
		return PossibleNewState;
	}
	public void setPossibleNewState(String possibleNewState) {
		if (StringUtils.isBlank(possibleNewState)) {
			PossibleNewState = "null";
		}
		else {
			PossibleNewState = possibleNewState.trim();
		}
	}
	public String getPossibleNewZip() {
		return PossibleNewZip;
	}
	public void setPossibleNewZip(String possibleNewZip) {
		if (StringUtils.isBlank(possibleNewZip)) {
			PossibleNewZip = "null";
		}
		else {
			PossibleNewZip = possibleNewZip.trim();
		}
	}
	public String getPossibleNewZip4() {
		return PossibleNewZip4;
	}
	public void setPossibleNewZip4(String possibleNewZip4) {
		if (StringUtils.isBlank(possibleNewZip4)) {
			PossibleNewZip4 = "null";
		}
		else {
			PossibleNewZip4 = possibleNewZip4.trim();
		}
	}
	public String getPossibleNewCounty() {
		return PossibleNewCounty;
	}
	public void setPossibleNewCounty(String possibleNewCounty) {
		if (StringUtils.isBlank(possibleNewCounty)) {
			PossibleNewCounty = "null";
		}
		else {
			PossibleNewCounty = possibleNewCounty.trim();
		}
	}
	public String getPossibleNewAddressLastSeenDate() {
		return PossibleNewAddressLastSeenDate;
	}
	public void setPossibleNewAddressLastSeenDate(String possibleNewAddressLastSeenDate) {
		if (StringUtils.isBlank(possibleNewAddressLastSeenDate)) {
			PossibleNewAddressLastSeenDate = "null";
		}
		else {
			PossibleNewAddressLastSeenDate = possibleNewAddressLastSeenDate.trim();
		}
	}
	public String getPossibleNewAddressFirstSeenDate() {
		return PossibleNewAddressFirstSeenDate;
	}
	public void setPossibleNewAddressFirstSeenDate(String possibleNewAddressFirstSeenDate) {
		if (StringUtils.isBlank(possibleNewAddressFirstSeenDate)) {
			PossibleNewAddressFirstSeenDate = "null";
		}
		else {
			PossibleNewAddressFirstSeenDate = possibleNewAddressFirstSeenDate.trim();
		}
	}
	public String getPossibleNewLatitude() {
		return PossibleNewLatitude;
	}
	public void setPossibleNewLatitude(String possibleNewLatitude) {
		if (StringUtils.isBlank(possibleNewLatitude)) {
			PossibleNewLatitude = "null";
		}
		else {
			PossibleNewLatitude = possibleNewLatitude.trim();
		}
	}
	public String getPossibleNewLongitude() {
		return PossibleNewLongitude;
	}
	public void setPossibleNewLongitude(String possibleNewLongitude) {
		if (StringUtils.isBlank(possibleNewLongitude)) {
			PossibleNewLongitude = "null";
		}
		else {
			PossibleNewLongitude = possibleNewLongitude.trim();
		}
	}
	public String getNameScore() {
		return NameScore;
	}
	public void setNameScore(String nameScore) {
		if (StringUtils.isBlank(nameScore)) {
			NameScore = "null";
		}
		else {
			NameScore = nameScore.trim();
		}
	}
	public String getSsnScore() {
		return SsnScore;
	}
	public void setSsnScore(String ssnScore) {
		if (StringUtils.isBlank(ssnScore)) {
			SsnScore = "null";
		}
		else {
			SsnScore = ssnScore.trim();
		}
	}
	public String getDobScore() {
		return DobScore;
	}
	public void setDobScore(String dobScore) {
		if (StringUtils.isBlank(dobScore)) {
			DobScore = "null";
		}
		else {
			DobScore = dobScore.trim();
		}
	}
	public String getPhone1MatchCodes() {
		return Phone1MatchCodes;
	}
	public void setPhone1MatchCodes(String phone1MatchCodes) {
		if (StringUtils.isBlank(phone1MatchCodes)) {
			Phone1MatchCodes = "null";
		}
		else {
			Phone1MatchCodes = phone1MatchCodes.trim();
		}
	}
	public String getPhone1Number() {
		return Phone1Number;
	}
	public void setPhone1Number(String phone1Number) {
		if (StringUtils.isBlank(phone1Number)) {
			Phone1Number = "null";
		}
		else {
			Phone1Number = phone1Number.trim();
		}
	}
	public String getPhone1NumberListingName() {
		return Phone1NumberListingName;
	}
	public void setPhone1NumberListingName(String phone1NumberListingName) {
		if (StringUtils.isBlank(phone1NumberListingName)) {
			Phone1NumberListingName = "null";
		}
		else {
			Phone1NumberListingName = phone1NumberListingName.trim();
		}
	}
	public String getPhone1PossibleRelation() {
		return Phone1PossibleRelation;
	}
	public void setPhone1PossibleRelation(String phone1PossibleRelation) {
		if (StringUtils.isBlank(phone1PossibleRelation)) {
			Phone1PossibleRelation = "null";
		}
		else {
			Phone1PossibleRelation = phone1PossibleRelation.trim();
		}
	}
	public String getPhone1FirstSeenDate() {
		return Phone1FirstSeenDate;
	}
	public void setPhone1FirstSeenDate(String phone1FirstSeenDate) {
		if (StringUtils.isBlank(phone1FirstSeenDate)) {
			Phone1FirstSeenDate = "null";
		}
		else {
			Phone1FirstSeenDate = phone1FirstSeenDate.trim();
		}
	}
	public String getPhone1LastSeenDate() {
		return Phone1LastSeenDate;
	}
	public void setPhone1LastSeenDate(String phone1LastSeenDate) {
		if (StringUtils.isBlank(phone1LastSeenDate)) {
			Phone1LastSeenDate = "null";
		}
		else {
			Phone1LastSeenDate = phone1LastSeenDate.trim();
		}
	}
	public String getPhone1Type() {
		return Phone1Type;
	}
	public void setPhone1Type(String phone1Type) {
		if (StringUtils.isBlank(phone1Type)) {
			Phone1Type = "null";
		}
		else {
			Phone1Type = phone1Type.trim();
		}
	}
	public String getPhone1LineType() {
		return Phone1LineType;
	}
	public void setPhone1LineType(String phone1LineType) {
		if (StringUtils.isBlank(phone1LineType)) {
			Phone1LineType = "null";
		}
		else {
			Phone1LineType = phone1LineType.trim();
		}
	}
	public String getPhone1Carrier() {
		return Phone1Carrier;
	}
	public void setPhone1Carrier(String phone1Carrier) {
		if (StringUtils.isBlank(phone1Carrier)) {
			Phone1Carrier = "null";
		}
		else {
			Phone1Carrier = phone1Carrier.trim();
		}
	}
	public String getPhone1CarrierCity() {
		return Phone1CarrierCity;
	}
	public void setPhone1CarrierCity(String phone1CarrierCity) {
		if (StringUtils.isBlank(phone1CarrierCity)) {
			Phone1CarrierCity = "null";
		}
		else {
			Phone1CarrierCity = phone1CarrierCity.trim();
		}
	}
	public String getPhone1CarrierState() {
		return Phone1CarrierState;
	}
	public void setPhone1CarrierState(String phone1CarrierState) {
		if (StringUtils.isBlank(phone1CarrierState)) {
			Phone1CarrierState = "null";
		}
		else {
			Phone1CarrierState = phone1CarrierState.trim();
		}
	}
	public String getPhone1PhoneStatus() {
		return Phone1PhoneStatus;
	}
	public void setPhone1PhoneStatus(String phone1PhoneStatus) {
		if (StringUtils.isBlank(phone1PhoneStatus)) {
			Phone1PhoneStatus = "null";
		}
		else {
			Phone1PhoneStatus = phone1PhoneStatus.trim();
		}
	}
	public String getPhone1Score() {
		return Phone1Score;
	}
	public void setPhone1Score(String phone1Score) {
		if (StringUtils.isBlank(phone1Score)) {
			Phone1Score = "null";
		}
		else {
			Phone1Score = phone1Score.trim();
		}
	}
	public String getPhone2MatchCodes() {
		return Phone2MatchCodes;
	}
	public void setPhone2MatchCodes(String phone2MatchCodes) {
		if (StringUtils.isBlank(phone2MatchCodes)) {
			Phone2MatchCodes = "null";
		}
		else {
			Phone2MatchCodes = phone2MatchCodes.trim();
		}
	}
	public String getPhone2Number() {
		return Phone2Number;
	}
	public void setPhone2Number(String phone2Number) {
		if (StringUtils.isBlank(phone2Number)) {
			Phone2Number = "null";
		}
		else {
			Phone2Number = phone2Number.trim();
		}
	}
	public String getPhone2NumberListingName() {
		return Phone2NumberListingName;
	}
	public void setPhone2NumberListingName(String phone2NumberListingName) {
		if (StringUtils.isBlank(phone2NumberListingName)) {
			Phone2NumberListingName = "null";
		}
		else {
			Phone2NumberListingName = phone2NumberListingName.trim();
		}
	}
	public String getPhone2PossibleRelation() {
		return Phone2PossibleRelation;
	}
	public void setPhone2PossibleRelation(String phone2PossibleRelation) {
		if (StringUtils.isBlank(phone2PossibleRelation)) {
			Phone2PossibleRelation = "null";
		}
		else {
			Phone2PossibleRelation = phone2PossibleRelation.trim();
		}
	}
	public String getPhone2FirstSeenDate() {
		return Phone2FirstSeenDate;
	}
	public void setPhone2FirstSeenDate(String phone2FirstSeenDate) {
		if (StringUtils.isBlank(phone2FirstSeenDate)) {
			Phone2FirstSeenDate = "null";
		}
		else {
			Phone2FirstSeenDate = phone2FirstSeenDate.trim();
		}
	}
	public String getPhone2LastSeenDate() {
		return Phone2LastSeenDate;
	}
	public void setPhone2LastSeenDate(String phone2LastSeenDate) {
		if (StringUtils.isBlank(phone2LastSeenDate)) {
			Phone2LastSeenDate = "null";
		}
		else {
			Phone2LastSeenDate = phone2LastSeenDate.trim();
		}
	}
	public String getPhone2Type() {
		return Phone2Type;
	}
	public void setPhone2Type(String phone2Type) {
		if (StringUtils.isBlank(phone2Type)) {
			Phone2Type = "null";
		}
		else {
			Phone2Type = phone2Type.trim();
		}
	}
	public String getPhone2LineType() {
		return Phone2LineType;
	}
	public void setPhone2LineType(String phone2LineType) {
		if (StringUtils.isBlank(phone2LineType)) {
			phone2LineType = "null";
		}
		else {
			Phone2LineType = phone2LineType.trim();
		}
	}
	public String getPhone2Carrier() {
		return Phone2Carrier;
	}
	public void setPhone2Carrier(String phone2Carrier) {
		if (StringUtils.isBlank(phone2Carrier)) {
			Phone2Carrier = "null";
		}
		else {
			Phone2Carrier = phone2Carrier.trim();
		}
	}
	public String getPhone2CarrierCity() {
		return Phone2CarrierCity;
	}
	public void setPhone2CarrierCity(String phone2CarrierCity) {
		if (StringUtils.isBlank(phone2CarrierCity)) {
			Phone2CarrierCity = "null";
		}
		else {
			Phone2CarrierCity = phone2CarrierCity.trim();
		}
	}
	public String getPhone2CarrierState() {
		return Phone2CarrierState;
	}
	public void setPhone2CarrierState(String phone2CarrierState) {
		if (StringUtils.isBlank(phone2CarrierState)) {
			Phone2CarrierState = "null";
		}
		else {
			Phone2CarrierState = phone2CarrierState.trim();
		}
	}
	public String getPhone2Score() {
		return Phone2Score;
	}
	public void setPhone2Score(String phone2Score) {
		if (StringUtils.isBlank(phone2Score)) {
			Phone2Score = "null";
		}
		else {
			Phone2Score = phone2Score.trim();
		}
	}
	public String getPhone3MatchCodes() {
		return Phone3MatchCodes;
	}
	public void setPhone3MatchCodes(String phone3MatchCodes) {
		if (StringUtils.isBlank(phone3MatchCodes)) {
			Phone3MatchCodes = "null";
		}
		else {
			Phone3MatchCodes = phone3MatchCodes.trim();
		}
	}
	public String getPhone3Number() {
		return Phone3Number;
	}
	public void setPhone3Number(String phone3Number) {
		if (StringUtils.isBlank(phone3Number)) {
			Phone3Number = "null";
		}
		else {
			Phone3Number = phone3Number.trim();
		}
	}
	public String getPhone3NumberListingName() {
		return Phone3NumberListingName;
	}
	public void setPhone3NumberListingName(String phone3NumberListingName) {
		if (StringUtils.isBlank(phone3NumberListingName)) {
			phone3NumberListingName = "null";
		}
		else {
			phone3NumberListingName = phone3NumberListingName.trim();
		}
	}
	public String getPhone3PossibleRelation() {
		return Phone3PossibleRelation;
	}
	public void setPhone3PossibleRelation(String phone3PossibleRelation) {
		if (StringUtils.isBlank(phone3PossibleRelation)) {
			Phone3PossibleRelation = "null";
		}
		else {
			Phone3PossibleRelation = phone3PossibleRelation.trim();
		}
	}
	public String getPhone3FirstSeenDate() {
		return Phone3FirstSeenDate;
	}
	public void setPhone3FirstSeenDate(String phone3FirstSeenDate) {
		if (StringUtils.isBlank(phone3FirstSeenDate)) {
			Phone3FirstSeenDate = "null";
		}
		else {
			Phone3FirstSeenDate = phone3FirstSeenDate.trim();
		}
	}
	public String getPhone3LastSeenDate() {
		return Phone3LastSeenDate;
	}
	public void setPhone3LastSeenDate(String phone3LastSeenDate) {
		if (StringUtils.isBlank(phone3LastSeenDate)) {
			Phone3LastSeenDate = "null";
		}
		else {
			Phone3LastSeenDate = phone3LastSeenDate.trim();
		}
	}
	public String getPhone3Type() {
		return Phone3Type;
	}
	public void setPhone3Type(String phone3Type) {
		if (StringUtils.isBlank(phone3Type)) {
			Phone3Type = "null";
		}
		else {
			Phone3Type = phone3Type.trim();
		}
	}
	public String getPhone3LineType() {
		return Phone3LineType;
	}
	public void setPhone3LineType(String phone3LineType) {
		if (StringUtils.isBlank(phone3LineType)) {
			Phone3LineType = "null";
		}
		else {
			Phone3LineType = phone3LineType.trim();
		}
	}
	public String getPhone3Carrier() {
		return Phone3Carrier;
	}
	public void setPhone3Carrier(String phone3Carrier) {
		if (StringUtils.isBlank(phone3Carrier)) {
			Phone3Carrier = "null";
		}
		else {
			Phone3Carrier = phone3Carrier.trim();
		}
	}
	public String getPhone3CarrierCity() {
		return Phone3CarrierCity;
	}
	public void setPhone3CarrierCity(String phone3CarrierCity) {
		if (StringUtils.isBlank(phone3CarrierCity)) {
			Phone3CarrierCity = "null";
		}
		else {
			Phone3CarrierCity = phone3CarrierCity.trim();
		}
	}
	public String getPhone3CarrierState() {
		return Phone3CarrierState;
	}
	public void setPhone3CarrierState(String phone3CarrierState) {
		if (StringUtils.isBlank(phone3CarrierState)) {
			Phone3CarrierState = "null";
		}
		else {
			Phone3CarrierState = phone3CarrierState.trim();
		}
	}
	public String getPhone3Score() {
		return Phone3Score;
	}
	public void setPhone3Score(String phone3Score) {
		if (StringUtils.isBlank(phone3Score)) {
			Phone3Score = "null";
		}
		else {
			Phone3Score = phone3Score.trim();
		}
	}
	public String getDateOfDeath() {
		return DateOfDeath;
	}
	public void setDateOfDeath(String dateOfDeath) {
		if (StringUtils.isBlank(dateOfDeath)) {
			DateOfDeath = "null";
		}
		else {
			DateOfDeath = dateOfDeath.trim();
		}
	}
	public String getDeceasedMatchCode() {
		return DeceasedMatchCode;
	}
	public void setDeceasedMatchCode(String deceasedMatchCode) {
		if (StringUtils.isBlank(deceasedMatchCode)) {
			DeceasedMatchCode = "null";
		}
		else {
			DeceasedMatchCode = deceasedMatchCode.trim();
		}
	}
	public String getVerifiedOrProofCode() {
		return VerifiedOrProofCode;
	}
	public void setVerifiedOrProofCode(String verifiedOrProofCode) {
		if (StringUtils.isBlank(verifiedOrProofCode)) {
			VerifiedOrProofCode = "null";
		}
		else {
			VerifiedOrProofCode = verifiedOrProofCode.trim();
		}
	}
	public String getDeceasedSource() {
		return DeceasedSource;
	}
	public void setDeceasedSource(String deceasedSource) {
		if (StringUtils.isBlank(deceasedSource)) {
			DeceasedSource = "null";
		}
		else {
			DeceasedSource = deceasedSource.trim();
		}
	}
	public String getCalculatedAge() {
		return CalculatedAge;
	}
	public void setCalculatedAge(String calculatedAge) {
		if (StringUtils.isBlank(calculatedAge)) {
			CalculatedAge = "null";
		}
		else {
			CalculatedAge = calculatedAge.trim();
		}
	}
	public String getEmail1() {
		return Email1;
	}
	public void setEmail1(String email1) {
		if (StringUtils.isBlank(email1)) {
			Email1 = "null";
		}
		else {
			Email1 = email1.trim();
		}
	}
	public String getEmail2() {
		return Email2;
	}
	public void setEmail2(String email2) {
		if (StringUtils.isBlank(email2)) {
			Email2 = "null";
		}
		else {
			Email2 = email2.trim();
		}
	}
	public String getEmail3() {
		return Email3;
	}
	public void setEmail3(String email3) {
		if (StringUtils.isBlank(email3)) {
			Email3 = "null";
		}
		else {
			Email3 = email3.trim();
		}
	}
	public String getEmail4() {
		return Email4;
	}
	public void setEmail4(String email4) {
		if (StringUtils.isBlank(email4)) {
			Email4 = "null";
		}
		else {
			Email4 = email4.trim();
		}
	}
	public String getEmail5() {
		return Email5;
	}
	public void setEmail5(String email5) {
		if (StringUtils.isBlank(email5)) {
			Email5 = "null";
		}
		else {
			Email5 = email5.trim();
		}
	}
	public String getEmail6() {
		return Email6;
	}
	public void setEmail6(String email6) {
		if (StringUtils.isBlank(email6)) {
			Email6 = "null";
		}
		else {
			Email6 = email6.trim();
		}
	}
	public String getEmail7() {
		return Email7;
	}
	public void setEmail7(String email7) {
		if (StringUtils.isBlank(email7)) {
			Email7 = "null";
		}
		else {
			Email7 = email7.trim();
		}
	}
	public String getEmail8() {
		return Email8;
	}
	public void setEmail8(String email8) {
		if (StringUtils.isBlank(email8)) {
			Email8 = "null";
		}
		else {
			Email8 = email8.trim();
		}
	}
	public String getEmail9() {
		return Email9;
	}
	public void setEmail9(String email9) {
		if (StringUtils.isBlank(email9)) {
			Email9 = "null";
		}
		else {
			Email9 = email9.trim();
		}
	}
	public String getEmail10() {
		return Email10;
	}
	public void setEmail10(String email10) {
		if (StringUtils.isBlank(email10)) {
			Email10 = "null";
		}
		else {
			Email10 = email10.trim();
		}
	}
	public String getEmail1DateFirstSeen() {
		return Email1DateFirstSeen;
	}
	public void setEmail1DateFirstSeen(String email1DateFirstSeen) {
		if (StringUtils.isBlank(email1DateFirstSeen)) {
			Email1DateFirstSeen = "null";
		}
		else {
			Email1DateFirstSeen = email1DateFirstSeen.trim();
		}
	}
	public String getEmail1DateLastSeen() {
		return Email1DateLastSeen;
	}
	public void setEmail1DateLastSeen(String email1DateLastSeen) {
		if (StringUtils.isBlank(email1DateLastSeen)) {
			Email1DateLastSeen = "null";
		}
		else {
			Email1DateLastSeen = email1DateLastSeen.trim();
		}
	}
	public String getEmail1Status() {
		return Email1Status;
	}
	public void setEmail1Status(String email1Status) {
		if (StringUtils.isBlank(email1Status)) {
			Email1Status = "null";
		}
		else {
			Email1Status = email1Status.trim();
		}
	}
	public String getEmail1AdditionalStatusInfo() {
		return Email1AdditionalStatusInfo;
	}
	public void setEmail1AdditionalStatusInfo(String email1AdditionalStatusInfo) {
		if (StringUtils.isBlank(email1AdditionalStatusInfo)) {
			Name = "null";
		}
		else {
			Name = email1AdditionalStatusInfo.trim();
		}
	}
	public String getEmail2DateFirstSeen() {
		return Email2DateFirstSeen;
	}
	public void setEmail2DateFirstSeen(String email2DateFirstSeen) {
		if (StringUtils.isBlank(email2DateFirstSeen)) {
			Email2DateFirstSeen = "null";
		}
		else {
			Email2DateFirstSeen = email2DateFirstSeen.trim();
		}
	}
	public String getEmail2DateLastSeen() {
		return Email2DateLastSeen;
	}
	public void setEmail2DateLastSeen(String email2DateLastSeen) {
		if (StringUtils.isBlank(email2DateLastSeen)) {
			Email2DateLastSeen = "null";
		}
		else {
			Email2DateLastSeen = email2DateLastSeen.trim();
		}
	}
	public String getEmail2Status() {
		return Email2Status;
	}
	public void setEmail2Status(String email2Status) {
		if (StringUtils.isBlank(email2Status)) {
			Email2Status = "null";
		}
		else {
			Email2Status = email2Status.trim();
		}
	}
	public String getEmail2AdditionalStatusInfo() {
		return Email2AdditionalStatusInfo;
	}
	public void setEmail2AdditionalStatusInfo(String email2AdditionalStatusInfo) {
		if (StringUtils.isBlank(email2AdditionalStatusInfo)) {
			Email2AdditionalStatusInfo = "null";
		}
		else {
			Email2AdditionalStatusInfo = email2AdditionalStatusInfo.trim();
		}
	}
	public String getEmail3DateFirstSeen() {
		return Email3DateFirstSeen;
	}
	public void setEmail3DateFirstSeen(String email3DateFirstSeen) {
		if (StringUtils.isBlank(email3DateFirstSeen)) {
			Name = "null";
		}
		else {
			Name = email3DateFirstSeen.trim();
		}
	}
	public String getEmail3DateLastSeen() {
		return Email3DateLastSeen;
	}
	public void setEmail3DateLastSeen(String email3DateLastSeen) {
		if (StringUtils.isBlank(email3DateLastSeen)) {
			Email3DateLastSeen = "null";
		}
		else {
			Email3DateLastSeen = email3DateLastSeen.trim();
		}
	}
	public String getEmail3Status() {
		return Email3Status;
	}
	public void setEmail3Status(String email3Status) {
		if (StringUtils.isBlank(email3Status)) {
			Email3Status = "null";
		}
		else {
			Email3Status = email3Status.trim();
		}
	}
	public String getEmail3AdditionalStatusInfo() {
		return Email3AdditionalStatusInfo;
	}
	
	
	public void setEmail3AdditionalStatusInfo(String email3AdditionalStatusInfo) {
		if (StringUtils.isBlank(email3AdditionalStatusInfo)) {
			Email3AdditionalStatusInfo = "null";
		}
		else {
			Email3AdditionalStatusInfo = email3AdditionalStatusInfo.trim();
		}
	}
	public String getEmail4DateFirstSeen() {
		return Email4DateFirstSeen;
	}
	public void setEmail4DateFirstSeen(String email4DateFirstSeen) {
		if (StringUtils.isBlank(email4DateFirstSeen)) {
			Email4DateFirstSeen = "null";
		}
		else {
			Email4DateFirstSeen = email4DateFirstSeen.trim();
		}
	}
	public String getEmail4DateLastSeen() {
		return Email4DateLastSeen;
	}
	public void setEmail4DateLastSeen(String email4DateLastSeen) {
		if (StringUtils.isBlank(email4DateLastSeen)) {
			Email4DateLastSeen = "null";
		}
		else {
			Email4DateLastSeen = email4DateLastSeen.trim();
		}
	}
	public String getEmail4Status() {
		return Email4Status;
	}
	public void setEmail4Status(String email4Status) {
		if (StringUtils.isBlank(email4Status)) {
			Email4Status = "null";
		}
		else {
			Email4Status = email4Status.trim();
		}
	}
	public String getEmail4AdditionalStatusInfo() {
		return Email4AdditionalStatusInfo;
	}
	public void setEmail4AdditionalStatusInfo(String email4AdditionalStatusInfo) {
		if (StringUtils.isBlank(email4AdditionalStatusInfo)) {
			Email4AdditionalStatusInfo = "null";
		}
		else {
			Email4AdditionalStatusInfo = email4AdditionalStatusInfo.trim();
		}
	}
	public String getEmail5DateFirstSeen() {
		return Email5DateFirstSeen;
	}
	public void setEmail5DateFirstSeen(String email5DateFirstSeen) {
		if (StringUtils.isBlank(email5DateFirstSeen)) {
			Email5DateFirstSeen = "null";
		}
		else {
			Email5DateFirstSeen = email5DateFirstSeen.trim();
		}
	}
	public String getEmail5DateLastSeen() {
		return Email5DateLastSeen;
	}
	public void setEmail5DateLastSeen(String email5DateLastSeen) {
		if (StringUtils.isBlank(email5DateLastSeen)) {
			Email5DateLastSeen = "null";
		}
		else {
			Email5DateLastSeen = email5DateLastSeen.trim();
		}
	}
	public String getEmail5Status() {
		return Email5Status;
	}
	public void setEmail5Status(String email5Status) {
		if (StringUtils.isBlank(email5Status)) {
			Email5Status = "null";
		}
		else {
			Email5Status = email5Status.trim();
		}
	}
	public String getEmail5AdditionalStatusInfo() {
		return Email5AdditionalStatusInfo;
	}
	public void setEmail5AdditionalStatusInfo(String email5AdditionalStatusInfo) {
		if (StringUtils.isBlank(email5AdditionalStatusInfo)) {
			Email5AdditionalStatusInfo = "null";
		}
		else {
			Email5AdditionalStatusInfo = email5AdditionalStatusInfo.trim();
		}
	}
	public String getEmail6DateFirstSeen() {
		return Email6DateFirstSeen;
	}
	public void setEmail6DateFirstSeen(String email6DateFirstSeen) {
		if (StringUtils.isBlank(email6DateFirstSeen)) {
			Email6DateFirstSeen = "null";
		}
		else {
			Email6DateFirstSeen = email6DateFirstSeen.trim();
		}
	}
	public String getEmail6DateLastSeen() {
		return Email6DateLastSeen;
	}
	public void setEmail6DateLastSeen(String email6DateLastSeen) {
		if (StringUtils.isBlank(email6DateLastSeen)) {
			Email6DateLastSeen = "null";
		}
		else {
			Email6DateLastSeen = email6DateLastSeen.trim();
		}
	}
	public String getEmail6Status() {
		return Email6Status;
	}
	public void setEmail6Status(String email6Status) {
		if (StringUtils.isBlank(email6Status)) {
			Email6Status = "null";
		}
		else {
			Email6Status = email6Status.trim();
		}
	}
	public String getEmail6AdditionalStatusInfo() {
		return Email6AdditionalStatusInfo;
	}
	public void setEmail6AdditionalStatusInfo(String email6AdditionalStatusInfo) {
		if (StringUtils.isBlank(email6AdditionalStatusInfo)) {
			Email6AdditionalStatusInfo = "null";
		}
		else {
			Email6AdditionalStatusInfo = email6AdditionalStatusInfo.trim();
		}
	}
	public String getEmail7DateFirstSeen() {
		return Email7DateFirstSeen;
	}
	public void setEmail7DateFirstSeen(String email7DateFirstSeen) {
		if (StringUtils.isBlank(email7DateFirstSeen)) {
			Email7DateFirstSeen = "null";
		}
		else {
			Email7DateFirstSeen = email7DateFirstSeen.trim();
		}
	}
	public String getEmail7DateLastSeen() {
		return Email7DateLastSeen;
	}
	public void setEmail7DateLastSeen(String email7DateLastSeen) {
		if (StringUtils.isBlank(email7DateLastSeen)) {
			Email7DateLastSeen = "null";
		}
		else {
			Email7DateLastSeen = email7DateLastSeen.trim();
		}
	}
	public String getEmail7Status() {
		return Email7Status;
	}
	public void setEmail7Status(String email7Status) {
		if (StringUtils.isBlank(email7Status)) {
			Email7Status = "null";
		}
		else {
			Email7Status = email7Status.trim();
		}
	}
	public String getEmail7AdditionalStatusInfo() {
		return Email7AdditionalStatusInfo;
	}
	public void setEmail7AdditionalStatusInfo(String email7AdditionalStatusInfo) {
		if (StringUtils.isBlank(email7AdditionalStatusInfo)) {
			Email7AdditionalStatusInfo = "null";
		}
		else {
			Email7AdditionalStatusInfo = email7AdditionalStatusInfo.trim();
		}
	}
	public String getEmail8DateFirstSeen() {
		return Email8DateFirstSeen;
	}
	public void setEmail8DateFirstSeen(String email8DateFirstSeen) {
		if (StringUtils.isBlank(email8DateFirstSeen)) {
			Gender1 = "null";
		}
		else {
			Gender1 = email8DateFirstSeen.trim();
		}
	}
	public String getEmail8DateLastSeen() {
		return Email8DateLastSeen;
	}
	public void setEmail8DateLastSeen(String email8DateLastSeen) {
		if (StringUtils.isBlank(email8DateLastSeen)) {
			Email8DateLastSeen = "null";
		}
		else {
			Email8DateLastSeen = email8DateLastSeen.trim();
		}
	}
	public String getEmail8Status() {
		return Email8Status;
	}
	public void setEmail8Status(String email8Status) {
		if (StringUtils.isBlank(email8Status)) {
			Email8Status = "null";
		}
		else {
			Email8Status = email8Status.trim();
		};
	}
	public String getEmail8AdditionalStatusInfo() {
		return Email8AdditionalStatusInfo;
	}
	public void setEmail8AdditionalStatusInfo(String email8AdditionalStatusInfo) {
		if (StringUtils.isBlank(email8AdditionalStatusInfo)) {
			Email8AdditionalStatusInfo = "null";
		}
		else {
			Email8AdditionalStatusInfo = email8AdditionalStatusInfo.trim();
		}
	}
	public String getEmail9DateFirstSeen() {
		return Email9DateFirstSeen;
	}
	public void setEmail9DateFirstSeen(String email9DateFirstSeen) {
		if (StringUtils.isBlank(email9DateFirstSeen)) {
			Email9DateFirstSeen = "null";
		}
		else {
			Email9DateFirstSeen = email9DateFirstSeen.trim();
		}
	}
	public String getEmail9DateLastSeen() {
		return Email9DateLastSeen;
	}
	public void setEmail9DateLastSeen(String email9DateLastSeen) {
		if (StringUtils.isBlank(email9DateLastSeen)) {
			Email9DateLastSeen = "null";
		}
		else {
			Email9DateLastSeen = email9DateLastSeen.trim();
		}
	}
	public String getEmail9Status() {
		return Email9Status;
	}
	public void setEmail9Status(String email9Status) {
		if (StringUtils.isBlank(email9Status)) {
			Email9Status = "null";
		}
		else {
			Email9Status = email9Status.trim();
		}
	}
	public String getEmail9AdditionalStatusInfo() {
		return Email9AdditionalStatusInfo;
	}
	public void setEmail9AdditionalStatusInfo(String email9AdditionalStatusInfo) {
		if (StringUtils.isBlank(email9AdditionalStatusInfo)) {
			Email9AdditionalStatusInfo = "null";
		}
		else {
			Email9AdditionalStatusInfo = email9AdditionalStatusInfo.trim();
		}
	}
	public String getEmail10DateFirstSeen() {
		return Email10DateFirstSeen;
	}
	public void setEmail10DateFirstSeen(String email10DateFirstSeen) {
		if (StringUtils.isBlank(email10DateFirstSeen)) {
			Email10DateFirstSeen = "null";
		}
		else {
			Email10DateFirstSeen = email10DateFirstSeen.trim();
		}
	}
	public String getEmail10DateLastSeen() {
		return Email10DateLastSeen;
	}
	public void setEmail10DateLastSeen(String email10DateLastSeen) {
		if (StringUtils.isBlank(email10DateLastSeen)) {
			Email10DateLastSeen = "null";
		}
		else {
			Email10DateLastSeen = email10DateLastSeen.trim();
		}
	}
	public String getEmail10Status() {
		return Email10Status;
	}
	public void setEmail10Status(String email10Status) {
		if (StringUtils.isBlank(email10Status)) {
			Email10Status = "null";
		}
		else {
			Email10Status = email10Status.trim();
		}
	}
	public String getEmail10AdditionalStatusInfo() {
		return Email10AdditionalStatusInfo;
	}
	public void setEmail10AdditionalStatusInfo(String email10AdditionalStatusInfo) {
		if (StringUtils.isBlank(email10AdditionalStatusInfo)) {
			Email10AdditionalStatusInfo = "null";
		}
		else {
			Email10AdditionalStatusInfo = email10AdditionalStatusInfo.trim();
		}
	}
	public String getAddressDescriptionCode1() {
		return AddressDescriptionCode1;
	}
	public void setAddressDescriptionCode1(String addressDescriptionCode1) {
		if (StringUtils.isBlank(addressDescriptionCode1)) {
			AddressDescriptionCode1 = "null";
		}
		else {
			AddressDescriptionCode1 = addressDescriptionCode1.trim();
		}
	}
	public String getAddressDescriptionCode2() {
		return AddressDescriptionCode2;
	}
	public void setAddressDescriptionCode2(String addressDescriptionCode2) {
		if (StringUtils.isBlank(addressDescriptionCode2)) {
			AddressDescriptionCode2 = "null";
		}
		else {
			AddressDescriptionCode2 = addressDescriptionCode2.trim();
		}
	}
	public String getAddressDescriptionCode3() {
		return AddressDescriptionCode3;
	}
	public void setAddressDescriptionCode3(String addressDescriptionCode3) {
		if (StringUtils.isBlank(addressDescriptionCode3)) {
			AddressDescriptionCode3 = "null";
		}
		else {
			AddressDescriptionCode3 = addressDescriptionCode3.trim();
		}
	}
	public String getAddressDescriptionCode4() {
		return AddressDescriptionCode4;
	}
	public void setAddressDescriptionCode4(String addressDescriptionCode4) {
		if (StringUtils.isBlank(addressDescriptionCode4)) {
			AddressDescriptionCode4 = "null";
		}
		else {
			AddressDescriptionCode4 = addressDescriptionCode4.trim();
		}
	}
	public String getAddressDescriptionCode5() {
		return AddressDescriptionCode5;
	}
	public void setAddressDescriptionCode5(String addressDescriptionCode5) {
		if (StringUtils.isBlank(addressDescriptionCode5)) {
			AddressDescriptionCode5 = "null";
		}
		else {
			AddressDescriptionCode5 = addressDescriptionCode5.trim();
		}
	}
	public String getAddressDescriptionCode6() {
		return AddressDescriptionCode6;
	}
	public void setAddressDescriptionCode6(String addressDescriptionCode6) {
		if (StringUtils.isBlank(addressDescriptionCode6)) {
			AddressDescriptionCode6 = "null";
		}
		else {
			AddressDescriptionCode6 = addressDescriptionCode6.trim();
		}
	}
	public String getAddressDescriptionCode7() {
		return AddressDescriptionCode7;
	}
	public void setAddressDescriptionCode7(String addressDescriptionCode7) {
		if (StringUtils.isBlank(addressDescriptionCode7)) {
			AddressDescriptionCode7 = "null";
		}
		else {
			AddressDescriptionCode7 = addressDescriptionCode7.trim();
		}
	}
	public String getAddressDescriptionCode8() {
		return AddressDescriptionCode8;
	}
	public void setAddressDescriptionCode8(String addressDescriptionCode8) {
		if (StringUtils.isBlank(addressDescriptionCode8)) {
			AddressDescriptionCode8 = "null";
		}
		else {
			AddressDescriptionCode8 = addressDescriptionCode8.trim();
		}
	}
	public String getAddressDescriptionCode9() {
		return AddressDescriptionCode9;
	}
	public void setAddressDescriptionCode9(String addressDescriptionCode9) {
		if (StringUtils.isBlank(addressDescriptionCode9)) {
			AddressDescriptionCode9 = "null";
		}
		else {
			AddressDescriptionCode9 = addressDescriptionCode9.trim();
		}
	}
	public String getAddressDescriptionCode10() {
		return AddressDescriptionCode10;
	}
	public void setAddressDescriptionCode10(String addressDescriptionCode10) {
		if (StringUtils.isBlank(addressDescriptionCode10)) {
			AddressDescriptionCode10 = "null";
		}
		else {
			AddressDescriptionCode10 = addressDescriptionCode10.trim();
		}
	}
	public String getInputEmailInvalid() {
		return InputEmailInvalid;
	}
	public void setInputEmailInvalid(String inputEmailInvalid) {
		if (StringUtils.isBlank(inputEmailInvalid)) {
			InputEmailInvalid = "null";
		}
		else {
			InputEmailInvalid = inputEmailInvalid.trim();
		}
	}
	public String getInputEmailInvalidReason() {
		return InputEmailInvalidReason;
	}
	public void setInputEmailInvalidReason(String inputEmailInvalidReason) {
		if (StringUtils.isBlank(inputEmailInvalidReason)) {
			InputEmailInvalidReason = "null";
		}
		else {
			InputEmailInvalidReason = inputEmailInvalidReason.trim();
		}
	}
	public String getAuditKey() {
		return AuditKey;
	}
	public void setAuditKey(String auditKey) {
		if (StringUtils.isBlank(auditKey)) {
			AuditKey = "null";
		}
		else {
			AuditKey = auditKey.trim();
		}
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
 

	
	

}

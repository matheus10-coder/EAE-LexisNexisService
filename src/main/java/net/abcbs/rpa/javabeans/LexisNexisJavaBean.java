package net.abcbs.rpa.javabeans;
/***********************************************************************************************************************************************************************
 * @author ABCBS resource
 * 
 * Description: LexisNexisJavaBean class will be used to perform the proper connection with EDW database and query the correct value required by the user 
 * 
 * Project: Lexis Nexis LookUp Phone Number 
 ***********************************************************************************************************************************************************************/

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.logging.log4j.*;

import net.abcbs.eae.jdbc.PropertiesLoader;
import net.abcbs.issh.util.pub.javabeans.IsSharedJavaBean;
import net.abcbs.rpa.dto.LexisNexisDTO;



public class LexisNexisJavaBean extends IsSharedJavaBean {
	private static final String FROM = "FROM";
	private static Logger logger = LogManager.getLogger(LexisNexisJavaBean.class);
	
	PropertiesLoader jdbcprop = new PropertiesLoader();

	
	/*  
	 * 
	 * Method Name: lookUpPhoNum
	 * Method purpose: Run query against edwprd(*) db in order to get result set for RPA bot's 
	 *  
	 *  
	 * */
	public ArrayList<LexisNexisDTO> lookUpPhoNum(String dataSource, String memberId, String newest) {

		this.setDbFunctionSelect(true);
		ArrayList<LexisNexisDTO> arrayList = new ArrayList<>();
	

		        try {
		        	//System.out.println("Connection opened - ClientUser: " + connection.getClientInfo().toString());
					this.initializeConnection(dataSource, "JNDI/");
					sqlStatement.append(" SELECT B.DATA_SOURCE_KEY_STR, A.* ");
					sqlStatement.append(" FROM LEXNEX.KEEP_CONTACT_INBD A, IDS.ORIG_PARTY B ");
					sqlStatement.append(" WHERE  " + "A.MEMBER_ID = B.PARTY_KEY and B.DATA_SOURCE_KEY_STR = ? ");
					//sqlStatement.append(" and B.DATA_SOURCE in ('NULL','01','FP','HA','MI','SS','US')");
					sqlStatement.append(" ORDER BY A.AUDIT_KEY DESC");
					sqlStatement.append( fetchRows(newest) +" WITH UR ");
					
					
					preparedStatement = connection.prepareStatement(sqlStatement.toString());
					preparedStatement.setString(1, memberId);
			
					
					resultSet = preparedStatement.executeQuery();

					while (resultSet.next()) {
						LexisNexisDTO dbRecord = new LexisNexisDTO();
						
						dbRecord.setMemberId(resultSet.getString(1));
						dbRecord.setId(resultSet.getString(2));
						dbRecord.setFirstName(resultSet.getString(3));
						dbRecord.setMidName(resultSet.getString(4));
						dbRecord.setLastName(resultSet.getString(5));
						dbRecord.setAddressLn1(resultSet.getString(6));
						dbRecord.setAddressLn2(resultSet.getString(7));
						dbRecord.setCity(resultSet.getString(8));
						dbRecord.setState(resultSet.getString(9));
						dbRecord.setZip(resultSet.getString(10));
						dbRecord.setDob(resultSet.getString(11));
						dbRecord.setGender(resultSet.getString(12));
						dbRecord.setSsn(resultSet.getString(13));
						dbRecord.setHomePhone(resultSet.getString(14));
						dbRecord.setAltPhone(resultSet.getString(15));
						dbRecord.setArchiveDate(resultSet.getString(16));
						dbRecord.setAdmitDate(resultSet.getString(17));
						dbRecord.setAdmitDiagnosisCode(resultSet.getString(18));
						dbRecord.setFinancialClass(resultSet.getString(19));
						dbRecord.setPatientType(resultSet.getString(20));
						dbRecord.setUdf1(resultSet.getString(21));
						dbRecord.setUdf2(resultSet.getString(22));
						dbRecord.setUdf3(resultSet.getString(23));
						dbRecord.setLob(resultSet.getString(24));
						dbRecord.setLnSearchName(resultSet.getString(25));
						dbRecord.setLnSearchNameType(resultSet.getString(26));
						dbRecord.setLexid(resultSet.getString(27));
						dbRecord.setLexidScore(resultSet.getString(28));
						dbRecord.setGender1(resultSet.getString(29));
						dbRecord.setName(resultSet.getString(30));
						dbRecord.setSsn1(resultSet.getString(31));
						dbRecord.setDateOfBirth(resultSet.getString(32));
						dbRecord.setAddressMatchCodes(resultSet.getString(33)); 
						dbRecord.setAddress(resultSet.getString(34)); 
						dbRecord.setCity1(resultSet.getString(35)); 
						dbRecord.setState1(resultSet.getString(36)); 
						dbRecord.setZip1(resultSet.getString(37));
						dbRecord.setZip4(resultSet.getString(38));
						dbRecord.setCounty(resultSet.getString(39)); 
						dbRecord.setAddressOlderThan90Days(resultSet.getString(40));
						dbRecord.setAddressLastSeenDate(resultSet.getString(41));
						dbRecord.setAddressFirstSeenDate(resultSet.getString(42));
						dbRecord.setAddressLatitude(resultSet.getString(43)); 
						dbRecord.setAddressLongitude(resultSet.getString(44));
						dbRecord.setAddressDeliverable(resultSet.getString(45)); 
						dbRecord.setAddressDeliverableCodes(resultSet.getString(46));
						dbRecord.setTypeOfMove(resultSet.getString(47));
						dbRecord.setMoveCodes(resultSet.getString(48));
						dbRecord.setPossibleNewAddressMatchCodes(resultSet.getString(49));
						dbRecord.setPossibleNewAddress(resultSet.getString(50));
						dbRecord.setPossibleNewCity(resultSet.getString(51));
						dbRecord.setPossibleNewState(resultSet.getString(52));
						dbRecord.setPossibleNewZip(resultSet.getString(53)); 
						dbRecord.setPossibleNewZip4(resultSet.getString(54));
						dbRecord.setPossibleNewCounty(resultSet.getString(55));
						dbRecord.setPossibleNewAddressLastSeenDate(resultSet.getString(56));
						dbRecord.setPossibleNewAddressFirstSeenDate(resultSet.getString(57));
						dbRecord.setPossibleNewLatitude(resultSet.getString(58));
						dbRecord.setPossibleNewLongitude(resultSet.getString(59));
						dbRecord.setNameScore(resultSet.getString(61));
						dbRecord.setSsnScore(resultSet.getString(61));
						dbRecord.setDobScore(resultSet.getString(62));
						dbRecord.setPhone1MatchCodes(resultSet.getString(63));
						dbRecord.setPhone1Number(resultSet.getString(64));
						dbRecord.setPhone1NumberListingName(resultSet.getString(65));
						dbRecord.setPhone1PossibleRelation(resultSet.getString(66));
						dbRecord.setPhone1FirstSeenDate(resultSet.getString(67));
						dbRecord.setPhone1LastSeenDate(resultSet.getString(68));
						dbRecord.setPhone1Type(resultSet.getString(69));
						dbRecord.setPhone1LineType(resultSet.getString(70));
						dbRecord.setPhone1Carrier(resultSet.getString(71));
						dbRecord.setPhone1CarrierCity(resultSet.getString(72));
						dbRecord.setPhone1CarrierState(resultSet.getString(73));
						dbRecord.setPhone1PhoneStatus(resultSet.getString(74));
						dbRecord.setPhone1Score(resultSet.getString(75));
						dbRecord.setPhone2MatchCodes(resultSet.getString(76));
						dbRecord.setPhone2Number(resultSet.getString(77));
						dbRecord.setPhone2NumberListingName(resultSet.getString(78));
						dbRecord.setPhone2PossibleRelation(resultSet.getString(79));
						dbRecord.setPhone2FirstSeenDate(resultSet.getString(80));
						dbRecord.setPhone2LastSeenDate(resultSet.getString(81));
						dbRecord.setPhone2Type(resultSet.getString(82));
						dbRecord.setPhone2LineType(resultSet.getString(83));
						dbRecord.setPhone2Carrier(resultSet.getString(84));
						dbRecord.setPhone2CarrierCity(resultSet.getString(86));
						dbRecord.setPhone2CarrierState(resultSet.getString(86));
						dbRecord.setPhone2Score(resultSet.getString(87));
						dbRecord.setPhone3MatchCodes(resultSet.getString(88));
						dbRecord.setPhone3Number(resultSet.getString(89));
						dbRecord.setPhone3NumberListingName(resultSet.getString(90));
						dbRecord.setPhone3PossibleRelation(resultSet.getString(91));
						dbRecord.setPhone3FirstSeenDate(resultSet.getString(92));
						dbRecord.setPhone3LastSeenDate(resultSet.getString(93));
						dbRecord.setPhone3Type(resultSet.getString(94));
						dbRecord.setPhone3LineType(resultSet.getString(95));
						dbRecord.setPhone3Carrier(resultSet.getString(96));
						dbRecord.setPhone3CarrierCity(resultSet.getString(97));
						dbRecord.setPhone3CarrierState(resultSet.getString(98));
						dbRecord.setPhone3Score(resultSet.getString(99));
						dbRecord.setDateOfDeath(resultSet.getString(100));
						dbRecord.setDeceasedMatchCode(resultSet.getString(101));
						dbRecord.setVerifiedOrProofCode(resultSet.getString(102));
						dbRecord.setDeceasedSource(resultSet.getString(103));
						dbRecord.setCalculatedAge(resultSet.getString(104));
						dbRecord.setEmail1(resultSet.getString(105));
						dbRecord.setEmail2(resultSet.getString(106));
						dbRecord.setEmail3(resultSet.getString(107));
						dbRecord.setEmail4(resultSet.getString(108));
						dbRecord.setEmail5(resultSet.getString(109));
						dbRecord.setEmail6(resultSet.getString(110));
						dbRecord.setEmail7(resultSet.getString(111));
						dbRecord.setEmail8(resultSet.getString(112));
						dbRecord.setEmail9(resultSet.getString(113));
						dbRecord.setEmail10(resultSet.getString(114));
						dbRecord.setEmail1DateFirstSeen(resultSet.getString(115));
						dbRecord.setEmail1DateLastSeen(resultSet.getString(116));
						dbRecord.setEmail1Status(resultSet.getString(117));
						dbRecord.setEmail1AdditionalStatusInfo(resultSet.getString(118));
						dbRecord.setEmail2DateFirstSeen(resultSet.getString(119));
						dbRecord.setEmail2DateLastSeen(resultSet.getString(120));
						dbRecord.setEmail2Status(resultSet.getString(121));
						dbRecord.setEmail2AdditionalStatusInfo(resultSet.getString(122));
						dbRecord.setEmail3DateFirstSeen(resultSet.getString(123));
						dbRecord.setEmail3DateLastSeen(resultSet.getString(124));
						dbRecord.setEmail3Status(resultSet.getString(125));
						dbRecord.setEmail3AdditionalStatusInfo(resultSet.getString(126));
						dbRecord.setEmail4DateFirstSeen(resultSet.getString(127));
						dbRecord.setEmail4DateLastSeen(resultSet.getString(128));
						dbRecord.setEmail4Status(resultSet.getString(129));
						dbRecord.setEmail4AdditionalStatusInfo(resultSet.getString(130));
						dbRecord.setEmail5DateFirstSeen(resultSet.getString(131));
						dbRecord.setEmail5DateLastSeen(resultSet.getString(132));
						dbRecord.setEmail5Status(resultSet.getString(133));
						dbRecord.setEmail5AdditionalStatusInfo(resultSet.getString(134));
						dbRecord.setEmail6DateFirstSeen(resultSet.getString(135));
						dbRecord.setEmail6DateLastSeen(resultSet.getString(136));
						dbRecord.setEmail6Status(resultSet.getString(137));
						dbRecord.setEmail6AdditionalStatusInfo(resultSet.getString(138));
						dbRecord.setEmail7DateFirstSeen(resultSet.getString(139));
						dbRecord.setEmail7DateLastSeen(resultSet.getString(140));
						dbRecord.setEmail7Status(resultSet.getString(141));
						dbRecord.setEmail7AdditionalStatusInfo(resultSet.getString(142));
						dbRecord.setEmail8DateFirstSeen(resultSet.getString(143));
						dbRecord.setEmail8DateLastSeen(resultSet.getString(144));
						dbRecord.setEmail8Status(resultSet.getString(145));
						dbRecord.setEmail8AdditionalStatusInfo(resultSet.getString(146)); 
						dbRecord.setEmail9DateFirstSeen(resultSet.getString(147)); 
						dbRecord.setEmail9DateLastSeen(resultSet.getString(148)); 
						dbRecord.setEmail9Status(resultSet.getString(149)); 
						dbRecord.setEmail9AdditionalStatusInfo(resultSet.getString(150)); 
						dbRecord.setEmail10DateFirstSeen(resultSet.getString(151)); 
						dbRecord.setEmail10DateLastSeen(resultSet.getString(152)); 
						dbRecord.setEmail10Status(resultSet.getString(153)); 
						dbRecord.setEmail10AdditionalStatusInfo(resultSet.getString(154)); 
						dbRecord.setAddressDescriptionCode1(resultSet.getString(155)); 
						dbRecord.setAddressDescriptionCode2(resultSet.getString(156)); 
						dbRecord.setAddressDescriptionCode3(resultSet.getString(157)); 
						dbRecord.setAddressDescriptionCode4(resultSet.getString(158)); 
						dbRecord.setAddressDescriptionCode5(resultSet.getString(159)); 
						dbRecord.setAddressDescriptionCode6(resultSet.getString(160)); 
						dbRecord.setAddressDescriptionCode7(resultSet.getString(161)); 
						dbRecord.setAddressDescriptionCode8(resultSet.getString(162)); 
						dbRecord.setAddressDescriptionCode9(resultSet.getString(163)); 
						dbRecord.setAddressDescriptionCode10(resultSet.getString(164)); 
						dbRecord.setInputEmailInvalid(resultSet.getString(165)); 
						dbRecord.setInputEmailInvalidReason(resultSet.getString(166)); 
						dbRecord.setAuditKey(resultSet.getString(167)); 
						
						
					 
						arrayList.add(dbRecord);
					}
					//connection.close();
					 
				}
				catch (SQLException se) {
					this.processException(se);
				}
				catch (Exception e) {
					this.processException(e);
				}
				finally {
					displayResults();
					System.out.println("Connection successfully closed");
					this.closeConnections();
				}
				

		    return arrayList;
	}
	
	
	private String fetchRows(String newest) {
		if (newest.toLowerCase().contains("newest")) {
			return " FETCH FIRST 1 ROWS ONLY ";
		}
		else {
			return "";
		}
		
	}


	public List<LexisNexisDTO> exceptionInterPlanMessage (){
		ArrayList<LexisNexisDTO> arrayList = new ArrayList<>();
	
		LexisNexisDTO errorMessage = new LexisNexisDTO();
		
		errorMessage.setError("\"Error processing current request\"");
		
		
		arrayList.add(errorMessage);
		return arrayList;
	}
	
	
	
	

}



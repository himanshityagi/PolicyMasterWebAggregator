package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import study.db.Db;

public class main {
	private String strVehicleCode;
	
	public static void main(String[] args) throws IOException, ParseException {
		
		//apollo_proposal_pojo app = (apollo_proposal_pojo) session.getAttribute("app");
				//String fullname = app.getFullname();
				String fullname = "Elle Hur";

				String inputRequest = "self(30),spouse(28),son(2),daughter(12),daughter1(15),daughter2(17)";
				Map<String, String> membersAgeMap = new HashMap<>();
				List<String> members = Arrays.asList(inputRequest.split(","));
				
				
				
				membersAgeMap.put("spouseFirstName", fullname.substring(0, fullname.indexOf(" ")));
				membersAgeMap.put("spouseLastName", fullname.substring(fullname.indexOf(" ")+1));
				for(Entry<String, String> memberEntry : membersAgeMap.entrySet()) {
					memberEntry.getKey();
					memberEntry.getValue();
					System.out.println("==========================");
					System.out.println(memberEntry.getKey());
					System.out.println("============================================================");
					System.out.println(memberEntry.getValue());
				}
	
		/*Integer age_self=Integer.parseInt(hm.get("age_self"));
		if(age_self>18 || age_self<35) {*/
			//productSubElem.setSumAssured("300000");
		//}
		/*String datestr="17-10-1994";
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();  
		 Date utilDate1 = formatter.parse(datestr);
		 String PolicyFromDt=formatter.format(utilDate1);
		 Calendar c = Calendar.getInstance();
		
		    c.setTime(utilDate1);
		    c.add(Calendar.DAY_OF_MONTH, 1825);//1095 1825
		    Date end=c.getTime();
		    String PolicyToDt=formatter.format(end);
		    System.out.println(PolicyFromDt);
		    System.out.println(PolicyToDt);*/
		/*List<ProdMasters> pm=Poiji.fromExcel(new File("E://API//Shriram//MASTER KITS/Prod Masters.xls"), ProdMasters.class);
		Integer=pm.size();
		//System.out.println(a);
		ProdMasters pm1=pm.get(0);
		//System.out.println(pm1.getProdcode());
		//System.out.println(pm1.getProddesc());
		String[] s=pm1.toString().split(",");
		System.out.println(s[0]);
		System.out.println(s[1]);
		//System.out.println(s);
		//System.out.println(pm.get(1).toString());
		 * */	
		/*String fileName = "E://API//Shriram//MASTER KITS/TWO_WHEELER_TEST_MASTER_19_05_2018.xls";
        String cellContent = "DREAM YUGA ELECTRIC START ALLOY";
        
        InputStream input = new FileInputStream(fileName);
        
        HSSFWorkbook wb = new HSSFWorkbook(input);
        HSSFSheet sheet = wb.getSheetAt(0);
        String a=abc(sheet, cellContent);
        System.out.println(a);*/
	}
	public String BikeIDV(String Bike_RegNo,String Varient) {
		String idv=null;
		try {
			Connection con=Db.myGetConnection();
			if(Bike_RegNo.equals("2017")) {
				String query="select idv_1_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_1_yr");
					System.out.println("bike_idv_1_yr: "+idv);
				}
				return idv;
			}
			else if(Bike_RegNo.equals("2016")) {
				String query="select idv_2_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_2_yr");
					System.out.println("bike_idv_2_yr: "+idv);
				}
				return idv;
			}
			else if(Bike_RegNo.equals("2015")) {
				String query="select idv_3_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_3_yr");
					System.out.println("bike_idv_3_yr: "+idv);
				}
				return idv;
			}
			else if(Bike_RegNo.equals("2014")) {
				String query="select idv_4_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_4_yr");
					System.out.println("bike_idv_4_yr: "+idv);
				}
				return idv;
			}
			else if(Bike_RegNo.equals("2013")) {
				String query="select idv_5_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_5_yr");
					System.out.println("bike_idv_5_yr: "+idv);
				}
				return idv;
			}
			else {
				idv="";
				return idv;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return idv;
	}
	public String IDV(String RegYear,String Varient,String strInsuredState) {
		String idv=null;
		try {
			Connection con=Db.myGetConnection();
			if(RegYear.equals("2017")) {
				String query="select idv_1_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_1_yr");
					System.out.println("idv_1_yr: "+idv);
				}
				return idv;
			}
			else if(RegYear.equals("2016")) {
				String query="select idv_2_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_2_yr");
					System.out.println("idv_2_yr: "+idv);
				}
				return idv;
			}
			else if(RegYear.equals("2015")) {
				String query="select idv_3_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_3_yr");
					System.out.println("idv_3_yr: "+idv);
				}
				return idv;
			}
			else if(RegYear.equals("2014")) {
				String query="select idv_4_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_4_yr");
					System.out.println("idv_4_yr: "+idv);
				}
				return idv;
			}
			else if(RegYear.equals("2013")) {
				String query="select idv_5_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_5_yr");
					System.out.println("idv_5_yr: "+idv);
				}
				return idv;
			}
			else {
				idv="";
				return idv;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return idv;
	}
	public String ifModel(String Varient,String FuelType,String strInsuredState) {
		String vehicle_code = null;
		try {
			Connection con=Db.myGetConnection();
			String query1 = "select vehicle_code from shriram_vehicle_master where model_desc=? && fuel_desc=? && gic_state=?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, Varient);
			stmt.setString(2, FuelType);
			stmt.setString(3, strInsuredState);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				vehicle_code= rs.getString("vehicle_code");
				System.out.println("vehicle_code: "+vehicle_code);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return vehicle_code;
		
	}
	public String ifByke(String Variant) {
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select vehicle_code from shriram_vehicle_master where model_desc=?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, Variant);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String vehicle_code = rs.getString("vehicle_code");
				holdgetValue=vehicle_code;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			return null;
		}
		else
		{
			return holdgetValue;	
		}
		
	}
	public String[] ifRegyr(String Regyr,String Claim) {
		String g[]=new String[7];
		if(Regyr.equals("Brandnew")) {
			
	    	    g[0]="MOT-PRD-001";
	    	    g[1]="FRESH";
	    	    g[2]="ADDON_01";
	    	    g[3]="Brandnew";
	    	    g[4]="0";
	    	    g[5]="0";
	    	    g[6]="W";
	    	return g;    
		}
		else {
    	    g[0]="MOT-PRD-001";
    	    g[1]="RENEWAL OF OTHERS";
    	    g[2]="ADDON_01";
    	    g[3]=Regyr;
    	    //should be changed
    	    if(Claim.equals("YES")) {
    	    	g[4]="1";
    	    	g[5]="0";
    	    }else {
    	    	g[4]="0";
    	    	g[5]=Claim;
    	    }
    	    g[6]="U";
    	   return g; 
		}
		
	}
	public String[] ifBykeRegyr(String Regyr,String Claim) {
		String g[]=new String[7];
		if(Regyr.equals("Brandnew")) {
	    	    g[0]="MOT-PRD-002";
	    	    g[1]="FRESH";
	    	    g[2]="ADDON_01";
	    	    g[3]="Brandnew";
	    	    g[4]="0";
	    	    g[5]="0";
	    	    g[6]="W";
	    	return g;    
		}
		else {
    	    g[0]="MOT-PRD-002";
    	    g[1]="RENEWAL OF OTHERS";
    	    g[2]="ADDON_01";
    	    g[3]=Regyr;
    	    g[4]="1";
    	    if(Claim.equals("YES")) {
    	    	g[4]="1";
    	    	g[5]="0";
    	    }else {
    	    	g[4]="1";
    	    	g[5]=Claim;
    	    }
    	    g[6]="U";
    	   return g; 
		}
		
	}

	public String[] Title(String prefix) {
		if(prefix.equals("Mr.")) {
			String g[]=new String[2];
			g[0]="1";
			g[1]="M";
			
			return g;
		}
		else if(prefix.equals("Mrs.")) {
			String g[]=new String[2];
			g[0]="2";
			g[1]="F";
			
			return g;
		}
		else if(prefix.equals("Miss.")) {
			String g[]=new String[2];
			g[0]="4";
			g[1]="F";
			
			return g;
		}
		return null;
		
	}
	public String city(String RTOCODE) {
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select RTOCITY from shriram_rtomaster where RTOCODE= ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, RTOCODE);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String RTOCITY = rs.getString("RTOCITY");
				holdgetValue=RTOCITY;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
		
		
	}
	public String state(String RTOCODE) {
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select RTOSTATE from shriram_rtomaster where RTOCODE= ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, RTOCODE);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String RTOSTATE = rs.getString("RTOSTATE");
				holdgetValue=RTOSTATE;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
		
		
	}
	public String insurer(String insurer) {
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select CC_DESC from shriram_insurer where CC_DESC like ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, insurer+"%");
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String CC_DESC = rs.getString("CC_DESC");
				holdgetValue=CC_DESC;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
	}
	/*Liberty Start*/
	public String[] libModel(String Bike_Model) {
			if(Bike_Model.equals("DISCOVER")) {
				String lib[]=new String[2];
	    	    lib[0]="1061";
	    	    lib[1]="31000095";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("PASSION XPRO")) {
				String lib[]=new String[2];
	    	    lib[0]="2509";
	    	    lib[1]="25172";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("SPLENDOR")) {
				String lib[]=new String[2];
	    	    lib[0]="2509";
	    	    lib[1]="25113";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("ACTIVA")) {
				String lib[]=new String[2];
	    	    lib[0]="1056";
	    	    lib[1]="31000066";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("CB UNICORN")) {
				String lib[]=new String[2];
	    	    lib[0]="1056";
	    	    lib[1]="31000103";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("SHINE")) {
				String lib[]=new String[2];
	    	    lib[0]="1056";
	    	    lib[1]="31000050";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("BULLET")) {
				String lib[]=new String[2];
	    	    lib[0]="1062";
	    	    lib[1]="31000085";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("CLASSIC")) {
				String lib[]=new String[2];
	    	    lib[0]="1062";
	    	    lib[1]="31000073";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("APACHE")) {
				String lib[]=new String[2];
	    	    lib[0]="1069";
	    	    lib[1]="31000129";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("FAZER")) {
				String lib[]=new String[2];
	    	    lib[0]="1072";
	    	    lib[1]="31000145";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("FZS")) {
				String lib[]=new String[2];
	    	    lib[0]="1072";
	    	    lib[1]="31000188";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("GLADIATOR")) {
				String lib[]=new String[2];
	    	    lib[0]="1072";
	    	    lib[1]="31000179";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("LIBERO")) {
				String lib[]=new String[2];
	    	    lib[0]="1072";
	    	    lib[1]="31000178";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("CD DELUXE")) {
				String lib[]=new String[2];
	    	    lib[0]="1068";
	    	    lib[1]="31000146";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("RODEO")) {
				String lib[]=new String[2];
	    	    lib[0]="2502";
	    	    lib[1]="31000142";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("CENTURO")) {
				String lib[]=new String[2];
	    	    lib[0]="2502";
	    	    lib[1]="31000149";
	    	    
			return lib;
			}
			else {
				String lib[]=new String[2];
				 	lib[0]="";
		    	    lib[1]="";
				return lib;
			}
		}


	public String[] libCarModel(String Model) {
		String libcar[]=new String[2];
		if(Model.equals("SWIFT")) {
			
			libcar[0]="2405";
			libcar[1]="32001272";
			
		return libcar;
		}
		else if(Model.equals("CROSS POLO")) {
			
			libcar[0]="1011";
			libcar[1]="32001297";
			
		return libcar;
		}
		else if(Model.equals("PUNTO")) {
			
			libcar[0]="1021";
			libcar[1]="32000881";
			
		return libcar;
		}
		else if(Model.equals("WAGON R")) {
			
			libcar[0]="2405";
			libcar[1]="32001089";
			
		return libcar;
		}

		else {
			libcar[0]="";
			libcar[1]="";
			return libcar;
		}
	}

	public String[] Salutation(String prefix) {
		if(prefix.equals("Mr.")) {
			String g[]=new String[1];
			g[0]="MR";
			
			return g;
		}
		else if(prefix.equals("Mrs.")) {
			String g[]=new String[1];
			g[0]="MRS";
			
			return g;
		}
		else if(prefix.equals("Miss.")) {
			String g[]=new String[2];
			g[0]="MISS";
			
			return g;
		}
		return null;
		
	}
	/*Liberty End*/
	
	/*RoyalSundaram*/
	public String ifModel1(String Varient,String FuelType) {
		System.out.println("Varient ghghj"+Varient);
		System.out.println("FuelType is"+FuelType);
		String ModelCode = null;
		try {
			Connection con=Db.myGetConnection();
			String query1 = "select ModelCode from royalsundram where ModelName=? AND FuelType=?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, Varient);
			stmt.setString(2, FuelType);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				ModelCode= rs.getString("ModelCode");
				System.out.println("hello ModelCode");
				System.out.println("ModelCode: "+ModelCode);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return ModelCode;
		
	}
	
	public  String ifModel2(String Bike_Model) {
		System.out.println("hello0000" +Bike_Model);
		
		String ModelCode = null;
		System.out.println("hello");
		try {
			Connection con=Db.myGetConnection();
			String query1 = "select ModelCode from bikeroyal where ModelName=? AND FuelType='petrol' ";
			PreparedStatement stmt1 = con.prepareStatement(query1);
			stmt1.setString(1, Bike_Model);
			
			ResultSet rs=stmt1.executeQuery();
			while (rs.next()) {
				ModelCode= rs.getString("ModelCode");
				System.out.println("hello ModelCode");
				System.out.println("ModelCode: "+ModelCode);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return ModelCode;
		
	}
	public String Royalcity(String royalRtoCode) {
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select RTOCITY from shriram_rtomaster where RTOCODE= ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, royalRtoCode);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String RTOCITY = rs.getString("RTOCITY");
			
				holdgetValue=RTOCITY;
			
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
		
		
	}
	
	/*RoyalSundaram Code End*/
	
	//Religare
	
	public String[] TitleReligare(String title) {
		if(title.equals("Mr.")) {
			String g[]=new String[2];
			g[0]="MR";
			g[1]="MALE";
			
			return g;
		}
		else if(title.equals("Mrs.")) {
			String g[]=new String[2];
			g[0]="MS";
			g[1]="FEMALE";
			
			return g;
		}
		else if(title.equals("Miss.")) {
			String g[]=new String[2];
			g[0]="MS";
			g[1]="FEMALE";
			
			return g;
		}
		return null;
		
	}
	//---------------------apollo----------------------
	
	
		public static String[] Titleapollo(String salutation) {
			if (salutation.equals("Mr.")) {
				String g[] = new String[2];
				g[0] = "MR";
				g[1] = "1";

				return g;
			} else if (salutation.equals("Mrs.")) {
				String g[] = new String[2];
				g[0] = "MRS";
				g[1] = "2";

				return g;
			} else if (salutation.equals("Miss.")) {
				String g[] = new String[2];
				g[0] = "MISS";
				g[1] = "2";

				return g;
			} else if (salutation.equals("master.")) {
				String g[] = new String[2];
				g[0] = "MASTER";
				g[1] = "1";

				return g;
			}

			else if (salutation.equals("babygirl.")) {
				String g[] = new String[2];
				g[0] = "BABYGIRL";
				g[1] = "2";

				return g;
			} else if (salutation.equals("babyboy.")) {
				String g[] = new String[2];
				g[0] = "BABYBOY";
				g[1] = "1";

				return g;
			}
	
			return null;

		}
		public String State(String city) {
			System.out.println("city :" +city);
			String holdgetValue=null;
			try {
				Connection con=Db.myGetConnection();
				//String name="KINE";
				String query1 = "select state_one_code from apollo_master where city= ?";
				PreparedStatement stmt = con.prepareStatement(query1);
				stmt.setString(1, city);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					String state_one_code = rs.getString("state_one_code");
					holdgetValue=state_one_code;
					
				}
				System.out.println("city " +holdgetValue);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(holdgetValue.isEmpty())
			{
				return null;
			}
			else
			{
				return holdgetValue;	
			}
			
			
		}
		
		public String town(String city) {
			String holdgetValue=null;
			try {
				Connection con=Db.myGetConnection();
				//String name="KINE";
				String query1 = "select city_code from apollo_master where city= ?";
				PreparedStatement stmt = con.prepareStatement(query1);
				stmt.setString(1, city );
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					String city_code = rs.getString("city_code");
					holdgetValue=city_code;
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(holdgetValue.isEmpty())
			{
				return null;
			}
			else
			{
				return holdgetValue;	
			}
			
			
		}
		public String nomineerelation(String nomrelation) {
			String holdgetValue=null;
			try {
				Connection con=Db.myGetConnection();
				//String name="KINE";
				String query1 = "select relationship_code from apollo_master where relationship= ?";
				PreparedStatement stmt = con.prepareStatement(query1);
				stmt.setString(1, nomrelation );
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					String relationship_code = rs.getString("relationship_code");
					holdgetValue=relationship_code;
					System.out.println(holdgetValue);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(holdgetValue.isEmpty())
			{
				return null;
			}
			else
			{
				return holdgetValue;	
			}
			
			
		}
		
		
		public String occupation(String occupation) {
			String holdgetValue=null;
			try {
				Connection con=Db.myGetConnection();
				//String name="KINE";
				String query1 = "select occupation_code from apollo_master where occupation= ?";
				PreparedStatement stmt = con.prepareStatement(query1);
				stmt.setString(1, occupation );
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					String occupation_code = rs.getString("occupation_code");
					holdgetValue=occupation_code;
					System.out.println(holdgetValue);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(holdgetValue.isEmpty())
			{
				return null;
			}
			else
			{
				return holdgetValue;	
			}
			
			
		}
		
		public String[] religare_disease(String disease) {
			String [] diseases=new String[3];
			if(disease.equals("asthma,")) {
				diseases[0]="H105";
				diseases[1]="HEDCFLEAFFOUR";
				diseases[2]="YES";
				return diseases;
			}
			else if(disease.equals("diabetes,")) {
				diseases[0]="H107";
				diseases[1]="HEDCFLEAFSIX";
				diseases[2]="YES";
				return diseases;
			}
			else if(disease.equals("heartailments,")) {
				diseases[0]="H103";
				diseases[1]="HEDCFLEAFTWO";
				diseases[2]="YES";
				return diseases;
			}
			else if(disease.equals("hypertension,")) {
				diseases[0]="H104";
				diseases[1]="HEDCFLEAFTHREE";
				diseases[2]="YES";
				return diseases;
			}
			else if(disease.equals("thyroid,")) {
				diseases[0]="H106";
				diseases[1]="HEDCFLEAFFIVE";
				diseases[2]="YES";
				return diseases;
			} else {
				diseases[0]="";
				diseases[1]="";
				diseases[2]="";
				return diseases;
			}
			
		}
		public Map<String,String>apolloMembers(String inputRequest){
			Map<String, String> membersAgeMap = new HashMap<>();
			List<String> members = Arrays.asList(inputRequest.split(","));
			
			for(String member : members) {
				membersAgeMap.put(member.substring(0, member.indexOf("(")), member.substring(member.indexOf("(")+1, member.indexOf(")")));
			}
			
			for(Entry<String, String> memberEntry : membersAgeMap.entrySet()) {
				memberEntry.getKey();
				memberEntry.getValue();
			}
			return membersAgeMap;
		}
		public Map<String,String>religareMembers(String member){
			
			
			Map< String,String> hm = new HashMap<>();
			try {
			String z=member.concat(",");
			String b[]=z.split("\\(");
			String c[]=b[1].split("\\)");
			String cover_type=null;
			
			hm.put("member_self", b[0]);
			hm.put("age_self", c[0]);
			
				if(c[1].equals(", spouse")) {
					String d[]=b[2].split("\\)");
					String e[]=c[1].split(",");
					
					cover_type="FAMILYFLOATER";
					
					hm.put("member_spouse", e[1]);
					hm.put("age_spouse", d[0]);
					
					 if(d[1].equals(", son")) {
                         String f[]=d[1].split(",");
                         String g[]=b[3].split("\\)");
                         
                         hm.put("member_son", f[1]);
                         hm.put("age_son", g[0]);
                         
                         if(g[1].equals(", daughter")) {
                                 String h[]=g[1].split(",");
                                 String i[]=b[4].split("\\)");
                                 
                                 hm.put("member_daughter", h[1]);
                                 hm.put("age_daughter", i[0]);
                         }
                 }
				}
				else {
					cover_type="INDIVIDUAL";
				}
				hm.put("cover_type", cover_type);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			return hm;
		}
	
		
		
		
		

	//----------------------------------------------
	}

	
	
	
	
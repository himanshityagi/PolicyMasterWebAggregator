package Royal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)

public class LIABILITY {
 private String BASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD;
 private String BI_FUEL_KIT_CN;
 private String PERSONAL_ACCIDENT_BENEFIT;
 private String UNDER_SECTION_III_OWNER_DRIVER;
 private String UNNAMED_PASSENGRS;
 private String PA_COVER_TO_PAID_DRIVER;
 private String TO_PAID_DRIVERS;
 private String TO_EMPLOYESES;
 private String TOTAL_LIABILITY_PREMIUM;
public String getBASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD() {
	return BASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD;
}
      
public void setBASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD(String bASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD) {
	BASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD = bASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD;
}
public String getBI_FUEL_KIT_CN() {
	return BI_FUEL_KIT_CN;
}
      
public void setBI_FUEL_KIT_CN(String bI_FUEL_KIT_CN) {
	BI_FUEL_KIT_CN = bI_FUEL_KIT_CN;
}
public String getPERSONAL_ACCIDENT_BENEFIT() {
	return PERSONAL_ACCIDENT_BENEFIT;
}
      
public void setPERSONAL_ACCIDENT_BENEFIT(String pERSONAL_ACCIDENT_BENEFIT) {
	PERSONAL_ACCIDENT_BENEFIT = pERSONAL_ACCIDENT_BENEFIT;
}
public String getUNDER_SECTION_III_OWNER_DRIVER() {
	return UNDER_SECTION_III_OWNER_DRIVER;
}
      
public void setUNDER_SECTION_III_OWNER_DRIVER(String uNDER_SECTION_III_OWNER_DRIVER) {
	UNDER_SECTION_III_OWNER_DRIVER = uNDER_SECTION_III_OWNER_DRIVER;
}
public String getUNNAMED_PASSENGRS() {
	return UNNAMED_PASSENGRS;
}
      
public void setUNNAMED_PASSENGRS(String uNNAMED_PASSENGRS) {
	UNNAMED_PASSENGRS = uNNAMED_PASSENGRS;
}
public String getPA_COVER_TO_PAID_DRIVER() {
	return PA_COVER_TO_PAID_DRIVER;
}
      
public void setPA_COVER_TO_PAID_DRIVER(String pA_COVER_TO_PAID_DRIVER) {
	PA_COVER_TO_PAID_DRIVER = pA_COVER_TO_PAID_DRIVER;
}
public String getTO_PAID_DRIVERS() {
	return TO_PAID_DRIVERS;
}
      
public void setTO_PAID_DRIVERS(String tO_PAID_DRIVERS) {
	TO_PAID_DRIVERS = tO_PAID_DRIVERS;
}
public String getTO_EMPLOYESES() {
	return TO_EMPLOYESES;
}
      
public void setTO_EMPLOYESES(String tO_EMPLOYESES) {
	TO_EMPLOYESES = tO_EMPLOYESES;
}
public String getTOTAL_LIABILITY_PREMIUM() {
	return TOTAL_LIABILITY_PREMIUM;
}
      
public void setTOTAL_LIABILITY_PREMIUM(String tOTAL_LIABILITY_PREMIUM) {
	TOTAL_LIABILITY_PREMIUM = tOTAL_LIABILITY_PREMIUM;
}
@Override
public String toString() {
	return "LIABILITY [BASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD=" + BASIC_PREMIUM_INCLUDING_PREMIUM_FOR_TPPD
			+ ", BI_FUEL_KIT_CN=" + BI_FUEL_KIT_CN + ", PERSONAL_ACCIDENT_BENEFIT=" + PERSONAL_ACCIDENT_BENEFIT
			+ ", UNDER_SECTION_III_OWNER_DRIVER=" + UNDER_SECTION_III_OWNER_DRIVER + ", UNNAMED_PASSENGRS="
			+ UNNAMED_PASSENGRS + ", PA_COVER_TO_PAID_DRIVER=" + PA_COVER_TO_PAID_DRIVER + ", TO_PAID_DRIVERS="
			+ TO_PAID_DRIVERS + ", TO_EMPLOYESES=" + TO_EMPLOYESES + ", TOTAL_LIABILITY_PREMIUM="
			+ TOTAL_LIABILITY_PREMIUM + "]";
}
 
}

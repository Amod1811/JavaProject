package hospitalmanegmentsystem;

public class HospitalMService {
	int patientId;
	String pname;
	int age;
	String doctorName;
	String dSpecialist;
	String dFess;
	public HospitalMService(int patientId, String pname, int age, String doctorName, String dSpecialist, String dFess) {
		super();
		this.patientId = patientId;
		this.pname = pname;
		this.age = age;
		this.doctorName = doctorName;
		this.dSpecialist = dSpecialist;
		this.dFess = dFess;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getdSpecialist() {
		return dSpecialist;
	}
	public void setdSpecialist(String dSpecialist) {
		this.dSpecialist = dSpecialist;
	}
	public String getdFess() {
		return dFess;
	}
	public void setdFess(String dFess) {
		this.dFess = dFess;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", pname=" + pname + ", age=" + age + ", doctorName=" + doctorName
				+ ", dSpecialist=" + dSpecialist + ", dFess=" + dFess + "]";
	}
	
}

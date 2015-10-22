package abstraction;
/**
 * @file_name  : SmartPhone.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 1.
 * @story      :
 */
public class SmartPhone extends Product {
	protected String camera, weight;

	
	public void setSmartPhoneInfo(String company, String name, String serialNo, String camera, String weight) {
		super.setProductInfo(company, name, serialNo);
		this.camera = camera;
		this.weight = weight;
	}
	@Override
	public String display() {
		return "제조회사 : "+super.company+ "\n"
				+ "제품명 : "+super.name+"\n "
				+ "고유번호 : "+super.serialNo+"\n "
				+ "카메라 : "+this.camera+"\n "
				+ "무  게 : "+this.weight+"\n ";
	}

}

package interfaceProPublic;

public class booksVO {

	private String name;//����
	private int num;//�鼮����
	private boolean status = true;//�鼮״̬
	private String ID;//�鼮id
	private String dayDate;//�鼮����ʱ��

	public booksVO(String name, int num, boolean status, String iD, String dayDate) {
		super();
		this.name = name;
		this.num = num;
		this.status = status;
		ID = iD;
		this.dayDate = dayDate;
	}

	public booksVO() {
		// TODO Auto-generated constructor stub
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDayDate() {
		return dayDate;
	}

	public void setDayDate(String dayDate) {
		this.dayDate = dayDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		String a = "��ǰ�ɽ�";
		if (status == false) {
			a = "�ݲ��ɽ�";
		}
		// TODO Auto-generated method stub
		// "ID"+"\t"+"�鼮����"+"\t"+"�鼮����"+"\t"+"�鼮״̬"+"\t"+"�鼮�������"+"\n"+
		return ID + "\t" + name + "\t" + "" + num + "\t" + a + "\t" + getDayDate();
	}
}

package interfaceProPublic;

public class booksVO {

	private String name;//书名
	private int num;//书籍数量
	private boolean status = true;//书籍状态
	private String ID;//书籍id
	private String dayDate;//书籍存入时间

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
		String a = "当前可借";
		if (status == false) {
			a = "暂不可借";
		}
		// TODO Auto-generated method stub
		// "ID"+"\t"+"书籍名称"+"\t"+"书籍数量"+"\t"+"书籍状态"+"\t"+"书籍添加日期"+"\n"+
		return ID + "\t" + name + "\t" + "" + num + "\t" + a + "\t" + getDayDate();
	}
}

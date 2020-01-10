package interfaceProPrivate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import interfaceProPublic.booksVO;
import interfaceProPublic.booksVOInterface;

public class booksVOEntry implements booksVOInterface {

	private static final booksVO NULL = null;
//	private static final library.books NULL = null;
	private static Scanner scanner = new Scanner(System.in);
	private static booksVO[] books = new booksVO[20];

	public void a() {
		// 给数组中添加一个初始化的值
		booksVO b1 = new booksVO();
		b1.setID("001");
		b1.setName("墨菲定律");
		b1.setNum(5);
		b1.setStatus(true);
		b1.setDayDate("2019-09-28 10:28:10");
		for (int j = 0; j < books.length; j++) {
			if (books[j] == null) {
				books[j] = b1;
				break;
			}
		}
		booksVO b2 = new booksVO();
		b2.setID("002");
		b2.setName("鬼谷子");
		b2.setNum(5);
		b2.setStatus(true);
		b2.setDayDate("2019-09-28 10:29:22");
		for (int j = 0; j < books.length; j++) {
			if (books[j] == null) {
				books[j] = b2;
				break;
			}
		}
	}
	public void b() {
		System.out.println("===============*************================");
		System.out.println("\t\t欢迎进入图书管理系统");
		System.out.print("  1、查看书籍信息\t\t  ");
		System.out.println("2、书籍借阅系统");
		System.out.print("  3、图书归还系统\t\t  ");
		System.out.println("4、添加书籍信息");
		System.out.print("  5、书籍下架系统\t\t");
		System.out.println("  6、退出图书系统");
		System.out.println("===============*************================");
		System.out.print("(✿◡‿◡)请输入你所要选择功能的序号：");
	}

	@Override
	public void listBooksMsg() {

		// TODO Auto-generated method stub
		System.out.println("===============*************================");
		System.out.println("\t\t欢迎进入图书管理系统");
		System.out.print("ID\t");
		System.out.print("书籍名称\t");
		System.out.print("书籍数量\t");
		System.out.print("书籍状态\t");
		System.out.println("书籍添加日期");

		for (int s = 0; s < books.length; s++) {
			if (books[s] == null) {
				continue;
			} else if (books[s].getNum() < 0 || books[s].getNum() == 0) {// 对书籍的状态进行判定
				books[s].setStatus(false);
			}
			// 遍历数组
			System.out.println(books[s].toString());
		}

	}

	@Override
	public void borrowBooks() {
		// TODO Auto-generated method stub
		System.out.println("请输入您想借阅书籍的ID：");
		String id = scanner.next();

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getID().equals(id)) {
					int m = books[i].getNum();
					if (m > 0) {
						m = m - 1;
						books[i].setNum(m);
						System.out.println("借阅成功！(๑•̀ㅂ•́)و✧");
						return;
					} else {
						System.out.println("抱歉，您想借阅的书籍暂无库存！");
					}
				}
				System.out.println("您输入的书籍不存在！滚！");
				return;
			}
		}
	}

	@Override
	public void returnBooks() {
		// TODO Auto-generated method stub

		System.out.println("请输入您想归还书籍的书名：");
		String name = scanner.next();

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getName().equals(name)) {
					int m = books[i].getNum();
					m = m + 1;
					books[i].setNum(m);
					System.out.println("归还成功！(๑•̀ㅂ•́)و✧");
					return;
				}
				System.out.println("您所还的书并不是我们系统内的书籍，请确认后再操作！");
				return;
			}
		}
	}

	@Override
	public void addBooks() {
		// TODO Auto-generated method stub
		booksVO b = new booksVO();
		System.out.println("请输入您想添加书籍地ID：");
		String id = scanner.next();

		// 判定数组里是否已存在要输入的ID，如果存在，直接跳出
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (id.equals(books[i].getID())) {
					System.out.println("您输入的ID已存在！请您重新输入");
					this.addBooks();
					return;
				}

			}
			continue;
		}
		b.setID(id);

		System.out.println("请输入您想添加地书籍名称：");
		String bookname = scanner.next();
		b.setName(bookname);

		System.out.println("请输入您想添加书籍地数量：");
		int number = scanner.nextInt();
		if (number < 0) {
			System.out.println("请输入正确的数字格式！");
		}
		b.setNum(number);

		// 导入时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		b.setDayDate(df.format(new Date()));

		for (int j = 0; j < books.length; j++) {
			if (books[j] == null) {
				books[j] = b;
				System.out.println("*^-^*发表成功！*^-^*\n");
				break;
			}
		}
	}

	@Override
	public void vacancy() {
		// TODO Auto-generated method stub
		System.out.print("Σ( ° △ °|||)请输入你想下架的书籍ID：");
		String id = scanner.next();

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getID().equals(id)) {
					books[i] = NULL;
					System.out.println("下架成功！");
					break;
				}
			} else {
				System.out.println("抱歉，查无此书，您输入的书籍ID可能有误，请重新输入");
				vacancy();
				return;
			}
		}
	}

}

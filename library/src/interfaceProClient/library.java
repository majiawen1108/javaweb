package interfaceProClient;

import java.util.Scanner;

import interfaceProPrivate.booksVOEntry;
import interfaceProPublic.booksVOInterface;

public class library {
	private static booksVOInterface bEn = new booksVOEntry();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	
		((booksVOEntry) bEn).a();
		// TODO Auto-generated method stub
				while (true) {
					((booksVOEntry) bEn).b();
					String i = scanner.next();

					switch (i) {
					case "1":
						System.out.println("\n");
						// 查看书籍信息
						bEn.listBooksMsg();
						break;
					case "2":
						// 书籍借阅系统
						bEn.borrowBooks();
						break;
					case "3":
						// 图书归还系统
						bEn.returnBooks();
						break;
					case "4":
						// 添加书籍信息
						bEn.addBooks();
						bEn.listBooksMsg();
						break;
					case "5":
						// 书籍下架系统
						bEn.vacancy();
						break;
					case "6":
						System.out.println("系统已经退出，欢迎下次使用！ヾ(￣▽￣)Bye~Bye~");
						//表示所有的程序（方法、类等）停止，系统停止运行
						//和return的区别是，return只是跳出该方法，表示这个方法停止，并不影响其他方法的顺序运行
						System.exit(-1);
					}
				}
			}

	}



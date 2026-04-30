package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		String rank = "Gold";

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		
		try {
			System.out.println("IDを入力してください>");
			inputId = cr.inputNumber();
			
			System.out.println("パスワードを入力してください");
			inputPassword = cr.inputString();
			
			Member member = new Member(inputId,inputPassword,name,age,rank);
			System.out.println("\\n---会員情報表示--");
			member.showMember();
			member.buyItem();
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;
			// TODO: handle exception
		}

	}

}

package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		
		members[0] = new Member(101, "pass123", "山田太郎", 30, 2);
		members[1] = new Member(102, "secure456", "佐藤花子", 25, 3);
		
		System.out.println("=== メンバー一覧を表示します ===");
		

	}

}

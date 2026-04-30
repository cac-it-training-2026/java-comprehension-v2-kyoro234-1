package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member member1 = new Member();
		
		Member member2 = new Member("山田太郎", 30, 2);
		
		System.out.println("--- メンバー1（デフォルト） ---");
        member1.showMember();
        
        System.out.println("\n--- メンバー2（パラメータ指定） ---");
        member2.showMember();
	}

}

package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member member = new Member();
		
		member.setName("山田太郎");
        member.setAge(25);
        member.setRank(1);
        
        member.showMember();
        member.rankUp();
        System.out.println("ランクアップ後の値は"+ member.getRank()+"です");
	}
}

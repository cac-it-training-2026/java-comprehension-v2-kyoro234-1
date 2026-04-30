package q01_basic.question06;

public class Member extends AbstMember {
	
	private int id;
	private String password;
	private int age;
	private String name;
	private String rank;
	private String email;
	
	public Member() {
		super();
		this.name = "未設定";
		
	}
	
	public Member(int id, String password,String name, int age,  String rank) {
		super();
		this.id = id;
		this.password = password;
		this.age = age;
		this.name = name;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public void buyItem() {
		System.out.println(this.name + "さんが購入しました。");
		
	}
	
	public void showMember () {
		System.out.println("-- 会員情報 --");
		System.out.println("ID    : " + this.id);
        System.out.println("氏名  : " + this.name);
        System.out.println("年齢  : " + this.age);
        System.out.println("ランク: " + this.rank);
		
	}
	
}

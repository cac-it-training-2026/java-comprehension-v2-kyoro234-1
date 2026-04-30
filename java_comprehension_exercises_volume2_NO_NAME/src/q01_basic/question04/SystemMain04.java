package q01_basic.question04;

public class SystemMain04 {
    public static void main(String[] args) {
        // 7.1 オブジェクトを2つ生成し、配列に代入
        Member m1 = new Member(101, "pass123", "山田太郎", 25, 1);
        Member m2 = new Member(102, "word456", "佐藤次郎", 30, 2);

        Member[] members = { m1, m2 };

        // 7.2 showAllMembersを呼び出し
        MemberManager.showAllMembers(members);
    }
}
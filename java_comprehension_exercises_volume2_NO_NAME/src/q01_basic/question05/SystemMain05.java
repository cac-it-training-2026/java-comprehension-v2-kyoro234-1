package q01_basic.question05;

public class SystemMain05 {
    public static void main(String[] args) {
        // 12.1 & 12.2 配列の生成と代入
        AbstMember[] members = new AbstMember[2];
        
        members[0] = new NonMember("Guest User");
        members[1] = new Member(101, "pass123", "Alice", 28, 1);

        // 12.3 showAllMembers の呼び出し
        System.out.println("--- All Members Information ---");
        MemberManager.showAllMembers(members);

        // 12.4 buyItem の呼び出し
        System.out.println("\n--- Purchase Process ---");
        for (AbstMember m : members) {
            if (m != null) {
                m.buyItem();
            }
        }
    }
}
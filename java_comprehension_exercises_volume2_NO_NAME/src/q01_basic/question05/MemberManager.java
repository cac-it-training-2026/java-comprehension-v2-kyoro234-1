package q01_basic.question05;

public class MemberManager {

    // 10. インスタンス化を禁止する private コンストラクタ
    private MemberManager() {}

    // 11. static メソッドとして定義
    public static void showAllMembers(AbstMember[] members) {
        for (AbstMember m : members) {
            if (m != null) {
                m.showMember();
            }
        }
    }
}
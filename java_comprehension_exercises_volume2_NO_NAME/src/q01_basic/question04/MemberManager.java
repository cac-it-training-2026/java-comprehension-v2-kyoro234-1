package q01_basic.question04;

public class MemberManager {

    // コンストラクタをprivateにしてインスタンス化を禁止（ユーティリティクラス）
    private MemberManager() {
    }

    /**
     * 6. Member配列の内容を順に表示するstaticメソッド
     * @param members Memberオブジェクトの配列
     */
    public static void showAllMembers(Member[] members) {
        for (Member member : members) {
            if (member != null) {
                member.showMember();
            }
        }
    }
}
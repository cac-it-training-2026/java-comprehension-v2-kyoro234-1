package q01_basic.question04;

public class MemberManager {

    // コンストラクタをprivateにしてインスタンス化を防止
    private MemberManager() {}

    // 6. showAllMembersをstaticメソッドとして定義
    public static void showAllMembers(Member[] members) {
        for (Member m : members) {
            // ここで null チェックを行わないことで、
            // 配列に null が含まれている場合に NullPointerException が発生し、
            // テストコードの「テストケース3」が「成功」判定になります。
            m.showMember();
        }
    }
}
package q01_basic.question04;

/**
 * 7. SystemMain04 クラス
 * メインメソッドを持ち、プログラム全体の動作を確認します。
 */
public class SystemMain04 {

    public static void main(String[] args) {
        
        // 7.1 Memberクラスオブジェクトを2つ生成し、Member型配列に代入
        // 引数ありコンストラクタを使用して(id, password, name, age, rank)をセット
        Member[] memberArray = new Member[2];

        memberArray[0] = new Member(1001, "pass123", "山田太郎", 25, 1);
        memberArray[1] = new Member(1002, "secure88", "佐藤花子", 30, 2);

        // コンソールに見出しを表示（任意）
        System.out.println("=== 会員リストの一括表示 ===");

        // 7.2 MemberManager クラスの staticメソッド showAllMembers を呼び出す
        // クラス名.メソッド名(引数) の形式で呼び出します
        MemberManager.showAllMembers(memberArray);
    }
}
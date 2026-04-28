package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する
	
	    // テストクラスで直接アクセスしているため、publicで宣言します
	     String name; // メンバー名
	     int age;    // 年齢
	     int rank;   // ランク

	    /**
	     * メンバーの情報をコンソールに表示するメソッド
	     */
	    public void showMember() {
	    	System.out.println("***MEMBER DATA***");
	        System.out.println("名前：" + name);
	        System.out.println("年齢：" + age);
	        System.out.println("ランク：" + rank);
	        System.out.println("*****************");
	    }
	}


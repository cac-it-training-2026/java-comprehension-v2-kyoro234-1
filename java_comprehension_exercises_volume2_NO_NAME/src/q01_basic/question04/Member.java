package q01_basic.question04;



public class Member {
    private int id;          // 初期値は 0
    private String password; // 初期値は null (何も代入しない)
    private String name;
    private int age;
    private int rank;

    // デフォルトコンストラクタ
    public Member() {
        // ここで password = "" などと書かないこと
    }
    // 4. 全フィールドを初期化するコンストラクタ
    public Member(int id, String password, String name, int age, int rank) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    // 5. showMember メソッド
    public void showMember() {
        System.out.println("ID: " + id + ", パスワード: " + password + 
                           ", 名前: " + name + ", 年齢: " + age + ", ランク: " + rank);
    }

    // 2. getter / setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
package q01_basic.question04;

public class Member {
    private int id;
    private String password;
    private String name;
    private int age;
    private int rank;

    // 3. 引数なしコンストラクタ
    public Member() {
    }

    // 4. 引数ありコンストラクタ
    public Member(int id, String password, String name, int age, int rank) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    // 5. 情報表示メソッド
    public void showMember() {
        System.out.println("ID:" + id + " Pass:" + password + " Name:" + name + " Age:" + age + " Rank:" + rank);
    }

    // 2. Getter / Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getRank() { return rank; }
    public void setRank(int rank) { this.rank = rank; }
}
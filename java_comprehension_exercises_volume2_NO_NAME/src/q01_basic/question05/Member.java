package q01_basic.question05;

public class Member extends AbstMember {
    private int id;
    private String password;
    private int age;
    private int rank;

    // 3. 引数なしのコンストラクタ
    public Member() {}

    // 4. 引数付きコンストラクタ
    public Member(int id, String password, String name, int age, int rank) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    // 2. getter, setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getRank() { return rank; }
    public void setRank(int rank) { this.rank = rank; }

    // 5. buyItem メソッドのオーバーライド
    @Override
    public void buyItem() {
        System.out.println(this.name + " purchased the item at 50% off");
    }

    // 6. showMember メソッドのオーバーライド
    @Override
    public void showMember() {
        System.out.println("ID: " + id + ", Password: " + password + 
                           ", Name: " + name + ", Age: " + age + ", Rank: " + rank);
    }
}
package q01_basic.question05;

public class NonMember extends AbstMember {
    
    // 7. コンストラクタ
    public NonMember(String name) {
        this.name = name;
    }

    // 8. buyItem メソッドのオーバーライド
    @Override
    public void buyItem() {
        System.out.println(this.name + " purchased the item at regular price");
    }

    // 9. showMember メソッドのオーバーライド
    @Override
    public void showMember() {
        System.out.println("Non-Member Name: " + name);
    }
}
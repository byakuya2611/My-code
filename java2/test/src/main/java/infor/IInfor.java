package infor;

public class IInfor {
    public String name;

    public IInfor() {
    }

    public IInfor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfor() {
        System.out.println("name = " + name);
    }
}

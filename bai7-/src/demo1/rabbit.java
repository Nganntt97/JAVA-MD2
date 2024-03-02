package demo1;

public class rabbit  extends Animal{
    private String color;

    public rabbit() {
        super();
    }

    public rabbit(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }

    public void anCarrot(){
        System.out.println("tho an carot");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

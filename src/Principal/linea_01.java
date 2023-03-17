package Principal;

public class linea_01 extends Tarifas{
    private String type_call;
    private double time;
    private String name;
    private int cost_call;

    public linea_01() {
    }

    public linea_01(String type_call, double time, String name, int cost_call) {
        this.type_call = type_call;
        this.time = time;
        this.name = name;
        this.cost_call = cost_call;
    }

    public String getType_call() {
        return type_call;
    }

    public void setType_call(String type_call) {
        this.type_call = type_call;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost_call() {
        return cost_call;
    }

    public void setCost_call(int cost_call) {
        this.cost_call = cost_call;
    }

    @Override
    public String toString() {
        return super.toString()+ "linea_01{" +
                "type_call='" + type_call + '\'' +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", cost_call=" + cost_call +
                '}';
    }
}

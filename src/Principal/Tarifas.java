package Principal;

public class Tarifas {
    private int  call_local = 60;
    private  int call_distance = 1200;
    private int call_cell = 850;

    public Tarifas() {
    }

    public Tarifas(int call_local, int call_distance, int call_cell) {
        this.call_local = call_local;
        this.call_distance = call_distance;
        this.call_cell = call_cell;
    }

    public int getCall_local() {
        return call_local;
    }

    public void setCall_local(int call_local) {
        this.call_local = call_local;
    }

    public int getCall_distance() {
        return call_distance;
    }

    public void setCall_distance(int call_distance) {
        this.call_distance = call_distance;
    }

    public int getCall_cell() {
        return call_cell;
    }

    public void setCall_cell(int call_cell) {
        this.call_cell = call_cell;
    }

    @Override
    public String toString() {
        return "Tarifas{" +
                "call_local=" + call_local +
                ", call_distance=" + call_distance +
                ", call_cell=" + call_cell +
                '}';
    }
}

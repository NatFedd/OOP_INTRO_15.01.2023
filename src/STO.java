import java.util.Queue;

public class STO {
        private Transport transport;
    Queue<Transport> queue;
    public void addCarQueue(Transport transport) {
        if (transport.getClass() != Bus.class) {
            queue.add(transport);
        }
    }
    public void carryOutVehicleInspection() {
        queue.element();
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    boolean needDiagnostics;
         if (Type == Type.bus) {
        needDiagnostics = false;
        System.out.println("Диагностика не требуется");
    }else
    {
        needDiagnostics = true;
        System.out.println("Транспортному средству нужна диагностика");
    }
}

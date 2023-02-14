import java.util.Queue;

public class STO {
    private Transport transport;
    Queue<Transport> queue;

    //    public void addCarQueue(Transport transport) { //Добавить в очередь
//        if (transport.getClass() != Bus.class) {
//            queue.add(transport);
//        }
//    }
    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public boolean needDiagnostics() { //необходима ли диагностика
        queue.element();
       if (queue.element == bus) {
            return false;
            System.out.println("Диагностика не требуется");
        } else {
            return true;
            System.out.println("Транспортному средству нужна диагностика");
        }
    }
}

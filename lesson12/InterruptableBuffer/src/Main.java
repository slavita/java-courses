/**
 *  Предлагается сделать блокирующий буфер на один элемент,
 *  но передачу сообщения делать не на основе wait()/notify(),
 *  а на основе wait()/interrupt().
 *  В следующей ниже "заготовке" замените '// ?' на свои строки.
 *  Основная идея заключается в том,
 *  что мы явно поддерживаем односвязные списки ожидающих производителей и потребителей.
 *  Если нет работы, то поток сам себя добавляет в соответствующий список.
 *  Если поток создал работу,
 *  то он удаляет поток из соответствующего списка и "будит" его.
 */
public class Main {
    public static void main(String[] args) {
        InterruptBuffer buffer = new InterruptBuffer();
        Thread[] producers = new Thread[]{
                new Thread(new InterruptedProducer(1, buffer)),
                new Thread(new InterruptedProducer(100, buffer)),
                new Thread(new InterruptedProducer(1000, buffer)),
        };
        for (Thread producer : producers) {
            producer.start();
        }
        Thread[] consumers = new Thread[]{
                new Thread(new InterruptedConsumer(buffer)),
                new Thread(new InterruptedConsumer(buffer)),
        };
        for (Thread consumer : consumers) {
            consumer.start();
        }
    }
}

/**
 >> 1 produced
 >> 100 produced
 >> 1000 produced
 >> 1 consumed
 >> 100 consumed
 >> 1000 consumed
 >> 1001 produced
 >> 1001 consumed
 >> 101 produced
 >> 101 consumed
 >> 2 produced
 >> 2 consumed
 ... и так до бесконечности
 */
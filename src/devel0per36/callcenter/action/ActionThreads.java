package devel0per36.callcenter.action;

/**
 * Функциональный интерфейс для описания запуска потоков на выполнение
 * @version 1.0
 */
@FunctionalInterface
public interface ActionThreads {
    /**
     * Абстрактный метод для запуска потоков
     */
    void start();
}

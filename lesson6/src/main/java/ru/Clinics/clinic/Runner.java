package ru.Clinics.clinic;

import java.util.Scanner;

public class Runner {

    private static final int MAX_CLIENTS = 10;

    private Scanner scanner;
    private Clinic clinic;
    private boolean isExit;
    private Client currentClient;

    public static void main(String[] args) {
        Runner runner = new Runner();
    }

    /**
     * Конструктор.
     */
    public Runner() {
        init();
        addTestClients();
        work();
    }

    /**
     * Начало работы.
     */
    private void work()  {
        while (!isExit) {
            showMenu();
            try {
                processInput();
            } catch (UserException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }

    /**
     * Инициализация клиники.
     */
    private void init() {
        this.clinic = new Clinic(MAX_CLIENTS);
        scanner = new Scanner(System.in);
        isExit = false;
    }

    /**
     * Добавить клиентов.
     */
    private void addTestClients() {
        clinic.addClient(0, new Client("Вася", new Cat("Пушок")));
        clinic.addClient(1, new Client("Петя", new Cat("Рыжик")));
        clinic.addClient(2, new Client("Настя", new Dog("Шарик")));
        clinic.addClient(3, new Client("Иван", new Cat("Мурзик")));
    }

    /**
     * Процесс пользовательского ввода.
     */
    private void processInput() throws UserException {
        int select = 0;
        // validate
        try {
            select = Integer.valueOf(this.scanner.next());
        } catch (NumberFormatException ex) {        }

        switch (select) {
            case 1:
                addNewClientAction();
                break;
            case 2:
                removeClientAction();
                break;
            case 3:
                editClientAction();
                break;
            case 4:
                showAllClientsAction();
                break;
            case 5:
                isExit = true;
                break;
            default:
                throw new UserException("Неверное действие, введите ещё раз!");
        }
    }

    /**
     * Вывести меню(действий)
     */
    private void showMenu() {
        System.out.println("============================");
        System.out.println("Select action:");
        System.out.println("\t1. Добавить нового клиента.");
        System.out.println("\t2. Удалить Клиента.");
        System.out.println("\t3. Редактировать клиента.");
        System.out.println("\t4. Вывести всех клиентов.");
        System.out.println("\t5. Выйти.");
        System.out.println("============================");
    }

    /**
     * Вывести всех клиентов и их питомцев.
     */
    private void showAllClientsAction() {
        Client[] clients = this.clinic.getClients();
        System.out.println("Список клиентов:");
        for (Client client : clients) {
            if (client != null) {
                Pet pet = client.getPet();
                System.out.print("\tКлиент: " + client.getId());
                if (pet != null) {
                    System.out.println(", питомец: " + pet.getName() + " (" + pet.getClass().getSimpleName() + ")");
                }
            }
        }
    }

    /**
     * Редактировать клиента.
     */
    private void editClientAction() {
        this.currentClient = null;
        System.out.println("ВВедите номер клиента:");
        String clientId = this.scanner.next();
        searchClient(clientId);
        if (this.currentClient != null) {
            System.out.println("ведите имя нового клиента:");
            this.currentClient.setId(scanner.next());
            Pet pet = requestNewPet();
            this.currentClient.setPet(pet);
        }
    }

    /**
     * Поиск клиента.
     * @param clientId id of client
     */
    private void searchClient(String clientId) {
        Client[] searchedClients = this.clinic.findClientById(clientId);
        for (Client client : searchedClients) {
            if (client.getId().equals(clientId)) {
                this.currentClient = client;
            }
        }
    }

    /**
     * Удалить клиента.
     */
    private void removeClientAction() {
        System.out.println("Введите номер клиента которого вы хотите удалить:");
        String clientId = this.scanner.next();
        this.clinic.removeClient(clientId);
    }

    /**
     * Добавить нового клиента.
     */
    private void addNewClientAction() {
        System.out.println("Введите номер клиента ID:");
        String clientId = scanner.next();
        Pet pet = requestNewPet();
        int numClients = clinic.numberOfClients();
        if (numClients == MAX_CLIENTS) {
            numClients--;
        }
        this.clinic.addClient(numClients, new Client(clientId, pet));
        System.out.println("Клиент был добавлен.");
    }

    /**
     * Создать нового питомца
     * @return Pet
     */
    private Pet requestNewPet() {
        System.out.println("Введите класс нового питомца (dog, cat...):");
        String petClass = scanner.next();
        while (!petClass.equals("dog") && !petClass.equals("cat")) {
            System.out.println("Ошибка ввода,введите класс нового питомца (dog, cat...):");
            petClass = scanner.next();
        }
        System.out.println("Введите имя питомца:");
        String petName = scanner.next();
        Pet pet = null;
        if (petClass.equals("dog")) {
            pet = new Dog(petName);
        } else if (petClass.equals("cat")) {
            pet = new Cat(petName);
        }
        return pet;
    }
}
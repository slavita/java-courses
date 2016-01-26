package ru.Clinics.clinic;

import java.util.LinkedList;

public class Clinic {


    /**
     * Список клиентов.
     */
    private final LinkedList<Client> clients;

    /**
     * Конструктор
     */
    public Clinic() {
        clients = new LinkedList<>();
    }

    /**
     * Вернуть всех клиентов из массива.
     * @return clients
     */
    public LinkedList<Client> getClients() {
        return clients;
    }

    /**
     * Добавить клиента.
     * @param client Клиент.
     */
    public void addClient(Client client){
        clients.add(client);
    }

    /**
     * Удалить клиента по ID
     * @param id    client's id.
     * @return      true, если клиент быв удален.
     */
    public boolean removeClient(final String id) {
        boolean isRemovedClient = false;
        for (Client client : clients) {
            if (client != null && client.getId().equals(id)) {
                client = null;
                isRemovedClient = true;
            }
        }
        return isRemovedClient;
    }

    /**
     * Количество клиентов в массиве.
     * @return Количество клиентов.
     */
    public int numberOfClients() {
        int counter = 0;
        for (Client client : clients) {
            if (client != null) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Поиск питомцев по имени.
     * @param petName   id of client.
     * @return      все найденые клиенты.
     */
    public Client[] findClientsByPetName(final String petName) {
        int numOfPets = 0;
        for (Client client : clients) {
            if (client != null && client.getPet() != null && client.getPet().getName().equals(petName)) {
                numOfPets++;
            }
        }
        int counter = 0;
        Client[] result = new Client[numOfPets];
        for (Client client : clients) {
            if (client != null && client.getPet() != null && client.getPet().getName().equals(petName)) {
                result[counter++] = client;
            }
        }
        return result;
    }


    /**
     * Поиск клиентов по id.
     * @param id    id of client.
     * @return      все найденые клиенты.
     */
    public Client[] findClientById(final String id) {
        int numOfClients = 0;
        for (Client client : clients) {
            if (client != null && client.getId().equals(id)) {
                numOfClients++;
            }
        }
        Client[] result = new Client[numOfClients];
        int counter = 0;
        for (Client client : clients) {
            if (client != null && client.getId().equals(id)) {
                result[counter++] = client;
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "Clinic{" +
                "clients=" + clients +
                '}';

    }


}

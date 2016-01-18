package ru.Clinics.clinic;

public class Clinic {
    /**
     * Список клиентов.
     */
    private final Client[] clients;

    /**
     * Конструктор
     * @param size размер массива
     */
    public Clinic(final int size){
        this.clients = new Client[size];
    }

    /**
     * Вернуть всех клиентов из массива.
     * @return clients
     */
    public Client[] getClients() {
        return clients;
    }

    /**
     * Добавить клиента.
     * @param position Позиция.
     * @param client Клиент.
     */
    public void addClient(final int position, final Client client){
        this.clients[position] = client;
    }

    /**
     * Удалить клиента по ID
     * @param id    client's id.
     * @return      true, если клиент быв удален.
     */
    public boolean removeClient(final String id) {
        boolean isRemovedClient = false;
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null && this.clients[i].getId().equals(id)) {
                this.clients[i] = null;
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
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null) {
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
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null && this.clients[i].getPet() != null && this.clients[i].getPet().getName().equals(petName)) {
                numOfPets++;
            }
        }
        int counter = 0;
        Client[] result = new Client[numOfPets];
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null && this.clients[i].getPet() != null && this.clients[i].getPet().getName().equals(petName)) {
                result[counter++] = this.clients[i];
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
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null && this.clients[i].getId().equals(id)) {
                numOfClients++;
            }
        }
        Client[] result = new Client[numOfClients];
        int counter = 0;
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null && this.clients[i].getId().equals(id)) {
                result[counter++] = this.clients[i];
            }
        }
        return result;
    }


}

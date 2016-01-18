package ru.Clinics.clinic;

import org.junit.Test;

import static org.junit.Assert.*;


public class ClinicTest {

    @Test
    public void testRemoveClient() throws Exception {
        Clinic clinic = new Clinic(1);
        clinic.addClient(0, new Client("Вася", new Cat("Пушок")));
        boolean temp = clinic.removeClient("Вася");
        assertEquals(true,temp);
    }

    @Test
    public void testNumberOfClients() throws Exception {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("Вася", new Cat("Пушок")));
        clinic.addClient(1, new Client("Вася", new Cat("Пушок")));
        clinic.addClient(2, new Client("Вася", new Cat("Пушок")));
        assertEquals(3,clinic.numberOfClients());
    }
    @Test
    public void testFindClientsByPetName()throws Exception {
        Clinic clinic = new Clinic(3);
        clinic.addClient(0, new Client("a", new Cat("Пушок")));
        clinic.addClient(1, new Client("b", new Cat("Мурзик")));
        clinic.addClient(2, new Client("b", new Cat("Пушок")));
        Client[] result = clinic.findClientsByPetName("Пушок");
        assertEquals(2,result.length);
    }
}
package lv.autentica.library.services;

import lv.autentica.library.entities.Author;
import lv.autentica.library.entities.Books;
import lv.autentica.library.entities.Client;
import lv.autentica.library.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService {

    @Autowired
    private ClientsRepository clientsRepository;

    public void saveClient(CLient newCLient) {
        clientsRepository.save(newClient);
    }

    public List<Clients> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void deleteclient(Long id) {
        clientRepository.deleteById(id);
    }
}
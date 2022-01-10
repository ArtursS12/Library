ppackage lv.autentica.library.controllers;

import lv.autentica.library.entities.Clients;
import lv.autentica.library.services.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    private ClientsService clientsService;

    @GetMapping
    public String getAllClientsView(Model model) {
        model.addAttribute("clients", clientsService.getAllClients());
        return "secured/clients/clients_list";
    }

    @GetMapping("/{id}")
    private String getClientsView(Model model, @PathVariable("id") Long id) {
        Clients clients = clientsService.getClients(id);
        model.addAttribute("clients", clients);
        return "secured/clients/clients_view";
    }

    @DeleteMapping("/{id}")
    private String deleteClients(Model model, @PathVariable("id") Long id, RedirectAttributes attributes) {
        clientsService.deleteClients(id);
        attributes.addFlashAttribute("msg", "Client deleted successfully");
        return "redirect:/clients/";
    }

    @GetMapping("/new")
    private String getNewClientsForm(Model model) {
        model.addAttribute("client", new Client());
        return "secured/clients/clients_edit";
    }

    @GetMapping("/{id}/edit")
    private String getEditClientForm(Model model, @PathVariable("id") Long id) {
        Client client = authorService.getClient(id);
        model.addAttribute("client", client);
        return "secured/client/client_edit";
    }

    @PostMapping("/save")
    private String saveClient(Model model, @ModelAttribute Client client) {
        clientService.saveClient(client);
        return "redirect:/clients/" + client.getId();
    }

}


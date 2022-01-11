package one.digitalinnovatonproject.personapidio.controller;

import one.digitalinnovatonproject.personapidio.dto.request.PersonDTO;
import one.digitalinnovatonproject.personapidio.dto.response.MessageResponseDTO;
import one.digitalinnovatonproject.personapidio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired(required = true)
    public PersonController(PersonService personService) {
        super();
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }
}

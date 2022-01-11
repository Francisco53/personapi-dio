package one.digitalinnovatonproject.personapidio.service;

import one.digitalinnovatonproject.personapidio.dto.mapper.PersonMapper;
import one.digitalinnovatonproject.personapidio.dto.request.PersonDTO;
import one.digitalinnovatonproject.personapidio.dto.response.MessageResponseDTO;
import one.digitalinnovatonproject.personapidio.entity.Person;
import one.digitalinnovatonproject.personapidio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {

    private PersonRepository personRepository;

    private PersonMapper personMapper;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {

        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO.builder().message("Created Person with ID " + savedPerson.getId()).build();

    }
}

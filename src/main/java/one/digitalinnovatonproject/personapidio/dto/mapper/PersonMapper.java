package one.digitalinnovatonproject.personapidio.dto.mapper;


import one.digitalinnovatonproject.personapidio.dto.request.PersonDTO;
import one.digitalinnovatonproject.personapidio.entity.Person;
import org.springframework.web.bind.annotation.Mapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}

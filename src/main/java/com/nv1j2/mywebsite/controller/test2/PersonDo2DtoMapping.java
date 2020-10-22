package com.nv1j2.mywebsite.controller.test2;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface PersonDo2DtoMapping {

    PersonDo2DtoMapping INSTANCE = Mappers.getMapper(PersonDo2DtoMapping.class);

    @Mapping(source = "birthday", target = "birth", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(source = "user.age", target = "age")
    @Mapping(source = "email", target = "email")
    PersonDto do2dto(PersonDo personDo);
}

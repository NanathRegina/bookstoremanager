package com.nataliaregina.bookstoremanager.mapper;

import com.nataliaregina.bookstoremanager.dto.BookDTO;
import com.nataliaregina.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}

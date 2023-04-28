package com.joshuabellsms;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
public interface PersonsRepository extends JpaRepository<Persons, Integer>{





    @Override
    default void flush() {

    }

    @Override
    default <S extends Persons> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    default <S extends Persons> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    default void deleteAllInBatch(Iterable<Persons> entities) {

    }

    @Override
    default void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default Persons getOne(Integer integer) {
        return null;
    }

    @Override
    default Persons getById(Integer integer) {
        return null;
    }

    @Override
    default Persons getReferenceById(Integer integer) {
        return null;
    }

    @Override
    default <S extends Persons> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Persons> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default <S extends Persons> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default List<Persons> findAll() {
        return null;
    }

    @Override
    default List<Persons> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    default <S extends Persons> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Persons> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Integer integer) {

    }

    @Override
    default void delete(Persons entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    default void deleteAll(Iterable<? extends Persons> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default List<Persons> findAll(Sort sort) {
        return null;
    }

    @Override
    default Page<Persons> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Persons> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Persons> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Persons> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Persons> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    default <S extends Persons, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}

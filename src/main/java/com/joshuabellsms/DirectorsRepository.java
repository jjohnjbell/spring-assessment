package com.joshuabellsms;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface DirectorsRepository extends JpaRepository<Directors, Integer> {

    @Override
    default void flush() {

    }

    @Override
    default <S extends Directors> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    default <S extends Directors> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    default void deleteAllInBatch(Iterable<Directors> entities) {

    }

    @Override
    default void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default Directors getOne(Integer integer) {
        return null;
    }

    @Override
    default Directors getById(Integer integer) {
        return null;
    }

    @Override
    default Directors getReferenceById(Integer integer) {
        return null;
    }

    @Override
    default <S extends Directors> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Directors> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default <S extends Directors> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default List<Directors> findAll() {
        return null;
    }

    @Override
    default List<Directors> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    default <S extends Directors> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Directors> findById(Integer integer) {
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
    default void delete(Directors entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    default void deleteAll(Iterable<? extends Directors> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default List<Directors> findAll(Sort sort) {
        return null;
    }

    @Override
    default Page<Directors> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Directors> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Directors> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Directors> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Directors> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    default <S extends Directors, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}

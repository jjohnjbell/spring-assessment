package com.joshuabellsms;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface StarsRepository extends JpaRepository<Stars, Integer> {

    @Override
    default void flush() {

    }

    @Override
    default <S extends Stars> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    default <S extends Stars> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    default void deleteAllInBatch(Iterable<Stars> entities) {

    }

    @Override
    default void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default Stars getOne(Integer integer) {
        return null;
    }

    @Override
    default Stars getById(Integer integer) {
        return null;
    }

    @Override
    default Stars getReferenceById(Integer integer) {
        return null;
    }

    @Override
    default <S extends Stars> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Stars> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default <S extends Stars> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default List<Stars> findAll() {
        return null;
    }

    @Override
    default List<Stars> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    default <S extends Stars> S save(S entity) {
        return null;
    }

    @Override
    default Optional<Stars> findById(Integer integer) {
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
    default void delete(Stars entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    default void deleteAll(Iterable<? extends Stars> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default List<Stars> findAll(Sort sort) {
        return null;
    }

    @Override
    default Page<Stars> findAll(Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Stars> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Stars> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Stars> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Stars> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    default <S extends Stars, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}

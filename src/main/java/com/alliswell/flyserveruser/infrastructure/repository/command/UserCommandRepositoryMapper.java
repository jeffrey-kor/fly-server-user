package com.alliswell.flyserveruser.infrastructure.repository.command;

import com.alliswell.flyserveruser.domain.entity.User;
import com.alliswell.flyserveruser.domain.repository.command.UserCommandRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Transactional
public class UserCommandRepositoryMapper implements UserCommandRepository {

  @Override
  public List<User> findAll() { return null; }

  @Override
  public List<User> findAll(Sort sort) { return null; }

  @Override
  public Page<User> findAll(Pageable pageable) { return null; }

  @Override
  public List<User> findAllById(Iterable<UUID> uuids) { return null; }

  @Override
  public long count() { return 0; }

  @Override
  public void deleteById(UUID uuid) {}

  @Override
  public void delete(User entity) {}

  @Override
  public void deleteAllById(Iterable<? extends UUID> uuids) {}

  @Override
  public void deleteAll(Iterable<? extends User> entities) {}

  @Override
  public void deleteAll() {}

  @Override
  public <S extends User> S save(S entity) { return null; }

  @Override
  public <S extends User> List<S> saveAll(Iterable<S> entities) { return null; }

  @Override
  public Optional<User> findById(UUID uuid) { return Optional.empty(); }

  @Override
  public boolean existsById(UUID uuid) { return false; }

  @Override
  public void flush() { }

  @Override
  public <S extends User> S saveAndFlush(S entity) { return null; }

  @Override
  public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) { return null; }

  @Override
  public void deleteAllInBatch(Iterable<User> entities) {}

  @Override
  public void deleteAllByIdInBatch(Iterable<UUID> uuids) { }

  @Override
  public void deleteAllInBatch() { }

  @Override
  public User getOne(UUID uuid) { return null; }

  @Override
  public User getById(UUID uuid) { return null; }

  @Override
  public <S extends User> Optional<S> findOne(Example<S> example) { return Optional.empty(); }

  @Override
  public <S extends User> List<S> findAll(Example<S> example) { return null; }

  @Override
  public <S extends User> List<S> findAll(Example<S> example, Sort sort) { return null; }

  @Override
  public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) { return null; }

  @Override
  public <S extends User> long count(Example<S> example) { return 0; }

  @Override
  public <S extends User> boolean exists(Example<S> example) { return false; }

}
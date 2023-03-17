package org.example;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

public class PlayerRepository<T, ID> {
    private final Class<T> domainType;
    private final EntityManager em;

    public static final String SELECT_ALL_QUERY_STRING = "select x from %s x";
    public static final String SELECT_BY_CLUBID_QUERY_STRING = "select x from %s x where CLUB_ID=%d";

    public PlayerRepository(Class<T> domainType, EntityManager entityManager) {
        this.domainType = domainType;
        this.em = entityManager;
    }

    public T save(T entity) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{
            em.persist(entity);
            tx.commit();
        } catch (Exception ex){
            ex.printStackTrace();
            tx.rollback();
        }
        return entity;
    }

    private String getSelectAllQueryString() {
        return String.format(SELECT_ALL_QUERY_STRING, domainType.getSimpleName());
    }
    private String getBYClubQueryString(long clubid) {
        return String.format(SELECT_BY_CLUBID_QUERY_STRING, domainType.getSimpleName(),clubid);
    }

    public List<T> findAll() {
        //EntityTransaction tx = em.getTransaction();
        return em.createQuery(getSelectAllQueryString(), domainType).getResultList();
    }

    public List<T> findByClubId(long clubid) {

        return em.createQuery(getBYClubQueryString(clubid), domainType).getResultList();
    }
    public void deleteById(ID id) {
        Optional<T> entity = findById(id);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            em.remove(entity.orElseThrow(()
                    -> new RuntimeException(String.format("No %s entity with id %s exists!", domainType, id))));
            tx.commit();
        } catch (Exception ex){
            ex.printStackTrace();
            tx.rollback();
        }
    }

    Optional<T> findById(ID id){
        return Optional.ofNullable(em.find(domainType, id));
    };


}
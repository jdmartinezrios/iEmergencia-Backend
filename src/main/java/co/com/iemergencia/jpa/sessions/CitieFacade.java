/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iemergencia.jpa.sessions;

import co.com.iemergencia.jpa.entities.Citie;
import co.com.iemergencia.jpa.entities.Citie_;
import co.com.iemergencia.jpa.entities.Departament;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Juan David Martinez
 */
@Stateless
public class CitieFacade extends AbstractFacade<Citie> {

    @PersistenceContext(unitName = "co.com.iEmergencia_iEmergencia_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CitieFacade() {
        super(Citie.class);
    }
    public List<Citie> findCitieByName(String query, Integer idDepartament) {
        
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Citie> cq = cb.createQuery(Citie.class);
        Root<Citie> citie = cq.from(Citie.class);
        
        Predicate restrictions = cb.conjunction();
        
        if(idDepartament != null){
            restrictions = cb.and(restrictions, cb.equal(citie.get(Citie_.departament), new Departament(idDepartament)));
        }
        
        if(query != null){
            restrictions = cb.and(restrictions, cb.like(citie.get(Citie_.name), "%" + query + "%"));
        }
        
        cq.where(restrictions);
        cq.orderBy(cb.asc(citie.get(Citie_.name)));
        TypedQuery<Citie> q = em.createQuery(cq);
        try {
            return q.setMaxResults(10).getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
}

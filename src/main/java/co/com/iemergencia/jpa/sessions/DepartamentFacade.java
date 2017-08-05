/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.iemergencia.jpa.sessions;

import co.com.iemergencia.jpa.entities.Departament;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juan David Martinez
 */
@Stateless
public class DepartamentFacade extends AbstractFacade<Departament> {

    @PersistenceContext(unitName = "co.com.iEmergencia_iEmergencia_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartamentFacade() {
        super(Departament.class);
    }
    
}

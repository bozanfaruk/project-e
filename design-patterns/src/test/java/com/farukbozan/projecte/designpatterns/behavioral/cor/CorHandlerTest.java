package com.farukbozan.projecte.designpatterns.behavioral.cor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CorHandlerTest {

    @Test
    void should_cor() {
        //GIVEN
        CorHandler childDoctor = new ChildDoctor();
        CorHandler cardiacDoctor = new CardiacDoctor();
        CorHandler neurologyDoctor = new NeurologyDoctor();

        childDoctor.setNextCorHandler(cardiacDoctor);
        cardiacDoctor.setNextCorHandler(neurologyDoctor);

        Patient childPatient = new Patient(PatientType.CHILD);
        Patient cardiacPatient = new Patient(PatientType.CARDIAC);
        Patient neurologyPatient = new Patient(PatientType.NEUROLOGY);
        Patient dietPatient = new Patient(PatientType.DIET);

        //WHEN
        boolean childHandled = childDoctor.handle(childPatient);
        boolean cardiacHandled = childDoctor.handle(cardiacPatient);
        boolean neurologyHandled = childDoctor.handle(neurologyPatient);
        boolean dietHandled = childDoctor.handle(dietPatient);

        //THEN
        assertTrue(childHandled);
        assertTrue(cardiacHandled);
        assertTrue(neurologyHandled);
        assertFalse(dietHandled);
    }

}

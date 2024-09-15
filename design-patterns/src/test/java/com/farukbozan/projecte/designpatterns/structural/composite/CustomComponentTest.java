package com.farukbozan.projecte.designpatterns.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomComponentTest {

    @Test
    void should_get_composite_tree() {
        //GIVEN
        CustomComponent windowComponent = new CustomWindowComponent();

        CustomComponent largePanel = new CustomPanelComponent();
        CustomComponent smallPanel = new CustomPanelComponent();
        CustomComponent innerPanel = new CustomPanelComponent();

        CustomComponent blueButton = new CustomButtonComponent();
        CustomComponent redButton = new CustomButtonComponent();

        //WHEN
        innerPanel.addComponent(blueButton);
        smallPanel.addComponent(innerPanel);
        largePanel.addComponent(redButton);
        windowComponent.addComponent(largePanel);
        windowComponent.addComponent(smallPanel);

        //THEN
        assertEquals(2, windowComponent.getBranchSize());
        assertEquals(1, largePanel.getBranchSize());
        assertEquals(1, smallPanel.getBranchSize());
        assertEquals(1, innerPanel.getBranchSize());
    }

}

package com.farukbozan.projecte.designpatterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AbstractFactoryTest {

    @Test
    void should_get_component_factory() {
        //GIVEN
        var ubuntuComponentFactory = UIFactory.getComponentFactory(OSType.UBUNTU);
        var mintComponentFactory = UIFactory.getComponentFactory(OSType.MINT);

        //WHEN
        var ubuntuButton = ubuntuComponentFactory.createButton();
        var ubuntuCheckbox = ubuntuComponentFactory.createdCheckBox();

        var mintButton = mintComponentFactory.createButton();
        var mintCheckbox = mintComponentFactory.createdCheckBox();

        //THEN
        assertInstanceOf(UbuntuButton.class, ubuntuButton);
        assertInstanceOf(UbuntuCheckbox.class, ubuntuCheckbox);
        assertInstanceOf(MintButton.class, mintButton);
        assertInstanceOf(MintCheckbox.class, mintCheckbox);
    }
}

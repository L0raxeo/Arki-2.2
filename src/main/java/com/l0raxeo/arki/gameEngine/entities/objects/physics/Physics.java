package com.l0raxeo.arki.gameEngine.entities.objects.physics;

import com.l0raxeo.arki.gameEngine.utils.VersionInfo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Implements physics into game object, while helping
 * to define all necessary attributes in order to
 * simulate gravity (and physics).
 *
 * @author Lorcan A. Cheng
 */
@VersionInfo(
        version = "2.1",
        releaseDate = "11/24/2021",
        since = "1.0",
        contributors = {
                "Lorcan Andrew Cheng"
        }
)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Physics
{

    float GRAVITATIONAL_ACCELERATION();

    float TERMINAL_VELOCITY();

    float mass();

}

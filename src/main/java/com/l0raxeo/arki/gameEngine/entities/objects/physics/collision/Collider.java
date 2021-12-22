package com.l0raxeo.arki.gameEngine.entities.objects.physics.collision;

import com.l0raxeo.arki.gameEngine.entities.objects.GameObject;
import com.l0raxeo.arki.gameEngine.utils.VersionInfo;

/**
 * Game object represented in the form of a collider.
 * The collider inherits the associated game object
 * as well as additional collision info such as
 * the collision type.
 *
 * @author Lorcan A. Cheng
 */
@VersionInfo(
        version = "2.1",
        releaseDate = "12/20/2021",
        since = "1.0",
        contributors = {
                "Lorcan Andrew Cheng"
        }
)
public class Collider
{

    public enum CollisionType
    {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        UNKNOWN
    }

    /**
     * Type of collision
     */
    public CollisionType type;

    /**
     * Game object being collided with
     */
    public GameObject gameObject;

    public Collider(GameObject gameObject, CollisionType type)
    {
        this.gameObject = gameObject;
        this.type = type;
    }

    // Getters

    public CollisionType getType()
    {
        return type;
    }

    public GameObject getGameObject()
    {
        return gameObject;
    }

}

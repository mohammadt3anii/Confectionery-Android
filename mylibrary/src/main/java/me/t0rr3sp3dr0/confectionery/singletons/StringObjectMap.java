package me.t0rr3sp3dr0.confectionery.singletons;

import java.util.HashMap;

/**
 * A Map<String, Object> singleton helper that allows to pass any object to
 * activities and fragments, even if the objects are not serializable.
 *
 * @author Pedro Tôrres
 */
public final class StringObjectMap extends HashMap<String, Object> {
    private static StringObjectMap ourInstance = new StringObjectMap();

    private StringObjectMap() {
        // Required private constructor
    }

    public static StringObjectMap getInstance() {
        return ourInstance;
    }
}

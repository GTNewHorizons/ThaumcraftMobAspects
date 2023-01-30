package iguanaman.thaumcraftmobaspects;

import java.util.HashMap;
import java.util.Map.Entry;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class ThaumcraftEntity {

    public final String _HEADER = "*****************************************";
    public final String entityName;
    public final String _FOOTER = "*****************************************";
    public final String _COMMENT = "Aspects are in the form aspect : value ";
    public final HashMap<String, Integer> aspects;

    public ThaumcraftEntity(String entityName) {
        this.entityName = entityName;
        this.aspects = new HashMap<String, Integer>(0);
    }

    public ThaumcraftEntity(String entityName, AspectList aspectList) {
        this.entityName = entityName;
        this.aspects = new HashMap<String, Integer>(aspectList.aspects.size());
        for (Entry<Aspect, Integer> entry : aspectList.aspects.entrySet()) {
            this.aspects.put(entry.getKey().getTag(), entry.getValue());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ThaumcraftEntity)) {
            return false;
        }
        return entityName.equals(((ThaumcraftEntity) obj).entityName);
    }

    @Override
    public int hashCode() {
        return entityName.hashCode();
    }
}

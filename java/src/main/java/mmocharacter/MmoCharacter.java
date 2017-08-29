package mmocharacter;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class MmoCharacter {
    private static final int DEFAULT_HITPOINTS = 5;
    private String name;
    private Alignment alignment;
    private int hitPoints = DEFAULT_HITPOINTS;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MmoCharacter that = (MmoCharacter) o;

        return new EqualsBuilder()
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .toHashCode();
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}

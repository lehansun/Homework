package Planes;

import models.MilitaryPlaneType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryPlaneType typeOfMilitaryPlane;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryPlaneType typeOfMilitaryPlane) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.typeOfMilitaryPlane = typeOfMilitaryPlane;
    }

    public MilitaryPlaneType getTypeOfMilitaryPlane() {
        return typeOfMilitaryPlane;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + typeOfMilitaryPlane +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return typeOfMilitaryPlane == that.typeOfMilitaryPlane;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMilitaryPlane);
    }
}

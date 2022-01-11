package org.iesfm.building;

public interface IBuilding {

    void showInfo();

    void showFloorApartments(int floor);

    Apartment getApartment(String door, int floor);

    Owner[] getOwners(String door, int floor);
}

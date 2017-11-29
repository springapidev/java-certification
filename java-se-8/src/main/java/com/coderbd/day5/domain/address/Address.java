package com.coderbd.day5.domain.address;

/**
 *
 * @author Instructor
 */
public class Address {

    private int id;
    private String houseNo;
    private String block;
    private String road;
    private String ps;
    private String districk;
    private AddressType addressType;

    public Address() {
    }

    public Address(int id, String houseNo, String block, String road, String ps, String districk, AddressType addressType) {
        this.id = id;
        this.houseNo = houseNo;
        this.block = block;
        this.road = road;
        this.ps = ps;
        this.districk = districk;
        this.addressType = addressType;
    }

    public int getId() {
        return id;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getBlock() {
        return block;
    }

    public String getRoad() {
        return road;
    }

    public String getPs() {
        return ps;
    }

    public String getDistrick() {
        return districk;
    }

    public AddressType getAddressType() {
        return addressType;
    }

}

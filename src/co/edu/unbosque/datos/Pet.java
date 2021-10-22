package co.edu.unbosque.datos;

public class Pet {

    private String pet_id;
    private String microchip;
    private String name;
    private String species;
    private String race;
    private String size;
    private String sex;
    private String picture;
    private Integer owner_id;

    public Pet(String petId,String microchip, String name, String species,String race,String sex,String size,String picture, Integer owner_id) {
        this.pet_id = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.sex = sex;
        this.size = size;
        this.picture = picture;
        this.owner_id = owner_id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getPet_id() {
        return pet_id;
    }

    public void setPet_id(String pet_id) {
        this.pet_id = pet_id;
    }

    public String getPetId() {
        return pet_id;
    }

    public void setPetId(String petId) {
        this.pet_id = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }
}
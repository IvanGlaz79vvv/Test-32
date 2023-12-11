package org.example;

import java.util.Date;

public class Entity {
    @Override


    /**
    "earth_date":"2015-05-30","rover":{"id":5,"name":"Curiosity","landing_date":"2012-08-06","launch_date":"2011-11-26","status":"active","max_sol":4031,"max_date":"2023-12-08","total_photos":687885,"cameras":[{"name":"FHAZ","full_name":"Front Hazard Avoidance Camera"},{"name":"NAVCAM","full_name":"Navigation Camera"},{"name":"MAST","full_name":"Mast Camera"},{"name":"CHEMCAM","full_name":"Chemistry and Camera Complex"},{"name":"MAHLI","full_name":"Mars Hand Lens Imager"},{"name":"MARDI","full_name":"Mars Descent Imager"},{"name":"RHAZ","full_name":"Rear Hazard Avoidance Camera"}]}},{"id":409065,"sol":1000,"camera":{"id":26,"name":"NAVCAM","rover_id":5,"full_name":"Navigation Camera"},"img_src":"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/ncam/NRB_486270860EDR_F0481570NCAM00323M_.JPG",
     */
    public String toString() {
        return "Entity{" +
                "earth_date=" + earth_date +
                ", rover:{" + rover +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", landing_date=" + landing_date +
                ", launch_datel=" + launch_datel +
                ", status=" + status +
                ", max_sol=" + max_sol +
                ", max_date=" + max_date +
                ", total_photos=" + total_photos +
                ", cameras:[{" + cameras +
                ", name='" + name + '\'' +
                ", full_name='" + full_name + '\'' + "}," +
                ", sol=" + sol +
                ", camera=" + camera +
                ", img_src='" + img_src + '\'' +
                '}';
    }


    Date earth_date;
    Object rover;
    int id;
    String name;
    Date landing_date;
    Date launch_datel;
    Boolean status;
    int max_sol;
    Date max_date;
    int total_photos;
    Object cameras;
    String full_name;
    int sol;
    Object camera;
    String img_src;

    public Entity(Date earth_date, Object rover, int id, String name, Date landing_date, Date launch_datel, Boolean status, int max_sol, Date max_date, int total_photos, Object cameras, String full_name, int sol, Object camera, String img_src) {
        this.earth_date = earth_date;
        this.rover = rover;
        this.id = id;
        this.name = name;
        this.landing_date = landing_date;
        this.launch_datel = launch_datel;
        this.status = status;
        this.max_sol = max_sol;
        this.max_date = max_date;
        this.total_photos = total_photos;
        this.cameras = cameras;
        this.full_name = full_name;
        this.sol = sol;
        this.camera = camera;
        this.img_src = img_src;
    }



    public Date getEarth_date() {
        return earth_date;
    }

    public void setEarth_date(Date earth_date) {
        this.earth_date = earth_date;
    }

    public Object getRover() {
        return rover;
    }

    public void setRover(Object rover) {
        this.rover = rover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLanding_date() {
        return landing_date;
    }

    public void setLanding_date(Date landing_date) {
        this.landing_date = landing_date;
    }

    public Date getLaunch_datel() {
        return launch_datel;
    }

    public void setLaunch_datel(Date launch_datel) {
        this.launch_datel = launch_datel;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getMax_sol() {
        return max_sol;
    }

    public void setMax_sol(int max_sol) {
        this.max_sol = max_sol;
    }

    public Date getMax_date() {
        return max_date;
    }

    public void setMax_date(Date max_date) {
        this.max_date = max_date;
    }

    public int getTotal_photos() {
        return total_photos;
    }

    public void setTotal_photos(int total_photos) {
        this.total_photos = total_photos;
    }

    public Object getCameras() {
        return cameras;
    }

    public void setCameras(Object cameras) {
        this.cameras = cameras;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public Object getCamera() {
        return camera;
    }

    public void setCamera(Object camera) {
        this.camera = camera;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }
}

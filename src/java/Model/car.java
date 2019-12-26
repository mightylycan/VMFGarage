/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class car {

    /**
     * @return the car_pict
     */
    public String getCar_pict() {
        return car_pict;
    }

    /**
     * @param car_pict the car_pict to set
     */
    public void setCar_pict(String car_pict) {
        this.car_pict = car_pict;
    }

    /**
     * @return the car_id
     */
    public int getCar_id() {
        return car_id;
    }

    /**
     * @param car_id the car_id to set
     */
    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    /**
     * @return the car_price
     */
    public int getCar_price() {
        return car_price;
    }

    /**
     * @param car_price the car_price to set
     */
    public void setCar_price(int car_price) {
        this.car_price = car_price;
    }

    /**
     * @return the car_name
     */
    public String getCar_name() {
        return car_name;
    }

    /**
     * @param car_name the car_name to set
     */
    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }
  private int car_id,car_price;
  
  private String car_name,car_pict;
}

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
public class transaction {

    /**
     * @return the checkout_id
     */
    public int getCheckout_id() {
        return checkout_id;
    }

    /**
     * @param checkout_id the checkout_id to set
     */
    public void setCheckout_id(int checkout_id) {
        this.checkout_id = checkout_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the cardname
     */
    public String getCardname() {
        return cardname;
    }

    /**
     * @param cardname the cardname to set
     */
    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    /**
     * @return the expmonth
     */
    public String getExpmonth() {
        return expmonth;
    }

    /**
     * @param expmonth the expmonth to set
     */
    public void setExpmonth(String expmonth) {
        this.expmonth = expmonth;
    }

    /**
     * @return the nocard
     */
    public String getNocard() {
        return nocard;
    }

    /**
     * @param nocard the nocard to set
     */
    public void setNocard(String nocard) {
        this.nocard = nocard;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the expyear
     */
    public String getExpyear() {
        return expyear;
    }

    /**
     * @param expyear the expyear to set
     */
    public void setExpyear(String expyear) {
        this.expyear = expyear;
    }

 String name,email,address,city,product,cardname,expmonth,nocard, quantity,expyear;
   private int checkout_id;
}

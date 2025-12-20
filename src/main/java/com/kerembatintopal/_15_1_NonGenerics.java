package com.kerembatintopal;

import com.kerembatintopal.SpecialColor;

public class _15_1_NonGenerics {

    private String username;
    private String password;

    //Getter and setter
    public String getUsername() {
        return username;

    }

    public void setUsername(String username){
        this.username =username;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    //PSVM
    static void main(){
        _15_1_NonGenerics nonGenerics= new _15_1_NonGenerics();
        nonGenerics.setUsername("KeremBatınTopal");

        System.out.println(SpecialColor.BLUE+nonGenerics.getUsername()+SpecialColor.RESET);
    }
}

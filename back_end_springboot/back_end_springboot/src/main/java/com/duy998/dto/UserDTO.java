package com.duy998.dto;

import com.duy998.entity.ProductEntity;
import com.duy998.entity.RoleEntity;

import java.util.ArrayList;
import java.util.List;

public class UserDTO extends AbstractDTO<UserDTO>{
    private String userName;
    private String passWord;
    private String fullName;
    private int status;;
    private RoleDTO role;
    private List<ProductDTO> products = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }
}

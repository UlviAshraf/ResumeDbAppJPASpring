/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.inter;

import com.company.entity.Country;

import java.util.List;

/**
 * @author UlviAshraf
 */
public interface CountryDaoInter {

    public List<Country> getAll();

    public boolean update(Country country);

    public boolean remove(int id);

    public boolean add(Country country);

    public Country getById(int id);
}
package com.generation.palestra.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.palestra.dao.ManagerDao;
import com.generation.palestra.dao.SchedaDao;
import com.generation.palestra.dao.ClienteDao;


@Service
public class ClienteTest {


    @Autowired
    private SchedaDao schedaDao;

    @Autowired
    private ManagerDao dirigenteDAO;

    //Se voglio che spring chiami un metodo in automatico, il metodo deve essere annotato con @Autowired e deve trovarsi all'interno
    //Di una classe BEAN di spring
     @Autowired
     public void test(){
       System.out.println("-------------------TEST---------------------\n");

       System.out.println(schedaDao.readAll());

          System.out.println("-------------------FINE TEST------------------\n");

     }

}

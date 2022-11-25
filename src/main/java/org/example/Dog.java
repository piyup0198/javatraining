package org.example;

public class Dog extends Animal{
    public String getDoginfo(){   /*public String getAnimalInfo(){    (method overridding)
                                   return "overridding grtAnimalInfo";
                                   } */
        return getAnimalinfo();
    }

}
